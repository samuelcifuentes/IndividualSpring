package org.example.introspringbootaplication.service;

import org.example.introspringbootaplication.entity.Profesor;
import org.example.introspringbootaplication.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Profesor> getAllProfesores() {
        return profesorRepository.findAll();
    }

    public Optional<Profesor> getProfesorById(Long id) {
        return profesorRepository.findById(id);
    }

    public Profesor saveProfesor(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Profesor updateProfesor(Long id, Profesor profesorDetails) {
        Profesor profesor = profesorRepository.findById(id).orElseThrow(() -> new RuntimeException("Profesor not found for this id :: " + id));
        profesor.setName(profesorDetails.getName());
        return profesorRepository.save(profesor);
    }

    public void deleteProfesor(Long id) {
        Profesor profesor = profesorRepository.findById(id).orElseThrow(() -> new RuntimeException("Profesor not found for this id :: " + id));
        profesorRepository.delete(profesor);
    }
}
