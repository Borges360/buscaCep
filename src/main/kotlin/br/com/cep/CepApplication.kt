package br.com.cep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CepApplication

fun main(args: Array<String>) {
	runApplication<CepApplication>(*args)
}
