package com.example.demo.Controller;

import com.example.demo.model.Educacion;
import com.example.demo.service.EducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CEducacion {
    
    @Autowired
    private EducacionService eduServ;
    
    @PostMapping ("/educacion/new")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
       
    @GetMapping ("/educacion/verlista")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @GetMapping ("/educacion/veruna")
    public Educacion buscarEducacion(){
        return eduServ.buscarEducacion((long)1);
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
       
}
