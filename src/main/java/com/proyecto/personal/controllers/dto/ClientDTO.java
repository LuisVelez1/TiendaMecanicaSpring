package com.proyecto.personal.controllers.dto;

import com.proyecto.personal.entities.Shopping;
import com.proyecto.personal.entities.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

    private Long idClient;
    private String names;
    private String lastnames;
    private String email;
    private String password;
    private List<Vehicle> vehicle = new ArrayList<>();
    private List<Shopping> shopping = new ArrayList<>();
}
