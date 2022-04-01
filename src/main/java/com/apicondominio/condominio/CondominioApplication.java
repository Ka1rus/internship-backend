package com.apicondominio.condominio;

import com.apicondominio.condominio.model.entities.TipoDespesa;
import com.apicondominio.condominio.repositories.TipoDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CondominioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CondominioApplication.class, args);
    }

}
