package com.example.demo.service;

import com.example.demo.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencias ();
    
    public void crearExperiencia (Experiencia per);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia buscarExperiencia (Long id);
}
