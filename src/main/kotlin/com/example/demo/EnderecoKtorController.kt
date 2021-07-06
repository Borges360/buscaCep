package com.example.demo

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.springframework.beans.factory.annotation.Autowired

    @Autowired
    lateinit var enderecoRepository: EnderecoRespository

    fun Route.buscaCep() {
        route("ktor/consulta-cep"){
            get("{cep}") {
                val cep = call.parameters["cep"] ?: return@get call.respondText(
                    "Missing or malformed cep",
                    status = HttpStatusCode.BadRequest
                )
                val endereco = enderecoRepository.findByCep(cep)
                call.respond(endereco)
            }
        }
    }
