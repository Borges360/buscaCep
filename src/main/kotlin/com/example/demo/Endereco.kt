package com.example.demo

import javax.persistence.*

@Entity
class Endereco {

    @Id
    val cep: String? = null

    val logradouro: String? = null

    val tipoLogradouro: String? = null

    val complemento: String? = null

    val local: String? = null

    @JoinColumn(name = "id_cidade")
    @ManyToOne
    val idCidade: Cidade? = null

    val idBairro: String? = null

}