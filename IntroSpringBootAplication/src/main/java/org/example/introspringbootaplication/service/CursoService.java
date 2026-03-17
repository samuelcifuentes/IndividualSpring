package org.example.introspringbootaplication.service;

import org.example.introspringbootaplication.entity.Curso;
import org.example.introspringbootaplication.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Optional<Curso> getCursoById(Long id) {
        return cursoRepository.findById(id);
    }

    public Curso saveCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso updateCurso(Long id, Curso cursoDetails) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso not found for this id :: " + id));
        curso.setName(cursoDetails.getName());
        curso.setProgram(cursoDetails.getProgram());
        return cursoRepository.save(curso);
    }

    public void deleteCurso(Long id) {
        Curso curso = cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso not found for this id :: " + id));
        cursoRepository.delete(curso);
    }
}
