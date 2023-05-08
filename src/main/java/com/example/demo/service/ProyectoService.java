package com.example.demo.service;

import com.example.demo.model.Proyecto;
import com.example.demo.repository.ProyectoRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService {

    @Autowired
    ProyectoRepository proyeRepo;

    public List<Proyecto> verProyectos() {
        return proyeRepo.findAll();
    }

    public Optional<Proyecto> getOne(long id) {
        return proyeRepo.findById(id);
    }

    public void save(Proyecto edu) {
        proyeRepo.save(edu);
    }

    public void borrarProyecto(Long id) {
        proyeRepo.deleteById(id);
    }

    public boolean existsById(long id) {
        return proyeRepo.existsById(id);
    }

}
