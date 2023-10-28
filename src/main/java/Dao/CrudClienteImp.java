package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.Iclienteable;
import modelo.TblCliente;

public class CrudClienteImp  implements Iclienteable{

	@Override
	public void RegistrarCliente(TblCliente tblcli) {
		//establece la conexion con la unidad de persistencia
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		//para gestionar los procesos...
		EntityManager em=factory.createEntityManager();
		//iniciamos la transaccion
		em.getTransaction().begin();
		//registramos...
		em.persist(tblcli);
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
	}   //fin del metodo registrar...

	@Override
	public void ActualizarCliente(TblCliente tblcli) {
		// TODO Auto-generated method stub
		
	}   //fin del metodo actualizar cliente...

	@Override
	public void EliminarCliente(TblCliente tblci) {
		// TODO Auto-generated method stub
		
	}   //fin del metodo eliminar...

	@Override
	public List<TblCliente> ListadoCliente() {
		//establecemos la conexion con la persistencia...
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("proyectoLPIISabado");
		EntityManager em=factory.createEntityManager();
		//iniciamos la transaccion...
		em.getTransaction().begin();
		//hacemos el listado
		List<TblCliente> listar=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		//confirmamos
		em.getTransaction().commit();
		//cerramos
		em.close();
		//retornamos listado
		return listar;
	}   //fin del listado cliente...

	@Override
	public TblCliente BuscarCliente(TblCliente tbcli) {
		// TODO Auto-generated method stub
		return null;
	}    //fin del metodo buscar cliente....

}
