<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.*" %>
    <%@page import="model.TblProductocl2" %>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Productos here</title>
</head>
<body bgcolor="yellow" align="center">

<h1  align="center">Listado de Productos Registrados en BD</h1>
<table border="2" align="center">

<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>Fecha Venta</td>
<td>Fecha Compra</td>
<td>Estado</td>
<td>Descripcion</td>
</tr>
<%
List<TblProductocl2> listado=(List<TblProductocl2>)request.getAttribute("listadoproductos");
//aplicamos una condicion..
if(listado!=null){
    //aplicamos un bucle for..
    for(TblProductocl2 lis:listado){
        %>
        <tr>
        <td><%=lis.getIdproductocl2() %></td>
        <td><%=lis.getNombrecl2() %></td>
        <td><%=lis.getPrecioventacl2() %></td>
        <td><%=lis.getPreciocompcl2() %></td>
        <td><%=lis.getEstadocl2() %></td>
        <td><%=lis.getDescripcl2() %></td>
        </tr>
 <%
    }  //fin del bucle for...
    %>
    <%
} //fin de la condicion ...

%>
</table>


</body>
</html>