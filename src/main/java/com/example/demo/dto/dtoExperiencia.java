
package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class dtoExperiencia {

    private String nombreE;

    private String descripcionE;

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
    
    
}
