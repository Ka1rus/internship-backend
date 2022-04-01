package com.apicondominio.condominio.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idDespesa;
    @Column(nullable = false)
    private LocalDate dataReferencia;
    @Column(nullable = false)
    private String nomeDespesa;
    @Column(nullable = false)
    private Double valor;
    @Column(nullable = false)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_tipo_despesa")
    private TipoDespesa tipoDespesas;

    public Despesa() {}

    public Despesa(LocalDate dataReferencia, String nomeDespesa, Double valor, String descricao, TipoDespesa tipoDespesas) {
        this.dataReferencia = dataReferencia;
        this.nomeDespesa = nomeDespesa;
        this.valor = valor;
        this.descricao = descricao;
        this.tipoDespesas = tipoDespesas;
    }
}
