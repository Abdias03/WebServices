package com.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.connection.Conexion;
import com.model.Empleado;

@WebService
public class EmpleadoImp implements IEmpleadoDAO {
	
	private Conexion cnx = new Conexion();	

	@WebMethod
	public void registro(Empleado emp) {
		String sql = "INSERT INTO EMPLEADOS (NUMEROID, NOMBRE, EDAD, DEPARTAMENTO) " 
				+ "VALUES (?, ?, ?, ?)";
		Connection conn = null;
		try {
			conn = cnx.conectar();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, emp.getNumeroid());
			ps.setString(2, emp.getNombre());
			ps.setString(3, emp.getEdad());
			ps.setString(4, emp.getDepartamento());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	@WebMethod
	public Empleado lectura(int numeroId, String nombre) {
		String sql = "SELECT * FROM EMPLEADOS WHERE NUMEROID=?, NOMBRE=?";
		Empleado empleado =null;
		Connection conn = null;
		try {
			conn = cnx.conectar();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, numeroId);
			ps.setString(2, nombre);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				empleado = new Empleado(rs.getInt("NUMEROID"), rs.getString("NOMBRE"), rs.getString("EDAD"),
						rs.getString("DEPARTAMENTO"));
			}
			rs.close();
			ps.close();
			return empleado;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	@WebMethod
	public void actualizar(Empleado emp) {
		String sql = "UPDATE EMPLEADOS SET NUMEROID=?, NOMBRE=?, EDAD=?, DEPARTAMENTO=?";
		Connection conn = null;
		try {
			conn = cnx.conectar();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, emp.getNumeroid());
			ps.setString(2, emp.getNombre());
			ps.setString(3, emp.getEdad());
			ps.setString(4, emp.getDepartamento());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	
	
	@WebMethod
	public void delete(int numeroId) {
		
		String sql = "DELETE FROM EMPLEADOS WHERE NUMEROID=?";		
		Connection conn = null;
		try {
			conn = cnx.conectar();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, numeroId);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}

	}
	

}
