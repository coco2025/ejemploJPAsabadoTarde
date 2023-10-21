package Interfaces;

import java.util.List;

import modelo.TblEmpleado;

public interface Iempleadoable {
	//declaramos los metodos
	public void RegistrarEmpleado(TblEmpleado tbemp);
	public void ActualizarEmpleado(TblEmpleado tbemp);
	public void EliminarEmpleado(TblEmpleado tbemp);
	public List<TblEmpleado> ListadoEmpleado();
	public TblEmpleado BuscarEmpleado(TblEmpleado tbemp);

}  //fin de la interface...
