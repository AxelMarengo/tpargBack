package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String datos;
    
    public Experiencia(){
    }    
    
    public Experiencia(Long id, String datos){
        this.id = id;
        this.datos = datos;
    }    
}
