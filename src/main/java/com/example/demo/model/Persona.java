package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private String apellido;
    private String img;
    private String descripcion;
    
    public Persona(){
    }    
    
    public Persona(int id, String nombre, String apellido, String img, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.descripcion = descripcion;
    }    
}
