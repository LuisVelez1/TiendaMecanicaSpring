package com.proyecto.personal.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "shoppings")
public class Shopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idShopping;

    @ManyToOne
    @JoinColumn(name = "clientId", referencedColumnName = "idClient")
    private Client client;

    @ManyToMany(mappedBy = "shoppings")
    private List<Product> products = new ArrayList<>();

    @Column(name = "cantity", nullable = false)
    private int cantity;

    @Column(name = "shopping_date", nullable = false)
    private LocalDateTime shoppingDate;
}
