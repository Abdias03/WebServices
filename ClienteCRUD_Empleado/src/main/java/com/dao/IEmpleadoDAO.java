package com.dao;
import com.service.Empleado;

public interface IEmpleadoDAO {

	boolean registro(Empleado emp);
	com.service.Empleado lectura(int numeroId, String nombre );
	boolean actualizar(Empleado emp);
	boolean delete(int numeroId);
}
