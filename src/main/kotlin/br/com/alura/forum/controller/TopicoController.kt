package br.com.alura.forum.controller

import br.com.alura.forum.dto.TopicoForm
import br.com.alura.forum.dto.TopicoView
import br.com.alura.forum.service.TopicoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/topicos")
class TopicoController(private val service: TopicoService) {

    @GetMapping
    fun Listar(): List<TopicoView>{
        return service.Listar()
    }

    @GetMapping("/{id}")
    fun retornaTopicoEspecifico(@PathVariable id: Long): TopicoView{
        return service.retornaTopicoEspecifico(id)
    }

    @PostMapping
    fun cadastrar(@RequestBody dto: TopicoForm) {
        service.cadastrar(dto)
    }
}