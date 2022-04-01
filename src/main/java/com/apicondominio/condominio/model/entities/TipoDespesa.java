package com.apicondominio.condominio.model.entities;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_despesa")
public class TipoDespesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoDespesa;
    @Column(nullable = true)
    private String nomeTipoDespesa;
    @Column(nullable = true)
    private String  obsTipoDespesa;

    public TipoDespesa() {}

    public TipoDespesa(Integer idTipoDespesa, String nomeTipoDespesa, String obsTipoDespesa) {
        this.idTipoDespesa = idTipoDespesa;
        this.nomeTipoDespesa = nomeTipoDespesa;
        this.obsTipoDespesa = obsTipoDespesa;
    }

    public Integer getIdTipoDespesa() {
        return idTipoDespesa;
    }

    public void setIdTipoDespesa(Integer idTipoDespesa) {
        this.idTipoDespesa = idTipoDespesa;
    }

    public String getNomeTipoDespesa() {
        return nomeTipoDespesa;
    }

    public void setNomeTipoDespesa(String nomeTipoDespesa) {
        this.nomeTipoDespesa = nomeTipoDespesa;
    }

    public String getObsTipoDespesa() {
        return obsTipoDespesa;
    }

    public void setObsTipoDespesa(String obsTipoDespesa) {
        this.obsTipoDespesa = obsTipoDespesa;
    }
}