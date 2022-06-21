package br.com.alura.forum.dto

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

data class AtualizaTopicoForm(
    @field:NotNull
    val id: Long,
    @field:NotEmpty
    @Size(min = 1, max = 100)
    val titulo: String,
    @field:NotEmpty
    @Size(min = 1)
    val mensagem: String
)