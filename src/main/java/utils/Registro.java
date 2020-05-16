
package utils;

import model.Equipo;
import model.Jugador;
import model.Partido;
import java.util.ArrayList;

public class Registro {

	private static ArrayList<Jugador> jugadoresRegistrados = new ArrayList<>();
	private static ArrayList<Equipo> equiposRegistrados = new ArrayList<>();
	private static ArrayList<Partido> partidosJugados = new ArrayList<>();

	public Registro() {
	}

	public static void registarJugador(Jugador jugador) {
		for (int i = 0; i < Inscripcion.getJugadoresInscritos().size(); i++) {
			if (Inscripcion.getJugadoresInscritos().get(i).getNombre().equals(jugador.getNombre()) &&
					Inscripcion.getJugadoresInscritos().get(i).getApellido().equals(jugador.getApellido())) {
				jugadoresRegistrados.add(jugador);
				Inscripcion.eliminaJugador(jugador);
			}
		}
	}

	public static void registrarEquipo(Equipo equipo) {
		for (int i = 0; i < Inscripcion.getEquiposInscritos().size(); i++) {
			if (Inscripcion.getEquiposInscritos().get(i).getNombre().equals(equipo.getNombre())) {
				equiposRegistrados.add(equipo);
				Inscripcion.eliminaEquipo(equipo);
			}
		}
	}

	public static void registrarPartidoJugado(Partido partido) {
		partidosJugados.add(partido);
	}

	public static ArrayList<Partido> partidosJugados() {
		return partidosJugados;
	}
	
	public static ArrayList<Jugador> getJugadoresRegistrados() {
		return jugadoresRegistrados;
	}
	
	public static ArrayList<Equipo> getEquiposRegistrados() {
		return equiposRegistrados;
	}

}
