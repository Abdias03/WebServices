package com.service;


import javax.jws.WebMethod;

import com.model.Empleado;

public interface IEmpleadoDAO {
	
	@WebMethod
	public void registro(Empleado emp);	
	@WebMethod
    public Empleado lectura(int numeroId, String nombre);
	@WebMethod
	public void actualizar(Empleado emp);
	@WebMethod
	public void delete(int numeroId);

}
