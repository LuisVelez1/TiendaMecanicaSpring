package com.proyecto.personal.controllers;

import com.proyecto.personal.controllers.dto.ClientDTO;
import com.proyecto.personal.entities.Client;
import com.proyecto.personal.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private IClientService clientService;

    @PostMapping("register")
    public ResponseEntity<?> save(@RequestBody ClientDTO clientDTO) throws URISyntaxException {
        if(clientDTO.getNames().isBlank()){
            ResponseEntity.badRequest().build();
        }

        clientService.save(Client.builder()
                        .names(clientDTO.getNames())
                        .lastnames(clientDTO.getLastnames())
                        .email(clientDTO.getEmail())
                        .password(clientDTO.getPassword())
                        .build());
        return ResponseEntity.created(new URI("api/client/register")).build();
    }
    
}
