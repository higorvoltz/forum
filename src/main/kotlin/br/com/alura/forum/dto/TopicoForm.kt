package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class TopicoForm(
    @field:NotEmpty
    @field:Size(min = 1, max = 100)
    val titulo: String,
    @field:NotEmpty
    @field:Size(min = 1)
    val mensagem: String,
    @field:NotNull
    val idCurso: Long,
    @field:NotNull
    val idAutor: Long
)
