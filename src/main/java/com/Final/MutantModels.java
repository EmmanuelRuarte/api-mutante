package com.Final;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MutantModels {

    @Id
    @GeneratedValue
    private Long id;
    private String dna;

    public MutantModels() {}

    public MutantModels(String[] dna) {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }
}
