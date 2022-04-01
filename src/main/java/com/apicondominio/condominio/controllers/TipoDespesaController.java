package com.apicondominio.condominio.controllers;

import com.apicondominio.condominio.model.entities.TipoDespesa;
import com.apicondominio.condominio.repositories.TipoDespesaRepository;
import com.apicondominio.condominio.services.TipoDespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@RequestMapping("api/tipo_despesa")
public class TipoDespesaController {

    @Autowired
    private TipoDespesaService tipoDespesaService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<TipoDespesa> findById(@PathVariable Integer id) {
        return tipoDespesaService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TipoDespesa create(@RequestBody TipoDespesa tipoDespesa){
        return tipoDespesaService.create(tipoDespesa);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id, @RequestBody TipoDespesa tipoDespesa) {
        tipoDespesaService.findById(id).
                map(delete -> {
                    tipoDespesaService.delete(tipoDespesa);
                    return null;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id não encontrado"));
    }



}
