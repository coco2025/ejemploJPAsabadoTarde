package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iempleadoable;
import modelo.TblEmpleado;

public class CrudEmpleadoImp  implements Iempleadoable{

	@Override
	public void RegistrarEmpleado(TblEmpleado tbemp) {
		//ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA...
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager emanager=factory.createEntityManager();
		//inicializar la transaccion..
		emanager.getTransaction().begin();
		//registramos
		emanager.persist(tbemp);
		//comfirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
		
	}

	@Override
	public void ActualizarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblEmpleado> ListadoEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp) {
		// TODO Auto-generated method stub
		return null;
	}

}
