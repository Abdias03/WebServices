package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {  
	
	private Connection conexion;
	
	public Connection conectar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Fallo la conexcion");
	        ex.printStackTrace();
		}
		return conexion;
	}
}

