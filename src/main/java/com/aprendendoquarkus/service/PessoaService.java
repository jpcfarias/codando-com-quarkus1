package com.aprendendoquarkus.service;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.aprendendoquarkus.model.Pessoa;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;


@RegisterRestClient(configKey = "gerador-usuario")
@Produces(MediaType.APPLICATION_JSON)
public interface PessoaService {
    
    @GET
    @Path("/users/find_one")
    Pessoa listar(@HeaderParam("X-RapidAPI-Key") String xRapidKey,
                        @HeaderParam("X-RapidAPI-Host") String xRapidHost,
                        /* @QueryParam("limit") int limite,
                        @QueryParam("gender") int genero, */
                        @QueryParam("id") int id);
}
