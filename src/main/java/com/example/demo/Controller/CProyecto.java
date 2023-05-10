package com.example.demo.Controller;

import com.example.demo.dto.dtoProyecto;
import com.example.demo.model.Proyecto;
import com.example.demo.service.ProyectoService;
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
@CrossOrigin(origins = "https://argprograma-f2d81.firebaseapp.com/")

public class CProyecto {
    
    @Autowired
    private ProyectoService proyeServ;
    
    @PostMapping ("/proyecto/create")
    public void agregarProyecto(@RequestBody Proyecto proye) {
        proyeServ.save(proye);
    }
    
    @GetMapping("/proyecto/detail/{id}")
    public ResponseEntity<Proyecto> getById(@PathVariable("id")int id){

        
        Proyecto proyecto = proyeServ.getOne(id).get();
        return new ResponseEntity<Proyecto>(proyecto, HttpStatus.OK);
    }
       
    @GetMapping ("/proyecto/verlista")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyeServ.verProyectos();
    }
    
    @DeleteMapping ("/proyecto/delete/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        proyeServ.borrarProyecto(id);
    }
       
    @PutMapping("/proyecto/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoProyecto dtoproyecto){
        
        Proyecto proyecto = proyeServ.getOne(id).get();
        
        proyecto.setNombre(dtoproyecto.getNombre());
        proyecto.setDescripcion(dtoproyecto.getDescripcion());
        
        proyeServ.save(proyecto);
        
        return null;
    }
}
  