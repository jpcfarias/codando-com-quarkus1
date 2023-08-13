package com.aprendendoquarkus.resource;


import java.util.Random;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.aprendendoquarkus.model.Pessoa;
import com.aprendendoquarkus.service.PessoaService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/gerarusuario")
public class PessoaResource {

    @ConfigProperty(name = "X-RapidAPI-Key")
    String xRapidKey;

    @ConfigProperty(name = "X-RapidAPI-Host")
    String xRapidHost;

    @Inject
    @RestClient
    PessoaService usuarioService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoa listar(){
        Random random = new Random();
        return usuarioService.listar(xRapidKey, xRapidHost, (int) random.nextInt(1000 - 1) + 1);
    }
} 
