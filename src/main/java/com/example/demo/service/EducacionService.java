package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository eduRepo;
    
    public List<Educacion> verEducaciones() {
        return eduRepo.findAll();
    }
    
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
    }

    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

}
