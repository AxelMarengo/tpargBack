package com.example.demo.service;

import com.example.demo.model.Experiencia;
import com.example.demo.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {

    @Autowired
    ExperienciaRepository ExpRepo;

    public List<Experiencia> verExperiencias() {
        return ExpRepo.findAll();
    }

    public Optional<Experiencia> getOne(long id) {
        return ExpRepo.findById(id);
    }

    public void save(Experiencia exp) {
        ExpRepo.save(exp);
    }

    public void borrarExperiencia(Long id) {
        ExpRepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return ExpRepo.existsById(id);
    }

}
