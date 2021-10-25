<%-- 
    Document   : index
    Created on : 10-21-2021, 10:18:24 PM
    Author     : Alejandra Centeno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>horario uso aulas</title>
        <link href="css/materialize.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/icon.css" type="text/css"/>
        <link href="css/materialize.min.css" type="text/css"/>

    </head>
    <body>
        
        <nav>
            <div class="nav-wrapper" style="background: #01579b">
                <a href="insertarHorario.jsp" class="orange btn" style="width: 20%; margin-left: 5%">Nuevo Registro</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a class="" href="docenteAsignatura.jsp">Docentes por Asignatura</a></li>
                    <li><a class="" href="docenteServlet?action=selectall">Docentes</a></li>
                </ul>
            </div>
        </nav>
        
        <h4 Style="size: 50px; color: #01579b; margin-left: 5%; margin-top: 5%">HOHARIO DE USO DE AULAS</h4>

        <div>
            <div class="col s12 m6 l6" style="margin-left: 3%; margin-right: 3%; margin-top: 3%">
                <table class="highlight striped">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>Aula</th>
                            <th>Cod. asignatura</th>
                            <th>Estado</th>
                            <th>Dia</th>
                            <th>Cod. Hora</th>
                            <th>
                                acciones
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items ="${lista}" var="v">
                            <tr>
                                <td><c:out value="${v.id}" /></td>
                                <td><c:out value="${v.id}" /></td>
                                <td><c:out value="${v.id}" /></td>
                                <td><c:out value="${v.id}" /></td>
                                <td><c:out value="${v.id}" /></td>
                                <td><c:out value="${v.id}" /></td>
                                <td>
                                    <a href="#" class="waves-button-input  btn-small"><i class="material-icons left">delete</i>eliminar</a>
                                    <a href="#" class="waves-button-input  btn-small">modificar</a>
                                </td>
                            </tr>
                        </c:forEach>


                    </tbody>
                </table>
            </div>
        </div>
       
    </body>
    
    <script src="js/jquery-3.6.0.min.js" type="text/javascript"></script>
    <script src="js/materialize.min.js" type="text/javascript"></script>
        
</html>
