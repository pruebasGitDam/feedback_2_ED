/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.feedback_2_ed;

/**
 *
 * @author rulo
 */
public class Arbitro extends Usuario{
	
	private int numColegiado;

	public Arbitro(int numColegiado, String nombre, String apellidos, int telefono) {
		super(nombre, apellidos, telefono);
		this.numColegiado = numColegiado;
	}

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}
	
}
