package com.aprendendoquarkus.service;

import java.util.List;
import java.util.Optional;

import com.aprendendoquarkus.model.Usuario;
import com.aprendendoquarkus.repository.UsuarioRepository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioService {

    @Inject
    UsuarioRepository usuarioRepository;

    public void adicionar(Usuario usuario){
        usuario.encripitarsenha(usuario);
        usuario.setRole(validarUsername(usuario.getUsername()));
        usuarioRepository.persist(usuario);
    }
    private static String validarUsername(String username) {
        if(username.equals("admin")){
            return "admin";
        }return "user";
    }
    public List<Usuario> listar(){
        return usuarioRepository.listAll();
    }
    public Optional<Usuario> buscarId(Long id) {
        return usuarioRepository.findByIdOptional(id);
    }
}
