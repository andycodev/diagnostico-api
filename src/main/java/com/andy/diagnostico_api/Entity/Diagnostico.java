package com.andy.diagnostico_api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ordonez_diagnostico")
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_diagnostico")
    private Integer cdDiagnostico;

    @Column(name = "ds_diagnostico")
    private String dsDiagnostico;

    @Column(name = "tp_diagnostico")
    private Character tpDiagnostico;

    public Integer getCdDiagnostico() {
        return cdDiagnostico;
    }

    public void setCdDiagnostico(Integer cdDiagnostico) {
        this.cdDiagnostico = cdDiagnostico;
    }

    public String getDsDiagnostico() {
        return dsDiagnostico;
    }

    public void setDsDiagnostico(String dsDiagnostico) {
        this.dsDiagnostico = dsDiagnostico;
    }

    public Character getTpDiagnostico() {
        return tpDiagnostico;
    }

    public void setTpDiagnostico(Character tpDiagnostico) {
        this.tpDiagnostico = tpDiagnostico;
    }
}
