package br.com.cep


import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Cidade {

    @Id
    val idCidade: Int? = null

    val uf: String? = null

    val cidade: String? = null

    val codIbge: String? = null

    val area: Double? = null

}