package com.kevinbrendo.uml.umltest.repositories;

import com.kevinbrendo.uml.umltest.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
