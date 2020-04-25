package com.dao;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import com.service.Empleado;
import com.service.EmpleadoImp;
import com.service.EmpleadoImpService;
import com.service.EmpleadoImpServiceLocator;

public class Imp_Empleado implements IEmpleadoDAO {

	private EmpleadoImpService ids = new EmpleadoImpServiceLocator();

	@Override
	public boolean registro(Empleado emp) {

		try {
			EmpleadoImp imp_Empleado = ids.getEmpleadoImpPort();
			imp_Empleado.actualizar(emp);
			return true;
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public Empleado lectura(int numeroId, String nombre) {
		
		try {
			EmpleadoImp imp_Empleado = ids.getEmpleadoImpPort();
			Empleado emple = imp_Empleado.lectura(numeroId, nombre);
			return emple;
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean actualizar(Empleado emp) {
		
		try {
			EmpleadoImp imp_Empleado = ids.getEmpleadoImpPort();
			imp_Empleado.actualizar(emp);
			return true;
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean delete(int numeroId) {
		
		try {
			EmpleadoImp imp_Empleado = ids.getEmpleadoImpPort();
			imp_Empleado.delete(numeroId);
			return true;
		} catch (ServiceException | RemoteException e) {
			e.printStackTrace();
			return false;
		}
	}

}
