package com.proyecto.personal.persistence.impl;

import com.proyecto.personal.entities.Client;
import com.proyecto.personal.persistence.IClientDAO;
import com.proyecto.personal.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IClientDAOImpl implements IClientDAO {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void save(Client client){
        clientRepository.save(client);
    }
}
