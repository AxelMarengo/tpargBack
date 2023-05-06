package com.example.demo.model;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter @Setter
@Entity

public class Experiencia {
            
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    private String nombre;
    private String descripcion;
    
    public Experiencia(){
    }    
    
    public Experiencia(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
