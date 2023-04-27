package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
        
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private String descripcion;
    
    public Educacion(){
    }    
    
    public Educacion(int id,String nombre,String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }    
}
