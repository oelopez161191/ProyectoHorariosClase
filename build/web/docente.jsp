
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <a href="insertarDocente.jsp" class="orange btn" style="width: 20%; margin-left: 5%">Nuevo Registro</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a class="" href="AsignaturaDocenteServlet?action=selectall">Docentes por Asignatura</a></li>
                    <li><a class="" href="index.jsp">inicio</a></li>
                    <li><a class="" href="CicloAsignaturaServlet?action=selectall">Ciclo y Asignatura</a></li>
                </ul>
            </div>
        </nav>

        <h4 Style="size: 50px; color: #01579b; margin-left: 5%; margin-top: 5%">DOCENTES</h4>

        <div>
            <div class="col s12 m6 l6" style="margin-left: 3%; margin-right: 3%; margin-top: 3%">
                <table class="highlight striped">
                    <thead>
                        <tr>
                            <th>id</th>
                            <th>codigo interno</th>
                            <th>nombre</th>
                            <th>segundo nombre</th>
                            <th>tercer nombre</th>
                            <th>apellido</th>
                            <th>segundo apellido</th>
                            <th>direccion</th>
                            <th>telefono</th>
                            <th>email</th>
                            <th>dui</th>
                            <th>iss</th>
                            <th>
                                acciones
                            </th>
                        </tr>
                    </thead>


                    <tbody>
                        <c:forEach items="${lista}"  var="v">
                            
                            <tr>
                                <td><c:out value="${v.iddocente}"/></td>
                                <td><c:out value = "${v.codigo_interno}"/></td>
                                <td><c:out value="${v.nombre}" /></td>
                                <td><c:out value="${v.segundo_nombre}"/></td>
                                <td><c:out value="${v.tercer_nombre}"/></td>
                                <td><c:out value="${v.apellido}" /></td>
                                <td><c:out value="${v.segundo_apellido}" /></td>
                                <td><c:out value="${v.direccion}" /></td>
                                <td><c:out value="${v.telefono}" /></td>
                                <td><c:out value="${v.email}" /></td>
                                <td><c:out value="${v.dui}" /></td>
                                <td><c:out value="${v.isss}" /></td>
                                <td>
                                   <a href="docenteServlet?action=update&id=<c:out value="${v.iddocente}"/>"
                                      class="waves-button-input  btn-small">modificar</a>
                                </td>
                            </tr>
                        </c:forEach>
                        

                    </tbody>
                </table>
            </div>
        </div>


        <script src="js/jquery-3.6.0.min.js" type="text/javascript"></script>
        <script src="js/materialize.min.js" type="text/javascript"></script>


    </body>

</html>
