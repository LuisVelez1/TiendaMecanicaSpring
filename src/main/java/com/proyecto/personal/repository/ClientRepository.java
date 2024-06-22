package com.proyecto.personal.repository;

import com.proyecto.personal.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Procedure(name = "register_client")
    void registerClient(String c_names, String c_lastnames, String c_email, String c_passwordd);
}
