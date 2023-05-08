package com.example.demo.Controller;

import com.example.demo.dto.dtoExperiencia;
import com.example.demo.model.Experiencia;
import com.example.demo.service.ExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class CExperiencia {
   
    @Autowired
    private ExperienciaService expServ;
    
    @PostMapping ("/experiencia/create")
    public void agregarEducacion(@RequestBody Experiencia exp) {
        expServ.save(exp);
    }
    
    @GetMapping("/experiencia/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id")int id){

        
        Experiencia experiencia = expServ.getOne(id).get();
        return new ResponseEntity<Experiencia>(experiencia, HttpStatus.OK);
    }
       
    @GetMapping ("/experiencia/verlista")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.verExperiencias();
    }
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }
       
    @PutMapping("/experiencia/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexperiencia){
        
        Experiencia experiencia = expServ.getOne(id).get();
        
        experiencia.setNombre(dtoexperiencia.getNombre());
        experiencia.setDescripcion(dtoexperiencia.getDescripcion());
        
        expServ.save(experiencia);
        
        return null;
    }
}
        
       
        

