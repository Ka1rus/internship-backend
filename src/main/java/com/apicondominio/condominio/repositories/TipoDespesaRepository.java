package com.apicondominio.condominio.repositories;

import com.apicondominio.condominio.model.entities.TipoDespesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDespesaRepository extends JpaRepository<TipoDespesa, Integer> {

}
