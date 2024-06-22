package com.proyecto.personal.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicle;

    @ManyToOne
    @JoinColumn(name = "clientid", nullable = false)
    @JsonIgnore
    private Client client;

    @Column(name = "brand", nullable = false, length = 100)
    private String brand;

    @Column(name = "model", nullable = false, length = 100)
    private String model;

    @Column(name = "plate", nullable = false, length = 20)
    private String plate;

    @Column(name = "kilometrage", nullable = false)
    private int kilometrage;


}
