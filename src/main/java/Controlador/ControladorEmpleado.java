package Controlador;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CrudEmpleadoImp;
import modelo.TblEmpleado;



/**
 * Servlet implementation class ControladorEmpleado
 */
public class ControladorEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorEmpleado() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//llamar al listado...
		//instanciar la clase crud...
		CrudEmpleadoImp crudlis=new CrudEmpleadoImp();
		List<TblEmpleado> listado=crudlis.ListadoEmpleado();
		request.setAttribute("listado",listado);
		request.getRequestDispatcher("/FrmGestionarEmpleado.jsp").forward(request, response);
	} //fin del metodo doget...

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		//recuperamos los valores del formulario...
	   String nombre=request.getParameter("nombre");
	   String apellido=request.getParameter("apellido");
	   String sexo=request.getParameter("sexo");
	   String email=request.getParameter("email");
	   String fecha=request.getParameter("fecha");
	   String telef=request.getParameter("telefono");
	   String dni=request.getParameter("dni");
	   //realizamos las rescpectivas instancias.
	   TblEmpleado tblemp=new TblEmpleado();
	   CrudEmpleadoImp crud=new CrudEmpleadoImp();
	   //convertir fecha a sql...
	   Date fec=new Date();
	   Date fechsql=new Date(fec.getTime());
	   //asignamos valores...
	   tblemp.setNombre(nombre);
	   tblemp.setApellido(apellido);
	   tblemp.setSexo(sexo);
	   tblemp.setEmail(email);
	   tblemp.setFechanac(fechsql);
	   tblemp.setTel(telef);
	   tblemp.setDni(dni);
	   
	   //invocamos al metodo registrar..
	   crud.RegistrarEmpleado(tblemp);
	   
	   //recuperamos el listado
	   List<TblEmpleado> listado=crud.ListadoEmpleado();
	 //enviamos el listado hacia la vista..
	   request.setAttribute("listado",listado);
	   //redireccionamos 
	   request.getRequestDispatcher("/FrmGestionarEmpleado.jsp").forward(request, response);

	}		 //fin del metodo dopost

}
