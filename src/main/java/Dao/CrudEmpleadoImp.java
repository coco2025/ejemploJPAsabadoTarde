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
		//establecemos conexion con la unidad de persistencia...
				EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
				EntityManager em=factory.createEntityManager();
				em.getTransaction().begin();
				//listado
				List<TblEmpleado> listado=em.createQuery("select e from TblEmpleado e",TblEmpleado.class).getResultList();
				//confirmamos
				em.getTransaction().commit();
				//cerramos
				em.close();
				
				return listado;
	}

	@Override
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp) {
		return null;
	}

}
