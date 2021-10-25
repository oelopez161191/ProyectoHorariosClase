/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usam.controlador;

import com.usam.conexion.Conexion;
import com.usam.dao.CicloAsignaturaDao;
import com.usam.dao.DocenteDao;
import com.usam.modelo.CicloAsignaturaModelo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alejandra Centeno
 */

public class CicloAsignaturaServlet extends HttpServlet {
    RequestDispatcher rd;
    Conexion conn = new Conexion();
    CicloAsignaturaDao cad = new CicloAsignaturaDao(conn);
    List<CicloAsignaturaModelo> listaCA;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "insertar":
            //    insert(request, response);
                break;
            case "update":
             //   update(request, response);
                break;
            case "selectall":
                selectAll(request, response);
                break;
            case "selectbyid":
            //    selectById(request, response);
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
    
    protected void selectAll(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        listaCA = cad.selectAll();
        if (listaCA.isEmpty()) {
            System.out.println("lista vacia");
        }
        
        request.setAttribute("listaCA", listaCA);
        rd = request.getRequestDispatcher("/cicloAsignatura.jsp");
        rd.forward(request, response);
    }

}
