package com.example.demo.service;

import com.example.demo.model.Educacion;
import com.example.demo.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
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

    public Optional<Educacion> getOne(long id) {
        return eduRepo.findById(id);
    }

    public void save(Educacion edu) {
        eduRepo.save(edu);
    }

    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }


    public boolean existsById(long id) {
        return eduRepo.existsById(id);
    }

}
