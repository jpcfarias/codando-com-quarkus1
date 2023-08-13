package com.aprendendoquarkus.resource;

import java.util.List;
import java.util.Optional;

import com.aprendendoquarkus.model.Usuario;
import com.aprendendoquarkus.service.UsuarioService;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/usuario")
public class UsuarioResource {
    
    @Inject
    UsuarioService usuarioService;

    @POST
    @Path("cadastro")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuario usuario){
        usuarioService.adicionar(usuario);
    }

    @GET
    @Path("buscar/listar")
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarUsuarios(/* @PathParam("id") String id */){
        return usuarioService.listar();
    }

    @GET
    @Path("buscar/{id}")
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public Optional<Usuario> buscarUsuarioPorId(@PathParam("id") Long id){
        return usuarioService.buscarId(id);
    }
}
