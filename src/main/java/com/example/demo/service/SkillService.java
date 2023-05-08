package com.example.demo.service;

import com.example.demo.model.Skill;
import com.example.demo.repository.SkillRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService {

    @Autowired
    SkillRepository skillRepo;

    public List<Skill> verSkills() {
        return skillRepo.findAll();
    }

    public Optional<Skill> getOne(long id) {
        return skillRepo.findById(id);
    }

    public void save(Skill edu) {
        skillRepo.save(edu);
    }

    public void borrarSkill(Long id) {
        skillRepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return skillRepo.existsById(id);
    }

}
