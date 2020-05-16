/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rulo
 */
public class Jugador extends Usuario{
	
	private String direccion;
	private int anioNacimiento;

	public Jugador(String direccion, int fechaNac, String nombre, String apellidos, int telefono) {
		super(nombre, apellidos, telefono);
		this.direccion = direccion;
		this.anioNacimiento = fechaNac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
}
