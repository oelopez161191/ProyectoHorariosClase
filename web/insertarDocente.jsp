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
            <h3 style=" font-size: medium; color: black">Informacion de Docente</h3>
            <div class="row">
                <form class="col s12" action="docenteServlet?action=insertar" method="post">
                    <div class="row">
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="iddocente" id="iddocente" value="<c:out value="${docente.iddocente}"/>" readonly >
                            <label class="active" >ID:</label>
                        </div>
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="codigo_interno" id="codigo_interno" value="<c:out value="${docente.codigo_interno}"/>" >
                            <label class="active" >Codigo Interno:</label>
                        </div>
                        <div class="input-field col s6">
                            <input  type="text" class="validate" name="primer_nombre" id="primer_nombre" value="<c:out value="${docente.nombre}"/>">
                            <label class="active" >Primer Nombre:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="segundo_nombre" id="segundo_nombre"  value="<c:out value="${docente.segundo_nombre}"/>">
                            <label class="active" >Segundo Nombre:</label>
                        </div>
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="tercer_nombre" id="tercer_nombre"  value="<c:out value="${docente.tercer_nombre}"/>">
                            <label class="active" >Tercer Nombre:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="apellido" id="apellido"  value="<c:out value="${docente.apellido}"/>">
                            <label class="active" >Primer apellido:</label>
                        </div>
                        <div class="input-field col s6">
                            <input  type="text" class="validate" name="segundo_apellido" id="segundo_apellido"  value="<c:out value="${docente.segundo_apellido}"/>">
                            <label class="active" >Segundo apellido:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input  type="text" class="validate" name="direccion" id="direccions"  value="<c:out value="${docente.direccion}"/>">
                            <label class="active" >Dirección:</label>
                        </div>
                        <div class="input-field col s6">
                            <input  type="text" class="validate" name="telefono" id="telefono" value="<c:out value="${docente.telefono}"/>">
                            <label class="active" >Telefono:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input  type="text" class="validate" id="email" name="email"  value="<c:out value="${docente.email}"/>">
                            <label class="active" >e-mail:</label>
                        </div>
                        <div class="input-field col s6">
                            <input type="text" class="validate" id="dui" name="dui"  value="<c:out value="${docente.dui}"/>">
                            <label class="active" >DUI:</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="last_name" type="text" class="validate" id="isss" name="isss"  value="<c:out value="${docente.isss}"/>">
                            <label class="active" >ISSS:</label>
                        </div>
                        <div class="input-field col s6">
                        </div>
                    </div>
                    
                    <div class="input-field col s6">
                            <button class="waves-effect waves-light btn" type="submit"> Enviar </button>
                        </div>
                </form>
            </div>
        </div>
    </body>
</html>
