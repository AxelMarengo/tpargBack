package com.example.demo.Controller;

import com.example.demo.dto.dtoEducacion;
import com.example.demo.model.Educacion;
import com.example.demo.service.EducacionService;
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
@CrossOrigin(origins = "https://argprograma-f2d81.firebaseapp.com")

public class CEducacion {
    
    @Autowired
    private EducacionService eduServ;
    
    @PostMapping ("/educacion/create")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.save(edu);
    }
    
    @GetMapping("/educacion/detail/{id}")
    public ResponseEntity<Educacion> getById(@PathVariable("id")int id){

        
        Educacion educacion = eduServ.getOne(id).get();
        return new ResponseEntity<Educacion>(educacion, HttpStatus.OK);
    }
       
    @GetMapping ("/educacion/verlista")
    @ResponseBody
    public List<Educacion> verEducaciones(){
        return eduServ.verEducaciones();
    }
    
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
       
    @PutMapping("/educacion/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoeducacion){
        
        Educacion educacion = eduServ.getOne(id).get();
        
        educacion.setNombre(dtoeducacion.getNombre());
        educacion.setDescripcion(dtoeducacion.getDescripcion());
        
        eduServ.save(educacion);
        
        return null;
    }
}
        
       
        

