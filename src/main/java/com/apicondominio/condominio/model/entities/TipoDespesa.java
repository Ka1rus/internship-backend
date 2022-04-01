package com.apicondominio.condominio.model.entities;

import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_despesa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoDespesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idTipoDespesa;
    @Column(nullable = true)
    private String nomeTipoDespesa;
    @Column(nullable = true)
    private String  obsTipoDespesa;

}