
<%@page import="java.util.*"  %>
<%@page import="modelo.TblEmpleado" %>

<html>
<body bgcolor="#c5dec9">
<h2 align="center">Registrar Empleado</h2>


<form method="post" action="ControladorEmpleado">
<table border="2" align="center">
<tr>
<td>Nombre</td>
<td><input type="text" name="nombre"></td>
</tr>
<tr>
<td>Apellido</td>
<td><input type="text" name="apellido"></td>
</tr>
<tr>
<td colspan="2" align="center">
<select name="sexo">
<option>Seleccione Sexo</option>
<option>M</option>
<option>F</option>
</select>
</td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>fehanac.</td>
<td><input type="text" name="fecha"></td>
</tr>
<tr>
<td>Telefon</td>
<td><input type="text" name="telefono"></td>
</tr>
<tr>
<td>Dni</td>
<td><input type="text" name="dni"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="Registrar">
</td>
</tr>
</table>
</form>
<h1 align="center">
Listado de Empleados
</h1>
<table align="center"  border="2">
<tr>
<th>codigo</th>
<th>nombre</th>
<th>apellido</th>
<th>sexo</th>
<th>email</th>
<th>fecha</th>
<th>telefono</th>
<th>dni</th>
</tr>
<!-- escriptles -->
<%
//recuperamos los datos del controlador
List<TblEmpleado> listado=(List<TblEmpleado>)request.getAttribute("listado");
//aplicamos una condicion...
if(listado!=null){
	//aplicamos un bucle for...
	for(TblEmpleado tbemp:listado){
%>
<tr>
<td><%=tbemp.getIdempleado()%></td><td><%=tbemp.getNombre()%></td>
<td><%=tbemp.getApellido()%></td><td><%=tbemp.getSexo()%></td>
<td><%=tbemp.getEmail()%></td><td><%=tbemp.getFechanac()%></td>
<td><%=tbemp.getTel()%></td><td><%=tbemp.getTel()%></td>
<td><%=tbemp.getDni()%></td>
</tr>
<%
	}   //cerramos el bucle for...
}  //cerramos la condicion.....
%>
</table>
</body>
</html>
