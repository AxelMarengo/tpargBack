package com.example.demo.Controller;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;
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
@CrossOrigin(origins = "https://argprograma-f2d81.web.app")

public class CPersona {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping ("/persona/new")
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
       
    @GetMapping ("/persona/verlista")
    @ResponseBody
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/persona/veruna")
    public Persona buscarPersona(){
        return persoServ.buscarPersona((long)54);
    }
    
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
            
            
    
    
}
