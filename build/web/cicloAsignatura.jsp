
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ciclos y Asignaturas</title>
        <link href="css/materialize.min.css" rel="stylesheet"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="css/icon.css" type="text/css"/>
        <link href="css/materialize.min.css" type="text/css"/>

    </head>
    <body>
        
        <nav>
            <div class="nav-wrapper" style="background: #01579b">
                <a href="insertarAsignatura.jsp" class="orange btn" style="width: 20%; margin-left: 5%">Nuevo Registro</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a class="" href="index.jsp">inicio</a></li>
                    <li><a class="" href="docenteServlet?action=selectall">Docentes</a></li>
                </ul>
            </div>
        </nav>
        
        <h4 Style="size: 50px; color: #01579b; margin-left: 5%; margin-top: 5%">DOCENTE POR ASIGNATURA</h4>

        <div>
            <div class="col s12 m6 l6" style="margin-left: 3%; margin-right: 3%; margin-top: 3%">
                <table class="highlight striped">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>Ciclo</th>
                            <th>Asignatura</th>
                            <th>
                                acciones
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach  items="${listaCA}"  var="v">
                        <tr>
                            <td><c:out value="${v.idCiclo_Asignatura}" /></td>
                            <td><c:out value="${v.ciclo}" /></td>
                            <td><c:out value="${v.asignatura}"></c:out></td>
                            <td>
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
