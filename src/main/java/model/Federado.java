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
public class Federado extends Usuario{
	
	private int numFederado;

	public Federado(int numFederado, String nombre, String apellidos, int telefono) {
		super(nombre, apellidos, telefono);
		this.numFederado = numFederado;
	}

	public int getNumFederado() {
		return numFederado;
	}

	public void setNumFederado(int numFederado) {
		this.numFederado = numFederado;
	}
	
	public void registrarJugador(Jugador jugador) {
		// Comprobar si el jugador está inscrito
		// Comprobar que no esté ya registrado
		// Registrar
		
		
		
		/**
		 * 
		 * 
		 * HAY QUE MIRAR SI HAY MÉTODOS QUE SE DEBEN PASAR A ALGUNAS CLASES
		 * 
		 * POR EJEMPLO LOS QUE HACE EL FEDERADO EN SU MENÚ
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}
}
