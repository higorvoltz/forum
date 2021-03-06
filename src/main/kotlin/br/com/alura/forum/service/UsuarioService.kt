package br.com.alura.forum.service

import br.com.alura.forum.model.Usuario
import br.com.alura.forum.repository.UsuarioRepository
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.*


@Suppress("DEPRECATION")
@Service
class UsuarioService(private val repository: UsuarioRepository) {


    fun buscarPorId(id: Long): Usuario {
        return repository.getOne(id)
    }
}

