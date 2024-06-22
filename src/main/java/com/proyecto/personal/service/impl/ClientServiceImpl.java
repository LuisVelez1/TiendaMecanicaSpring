package com.proyecto.personal.service.impl;


import com.proyecto.personal.entities.Client;
import com.proyecto.personal.persistence.IClientDAO;
import com.proyecto.personal.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientDAO clientDAO;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void save(Client client) {
        //Hasheo de contraseña con BCrypt
        String hashedPassword = passwordEncoder.encode(client.getPassword());
        //Se actualiza la contraseña hasheada
        client.setPassword(hashedPassword);
        clientDAO.save(client);
    }
}
