package com.kevinbrendo.uml.umltest.services;

import com.kevinbrendo.uml.umltest.domain.Categoria;
import com.kevinbrendo.uml.umltest.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    public CategoriaRepository repo;


    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElse(null);
    }

}
