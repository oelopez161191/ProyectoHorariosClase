package com.usam.modelo;

import java.util.Date;

public class CicloAsignaturaDocenteModelo {

    int idCiclo_Asignatura_Docente;
    int ciclo_asignatura;
    int docente;
    int anios_impartiendo;
    Date inicio_clases;
    Date fin_calses;
    
    docenteModelo codigo_docente;
    

    public int getIdCiclo_Asignatura_Docente() {
        return idCiclo_Asignatura_Docente;
    }

    public void setIdCiclo_Asignatura_Docente(int idCiclo_Asignatura_Docente) {
        this.idCiclo_Asignatura_Docente = idCiclo_Asignatura_Docente;
    }

    public int getCiclo_asignatura() {
        return ciclo_asignatura;
    }

    public void setCiclo_asignatura(int ciclo_asignatura) {
        this.ciclo_asignatura = ciclo_asignatura;
    }

    public int getDocente() {
        return docente;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }

    public int getAnios_impartiendo() {
        return anios_impartiendo;
    }

    public void setAnios_impartiendo(int anios_impartiendo) {
        this.anios_impartiendo = anios_impartiendo;
    }

    public Date getInicio_clases() {
        return inicio_clases;
    }

    public void setInicio_clases(Date inicio_clases) {
        this.inicio_clases = inicio_clases;
    }

    public Date getFin_calses() {
        return fin_calses;
    }

    public void setFin_calses(Date fin_calses) {
        this.fin_calses = fin_calses;
    }

}
