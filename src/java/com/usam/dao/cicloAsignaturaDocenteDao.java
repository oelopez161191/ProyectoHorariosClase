package com.usam.dao;

import com.usam.conexion.Conexion;
import com.usam.modelo.CicloAsignaturaDocenteModelo;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class cicloAsignaturaDocenteDao {

    Conexion cn;

    public cicloAsignaturaDocenteDao(Conexion conn) {
        this.cn = conn;
    }
    
    
    public boolean insertarCicloAsignaturaDocente(CicloAsignaturaDocenteModelo m){
        boolean flag = false;
        
        String sql = "INSERT INTO `dbhorarioclases`.`ciclo_asignatura_docente` (`ciclo_asignatura`, `docente`, `anios_impartiendo`, `inicio_clases`, `fin_calses`) VALUES (?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            
            ps.setInt(1, m.getCiclo_asignatura());
            ps.setInt(2, m.getDocente());
            ps.setInt(3, m.getAnios_impartiendo());
            ps.setDate(4, (Date) m.getInicio_clases());
            ps.setDate(5, (Date) m.getFin_calses());
            ps.executeUpdate();
            flag = true;
            cn.Desconectar();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
        return  flag;
    } 
    
    
    public List<CicloAsignaturaDocenteModelo> selectAll(){
        List<CicloAsignaturaDocenteModelo> lista = new LinkedList<>();
        String sql = "select * from `dbhorarioclases`.`ciclo_asignatura_docente` ";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                CicloAsignaturaDocenteModelo d = new CicloAsignaturaDocenteModelo();
                
                d.setIdCiclo_Asignatura_Docente(rs.getInt("idCiclo_Asignatura_Docente"));
                d.setCiclo_asignatura(rs.getInt("ciclo_asignatura"));
                d.setDocente(rs.getInt("docente"));
                d.setAnios_impartiendo(rs.getInt("anios_impartiendo"));
                d.setInicio_clases(rs.getDate("inicio_clases"));
                d.setFin_calses(rs.getDate("fin_calses"));
                lista.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        
        return lista;
    }
    
    
}
