package com.kevinbrendo.uml.umltest.repositories;

import com.kevinbrendo.uml.umltest.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
