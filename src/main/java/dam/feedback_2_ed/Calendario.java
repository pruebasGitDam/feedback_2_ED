/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.feedback_2_ed;

import java.util.ArrayList;

/**
 *
 * @author rulo
 */
public class Calendario {

	private static ArrayList<Partido> proxPartidos = new ArrayList<>();
	private static ArrayList<Partido> jugados = new ArrayList<>();

	public Calendario() {
	}

	public static void publicarPartido(Partido partido) {
		if (!existeProxPartido(partido))
			proxPartidos.add(partido);
	}

	public static ArrayList<Partido> getCalendario() {
		return proxPartidos;
	}
	
	public static ArrayList<Partido> getJugados() {
		return jugados;
	}

	public static void quitarPartidoJugado(Partido partido) {
		if (existePartidoJugado(partido))
			jugados.remove(partido);
	}
	
	public static boolean existePartidoJugado(Partido partido) {
		boolean estaJugado = false;
		for (int i = 0; i < jugados.size(); i++) {
			if (jugados.get(i).getEquipo1().getNombre().equals(partido.getEquipo1().getNombre()) &&
					jugados.get(i).getEquipo2().getNombre().equals(partido.getEquipo2().getNombre())) {
				estaJugado = true;
			}
		}
		return estaJugado;
	}
	
	public static boolean existeProxPartido(Partido partido) {
		boolean estaPendiente = false;
		for (int i = 0; i < proxPartidos.size(); i++) {
			if (proxPartidos.get(i).getEquipo1().getNombre().equals(partido.getEquipo1().getNombre()) &&
					proxPartidos.get(i).getEquipo2().getNombre().equals(partido.getEquipo2().getNombre())) {
				estaPendiente = true;
			}
		}
		return estaPendiente;
	}

	public static void actaDePartido(Partido partido) {
		if (existeProxPartido(partido) && !existePartidoJugado(partido)) {
			jugados.add(partido);
			proxPartidos.remove(partido);
		}
	}
	
}
