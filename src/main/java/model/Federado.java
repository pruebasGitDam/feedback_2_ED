
package model;

import utils.Inscripcion;
import utils.Registro;

public class Federado extends Usuario {

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

	public static void registrarJugador(int numJugador) {
		Registro.registarJugador(Inscripcion.getJugadoresInscritos().get(numJugador));
	}

	public static void registrarEquipo(int numEquipo) {
		Registro.registrarEquipo(Inscripcion.getEquiposInscritos().get(numEquipo));
	}

	public static void anotarCalendario(Partido partido) {
		Calendario.publicarPartido(partido);
	}

	public static boolean anotarRegistro() {
		boolean realizado = false;
		
		if (Calendario.getJugados().size() > 0) {
			for (int i = 0; i < Calendario.getJugados().size(); i++) {
				Registro.registrarPartidoJugado(Calendario.getJugados().get(i));
			}
			realizado = true;
		}
		if (Calendario.getJugados().size() == Registro.partidosJugados().size()) {
			Calendario.getJugados().clear();
		}
		
		return realizado;
	}
}
