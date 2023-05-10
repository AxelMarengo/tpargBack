package com.example.demo.dto;

public class dtoSkill {
    
    private String nombre;

    private int descripcion;

    public dtoSkill() {
    }

    public dtoSkill(String nombre, int descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
