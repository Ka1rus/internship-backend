package com.apicondominio.condominio.services;

import com.apicondominio.condominio.model.entities.TipoDespesa;
import com.apicondominio.condominio.repositories.TipoDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDespesaService {

    @Autowired
    private TipoDespesaRepository tipoDespesaRepository;

    public List<TipoDespesa> findAll() {
        return tipoDespesaRepository.findAll();
    }

    public Optional<TipoDespesa> findById(Integer id) {
        return tipoDespesaRepository.findById(id);
    }

    public TipoDespesa create(TipoDespesa tipoDespesa) {
        return tipoDespesaRepository.save(tipoDespesa);
    }

    public void delete(TipoDespesa tipoDespesa) {
        tipoDespesaRepository.delete(tipoDespesa);
    }


}
