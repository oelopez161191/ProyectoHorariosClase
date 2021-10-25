/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usam.controlador;

import com.usam.conexion.Conexion;
import com.usam.dao.CicloAsignaturaDao;
import com.usam.dao.DocenteDao;
import com.usam.dao.cicloAsignaturaDocenteDao;
import com.usam.modelo.CicloAsignaturaDocenteModelo;
import com.usam.modelo.CicloAsignaturaModelo;
import com.usam.modelo.docenteModelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AsignaturaDocenteServlet extends HttpServlet {

    RequestDispatcher rd;
    Conexion conn = new Conexion();
    cicloAsignaturaDocenteDao dd = new cicloAsignaturaDocenteDao(conn);
    List<CicloAsignaturaDocenteModelo> lista;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String action = request.getParameter("action");
        switch (action) {
            case "insertar":
                insert(request, response);
                break;
            case "update":
                update(request, response);
                break;
            case "selectall":
                selectAll(request, response);
                break;
            case "selectbyid":
                selectById(request, response);
                break;
        }
           
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    protected void insert(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            CicloAsignaturaDocenteModelo dm = new CicloAsignaturaDocenteModelo();
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            dm.setCiclo_asignatura(Integer.parseInt(request.getParameter("ciclo_asignatura")));
            dm.setDocente(Integer.parseInt(request.getParameter("docente")));
            dm.setAnios_impartiendo(Integer.parseInt(request.getParameter("anios_impartiendo")));
            dm.setInicio_clases(Date.valueOf(request.getParameter("inicio_clases")));
            
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
            String fin = request.getParameter("fin_calses");
            
            if(fin==null || fin.isEmpty()){
                Date fechafin = Date.valueOf(request.getParameter("inicio_clases"));
                calendar.setTime(fechafin);
                calendar.add(Calendar.MONTH, 6);
                String finS = sdf.format(calendar.getTime());
                
                dm.setFin_calses(Date.valueOf(finS));
                
            }
            dm.setFin_calses(Date.valueOf(fin));
            
            dd.insertarCicloAsignaturaDocente(dm);
            
            response.sendRedirect(request.getContextPath() + "/AsignaturaDocenteServlet?action=selectall");
        } catch (Exception ex) {
            Logger.getLogger(AsignaturaDocenteServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    protected void update(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
     /*   CicloAsignaturaDocenteModelo u = new CicloAsignaturaDocenteModelo();
        u.setidCiclo_Asignatura_Docente(Integer.parseInt(request.getParameter("idCiclo_Asignatura_Docente")));
        u.setNombre(request.getParameter("nombre"));
        u.setSegundo_nombre(request.getParameter("segundo_nombre"));
        u.setTercer_nombre(request.getParameter("tercer_nombre"));
        u.setApellido(request.getParameter("apellido"));
        u.setSegundo_apellido(request.getParameter("apellido"));
        u.setDireccion(request.getParameter("direccion"));
        u.setTelefono(request.getParameter("telefono"));
        u.setEmail(request.getParameter("email"));
        u.setDui(request.getParameter("dui"));
        u.setIsss(request.getParameter("isss"));
        dd.update(u);
        response.sendRedirect(request.getContextPath() + "/docente?action=selectall");
        */
    }


    protected void selectAll(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        lista = dd.selectAll();
        if (lista.isEmpty()) {
            System.out.println("lista vacia");
        }
        
        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/docenteAsignatura.jsp");
        rd.forward(request, response);
    }
    
    protected void selectAllCicloAsignatura(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CicloAsignaturaDao ca = new CicloAsignaturaDao(conn);
        List<CicloAsignaturaModelo> listaA;
        
        listaA = ca.selectAll();
        if (listaA.isEmpty()) {
            System.out.println("lista vacia");
        }
    }

    protected void selectById(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       /*  int id = Integer.parseInt(request.getParameter("idciclo_Asignatura_Docente"));
        CicloAsignaturaDocenteModelo u = dd.selectById(id);
        request.setAttribute("CicloAsignaturaDocente", cad);
        rd = request.getRequestDispatcher("/insertarDocenteAsignatura.jsp");
        rd.forward(request, response);
        */
    }

}
