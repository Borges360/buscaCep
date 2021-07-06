package com.example.demo


import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
class Cidade {

    @Id
    val idCidade: Int? = null

    val uf: String? = null

    val cidade: String? = null

    val codIbge: String? = null

    val area: Double? = null

}