package com.example.demo.Controller;

import com.example.demo.dto.dtoSkill;
import com.example.demo.model.Skill;
import com.example.demo.service.SkillService;
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

public class CSkill {
    
    @Autowired
    private SkillService skillServ;
    
    @PostMapping ("/skill/create")
    public void agregarSkill(@RequestBody Skill skill) {
        skillServ.save(skill);
    }
    
    @GetMapping("/skill/detail/{id}")
    public ResponseEntity<Skill> getById(@PathVariable("id")int id){

        
        Skill skill = skillServ.getOne(id).get();
        return new ResponseEntity<Skill>(skill, HttpStatus.OK);
    }
       
    @GetMapping ("/skill/verlista")
    @ResponseBody
    public List<Skill> verSkills(){
        return skillServ.verSkills();
    }
    
    @DeleteMapping ("/skill/delete/{id}")
    public void borrarSkill (@PathVariable Long id) {
        skillServ.borrarSkill(id);
    }
       
    @PutMapping("/skill/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkill dtoskill){
        
        Skill skill = skillServ.getOne(id).get();
        
        skill.setNombre(dtoskill.getNombre());
        skill.setDescripcion(dtoskill.getDescripcion());
        
        skillServ.save(skill);
        
        return null;
    }
}
  