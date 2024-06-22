package com.proyecto.personal.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClient")
    private Long idClient;

    @Column(name = "names", nullable = false, length = 100)
    private String names;

    @Column(name = "lastnames", nullable = false, length = 100)
    private String lastnames;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "passwordd", nullable = false, length = 100)
    private String passwordd;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Vehicle> vehicle = new ArrayList<>();

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Shopping> shopping = new ArrayList<>();
}
