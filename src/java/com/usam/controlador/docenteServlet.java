/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usam.controlador;

import com.usam.conexion.Conexion;
import com.usam.dao.DocenteDao;
import com.usam.modelo.docenteModelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author lelsu
 */
public class docenteServlet extends HttpServlet {

    RequestDispatcher rd;
    Conexion conn = new Conexion();
    DocenteDao dd = new DocenteDao(conn);
    List<docenteModelo> lista;
    docenteModelo docente;

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
        
        String num =request.getParameter("iddocente");
        int ac = 0;
        if (!num.equals("")) {
            ac = Integer.parseInt(num);
        }
        
        if (ac != 0) {
            docenteModelo dm = new docenteModelo();
            dm.setIddocente(Integer.parseInt(request.getParameter("iddocente")));
            dm.setCodigo_interno(request.getParameter("codigo_interno"));
            dm.setNombre(request.getParameter("primer_nombre"));
            dm.setSegundo_nombre(request.getParameter("segundo_nombre"));
            dm.setTercer_nombre(request.getParameter("tercer_nombre"));
            dm.setApellido(request.getParameter("apellido"));
            dm.setSegundo_apellido(request.getParameter("segundo_apellido"));
            dm.setDireccion(request.getParameter("direccion"));
            dm.setTelefono(request.getParameter("telefono"));
            dm.setEmail(request.getParameter("email"));
            dm.setDui(request.getParameter("dui"));
            dm.setIsss(request.getParameter("isss"));
            dd.updateDocente(dm);

            response.sendRedirect(request.getContextPath() + "/docenteServlet?action=selectall");
        } else {
            docenteModelo dm = new docenteModelo();
            dm.setCodigo_interno(request.getParameter("codigo_interno"));
            dm.setNombre(request.getParameter("primer_nombre"));
            dm.setSegundo_nombre(request.getParameter("segundo_nombre"));
            dm.setTercer_nombre(request.getParameter("tercer_nombre"));
            dm.setApellido(request.getParameter("apellido"));
            dm.setSegundo_apellido(request.getParameter("segundo_apellido"));
            dm.setDireccion(request.getParameter("direccion"));
            dm.setTelefono(request.getParameter("telefono"));
            dm.setEmail(request.getParameter("email"));
            dm.setDui(request.getParameter("dui"));
            dm.setIsss(request.getParameter("isss"));
            dd.insertarDocente(dm);
            response.sendRedirect(request.getContextPath() + "/docenteServlet?action=selectall");
        }
        
    }

    protected void update(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        docenteModelo model = new docenteModelo();
        int ac = Integer.parseInt(request.getParameter("id"));
        docente = dd.selectDocenteById(ac);
        request.setAttribute("docente", docente);

        rd = request.getRequestDispatcher("/insertarDocente.jsp");
        rd.forward(request, response);

    }

    protected void selectAll(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        lista = dd.selectAll();
        if (lista.isEmpty()) {
            System.out.println("lista vacia");
        }

        request.setAttribute("lista", lista);
        rd = request.getRequestDispatcher("/docente.jsp");
        rd.forward(request, response);
    }

    protected void selectById(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*  int id = Integer.parseInt(request.getParameter("iddocente"));
        docenteModelo u = dd.selectById(id);
        request.setAttribute("docente", u);
        rd = request.getRequestDispatcher("/insertarDocente.jsp");
        rd.forward(request, response);
         */
    }
}
