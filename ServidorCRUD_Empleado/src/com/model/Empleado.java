package com.model;

public class Empleado {

	private int numeroid;
	private String nombre;
	private String edad;
	private String departamento;

	public Empleado() {

	}

	public Empleado(int numeroid, String nombre, String edad, String departamento) {
		super();
		this.numeroid = numeroid;
		this.nombre = nombre;
		this.edad = edad;
		this.departamento = departamento;
	}

	public int getNumeroid() {
		return numeroid;
	}

	public void setNumeroid(int numeroid) {
		this.numeroid = numeroid;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [numeroid=" + this.numeroid + ", nombre=" + this.nombre + ", edad=" + this.edad + ", departamento="
				+ this.departamento + "]";
	}

	
}
