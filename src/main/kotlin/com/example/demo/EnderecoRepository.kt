package com.example.demo

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EnderecoRespository : CrudRepository<Endereco, String> {

    fun findByCep(cep: String): Endereco

}