
package com.usam.modelo;

public class CicloAsignaturaModelo {
    
    int idCiclo_Asignatura;
    int ciclo;
    int asinatura;
    
    cicloModelo cod_ciclo;
    AsignaturaModelo cod_asignatura;

    public int getIdCiclo_Asignatura() {
        return idCiclo_Asignatura;
    }

    public void setIdCiclo_Asignatura(int idCiclo_Asignatura) {
        this.idCiclo_Asignatura = idCiclo_Asignatura;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getAsinatura() {
        return asinatura;
    }

    public void setAsinatura(int asinatura) {
        this.asinatura = asinatura;
    }

    public cicloModelo getCod_ciclo() {
        return cod_ciclo;
    }

    public void setCod_ciclo(cicloModelo cod_ciclo) {
        this.cod_ciclo = cod_ciclo;
    }

    public AsignaturaModelo getCod_asignatura() {
        return cod_asignatura;
    }

    public void setCod_asignatura(AsignaturaModelo cod_asignatura) {
        this.cod_asignatura = cod_asignatura;
    }
    
}
