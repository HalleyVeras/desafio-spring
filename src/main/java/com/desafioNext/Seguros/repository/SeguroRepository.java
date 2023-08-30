package com.desafioNext.Seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.desafioNext.Seguros.model.Seguro;

@Repository
public interface SeguroRepository extends JpaRepository<Seguro, Long> {
    
}
