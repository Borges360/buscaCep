package com.example.demo

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.MediaType;


@RestController
@RequestMapping("busca-cep/v1")
class EnderecoController {

    @Autowired
    lateinit var enderecoRepository: EnderecoRespository

    @GetMapping("consulta-cep/{cep}")
    fun buscaCep(@PathVariable("cep") cep: String): Endereco {
        return enderecoRepository.findByCep(cep)
    }

}


