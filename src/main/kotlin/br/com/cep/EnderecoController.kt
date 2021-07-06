package br.com.cep

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


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


