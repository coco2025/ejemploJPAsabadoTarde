package Interfaces;

import java.util.List;

import modelo.TblCliente;

public interface Iclienteable {
	//declaramos los metodos....
	public void RegistrarCliente(TblCliente tblcli);
	public void ActualizarCliente(TblCliente tblcli);
	public void EliminarCliente(TblCliente tblci);
	public List<TblCliente> ListadoCliente();
	public TblCliente BuscarCliente(TblCliente tbcli);

}  //fin de la interface ....
