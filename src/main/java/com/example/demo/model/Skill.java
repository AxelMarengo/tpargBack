package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private int descripcion;
    
    public Skill(){
    }    
    
    public Skill(String nombre,int descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }    
}
