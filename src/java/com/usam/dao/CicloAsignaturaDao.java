/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usam.dao;

import com.usam.conexion.Conexion;
import com.usam.modelo.docenteModelo;
import com.usam.modelo.AsignaturaModelo;
import com.usam.modelo.CicloAsignaturaModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alejandra Centeno
 */
public class CicloAsignaturaDao {
    
     Conexion cn;
    
    public CicloAsignaturaDao(Conexion conn){
        this.cn = conn;
    }
    
    public List<CicloAsignaturaModelo> selectAll(){
        List<CicloAsignaturaModelo> listaCA = new LinkedList<>();
        String sql = "Select * from `dbhorarioclases`.`ciclo_asignatura_docente`";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                CicloAsignaturaModelo da = new CicloAsignaturaModelo();
                da.setIdCiclo_Asignatura(rs.getInt("idCiclo_Asignatura"));
                da.setCiclo(rs.getInt("ciclo"));
                da.setAsinatura(rs.getInt("asignatura"));
                listaCA.add(da);
            }
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        return listaCA;
    }
}
