
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Asignaturas y docentes</title>
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
                    <li><a class="" href="index.jsp">Horarios Aulas</a></li>
                    <li><a class="" href="docenteServlet?action=selectall">Docentes</a></li>
                    <li><a class="" href="CicloAsignaturaServlet?action=selectall">Ciclo y Asignatura</a></li>
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
                            <th>Id docente</th>
                            <th>Años impartidos</th>
                            <th>Inicio de clases</th>
                            <th>Fin de clases</th>
                            <th>
                                acciones
                            </th>
                        </tr>
                    </thead>
                    <tbody>
                    <c:forEach  items="${lista}"  var="v">
                        <tr>
                            <td><c:out value="${v.idCiclo_Asignatura_Docente}" /></td>
                            <td><c:out value="${v.ciclo_asignatura}" /></td>
                            <td><c:out value="${v.docente}"></c:out></td>
                            <td><c:out value="${v.anios_impartiendo}" /></td>
                            <td><c:out value="${v.inicio_clases}" /></td>
                            <td><c:out value="${v.fin_calses}" /></td>
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
