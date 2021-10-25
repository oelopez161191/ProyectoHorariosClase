package com.usam.dao;

import com.usam.conexion.Conexion;
import com.usam.modelo.docenteModelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

public class DocenteDao {
    Conexion cn;
    
    public DocenteDao(Conexion conn){
        this.cn = conn;
    }
    
    public boolean insertarDocente(docenteModelo docente){
        boolean flag = false;
        
        String sql = "INSERT INTO `dbhorarioclases`.`docente` (`codigo_interno`, `nombre`, `segundo_nombre`, `tercer_nombre`, `apellido`, `segundo_Apellido`, `direccion`, `telefono`, `email`, `dui`, `isss`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ps.setString(1, docente.getCodigo_interno());
            ps.setString(2, docente.getNombre());
            ps.setString(3, docente.getSegundo_nombre());
            ps.setString(4, docente.getTercer_nombre());
            ps.setString(5, docente.getApellido());
            ps.setString(6, docente.getSegundo_apellido());
            ps.setString(7, docente.getDireccion());
            ps.setString(8, docente.getTelefono());
            ps.setString(9, docente.getEmail());
            ps.setString(10, docente.getDui());
            ps.setString(11, docente.getIsss());
            ps.executeUpdate();
            flag = true;
            //cn.Desconectar();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return flag;
    }
    
    public List<docenteModelo> selectAll(){
        List<docenteModelo> lista = new LinkedList<>();
        String sql = "Select * from `dbhorarioclases`.`docente`";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                docenteModelo d = new docenteModelo();
                d.setIddocente(rs.getInt("iddocente"));
                d.setCodigo_interno(rs.getString("codigo_interno"));
                d.setNombre(rs.getString("nombre"));
                d.setSegundo_nombre(rs.getString("segundo_nombre"));
                d.setTercer_nombre(rs.getString("tercer_nombre"));
                d.setApellido(rs.getString("apellido"));
                d.setSegundo_apellido(rs.getString("segundo_apellido"));
                d.setDireccion(rs.getString("direccion"));
                d.setTelefono(rs.getString("telefono"));
                d.setEmail(rs.getString("email"));
                d.setDui(rs.getString("dui"));
                d.setIsss(rs.getString("isss"));
                lista.add(d);
            }
            //cn.Desconectar();
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }
        return lista;
    }
    
    public docenteModelo selectDocenteById(int id){
        docenteModelo d = new docenteModelo();
        String sql = "Select * from docente where iddocente = ?";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                d.setIddocente(rs.getInt("iddocente"));
                d.setCodigo_interno(rs.getString("codigo_interno"));
                d.setNombre(rs.getString("nombre"));
                d.setSegundo_nombre(rs.getString("segundo_nombre"));
                d.setTercer_nombre(rs.getString("tercer_nombre"));
                d.setApellido(rs.getString("apellido"));
                d.setSegundo_apellido(rs.getString("segundo_apellido"));
                d.setDireccion(rs.getString("direccion"));
                d.setEmail(rs.getString("email"));
                d.setDui(rs.getString("dui"));
                d.setIsss(rs.getString("isss"));
            }
            
        } catch (Exception e) {
        }
        
        return d;
    }
    
    
    
    public boolean updateDocente(docenteModelo docente){
        boolean flag = false;
        
        String sql = "UPDATE `dbhorarioclases`.`docente` SET `codigo_interno` = ?,`nombre` = ?, "
                + "`segundo_nombre` = ?, `tercer_nombre` = ?, `apellido` = ?, "
                + "`segundo_Apellido` = ?, `direccion` = ?, `telefono` = ?, "
                + "`email` = ?, `dui` = ?, `isss` = ? WHERE (`iddocente` = ?);";
        
        try {
            PreparedStatement ps = cn.Conectar().prepareStatement(sql);
            ps.setString(1, docente.getCodigo_interno());
            ps.setString(2, docente.getNombre());
            ps.setString(3, docente.getSegundo_nombre());
            ps.setString(4, docente.getTercer_nombre());
            ps.setString(5, docente.getApellido());
            ps.setString(6, docente.getSegundo_apellido());
            ps.setString(7, docente.getDireccion());
            ps.setString(8, docente.getTelefono());
            ps.setString(9, docente.getEmail());
            ps.setString(10, docente.getDui());
            ps.setString(11, docente.getIsss());
            ps.setInt(12, docente.getIddocente());
            ps.executeUpdate();
            flag = true;
            //cn.Desconectar();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        return flag;
    }
    
    
}
