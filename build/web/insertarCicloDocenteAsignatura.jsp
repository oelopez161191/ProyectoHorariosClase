<%-- 
    Document   : insertarDocente
    Created on : 10-22-2021, 12:35:13 AM
    Author     : Alejandra Centeno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>docentes</title>
        <link href="css/materialize.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/icon.css" type="text/css"/>
        <link href="css/materialize.min.css" type="text/css"/>

    </head>
    <body>

        <nav>
            <div class="nav-wrapper" style="background: #01579b">
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a class="" href="cicloAsignatura.jsp">Asignaturas por ciclo</a></li>
                    <li><a class="" href="index.jsp">Horarios Aulas</a></li>
                </ul>
            </div>
        </nav>
        
       <div class="container" style="margin-left: 7%; margin-top: 3%">
            <h3 style=" font-size: medium; color: black">Informacion de Docente y Asignatura</h3>
            <div class="row">
                <form class="col s12" action="AsignaturaDocenteServlet?action=insertar" method="post">
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="ciclo_asignatura" type="text" class="validate" name="ciclo_asignatura">
                            <label class="active" for="ciclo_asignatura">Codigo:</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="docente" type="text" class="validate" name="docente">
                            <label class="active" for="docente">Docente:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="anios_impartiendo" type="text" class="validate" name="anios_impartiendo"">
                            <label class="active" for="anios_impartiendo"">Años impartiendo la materia:</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="inicio_clases" name="inicio_clases" type="text" class="validate">
                            <label class="active" for="inicio_clases">Inicio de clases:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="fin_calses" name="fin_calses" type="text" class="validate">
                            <label class="active" for="fin_calses">Fin de clases:</label>
                        </div>
                    </div>
                    
                    <div>
                            <button class="waves-effect waves-light btn" type="submit"> Enviar </button>
                        </div>
                </form>
            </div>
        </div>
    </body>
</html>
