package com.desafioNext.Seguros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.desafioNext.Seguros.model.Casa;

@Repository
public interface CasaRepository extends JpaRepository<Casa, Long> {
    
}
