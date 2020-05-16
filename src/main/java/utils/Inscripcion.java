package utils;

import model.Arbitro;
import model.Equipo;
import model.Jugador;
import java.util.ArrayList;

public class Inscripcion {

	private static ArrayList<Jugador> jugadoresInscritos = new ArrayList<>();
	private static ArrayList<Equipo> equiposInscritos = new ArrayList<>();
	private static ArrayList<Arbitro> arbitrosInscritos = new ArrayList<>();

	public Inscripcion() {
	}
	
	public static void inscribeArbitro(Arbitro arbitro) {
		if (!arbitroInscrito(arbitro)) {
			arbitrosInscritos.add(arbitro);
		} else {
			System.out.println("Este colegiado ya está inscrito");
		}
	}

	public static void inscribeJugador(Jugador jugador) {
		if (!jugadorInscrito(jugador)) {
			jugadoresInscritos.add(jugador);
		} else {
			System.out.println("El jugador ya está inscrito");
		}
	}

	public static void inscribeEquipo(Equipo equipo) {
		if (!equipoInscrito(equipo)) {
			equiposInscritos.add(equipo);
		} else {
			System.out.println("El equipo ya está inscrito");
		}
	}
	
	public static ArrayList<Arbitro> getArbitrosInscritos() {
		return arbitrosInscritos;
	}
	
	public static ArrayList<Jugador> getJugadoresInscritos() {
		return jugadoresInscritos;
	}
	public static ArrayList<Equipo> getEquiposInscritos() {
		return equiposInscritos;
	}
	
	public static void eliminaJugador(Jugador jugador) {
		for (int i = 0; i < jugadoresInscritos.size(); i++) {
			if (jugadorInscrito(jugador)){
				jugadoresInscritos.remove(i);
			}
		}
	}
	
	public static void eliminaEquipo(Equipo equipo) {
		for (int i = 0; i < equiposInscritos.size(); i++) {
			if (equipoInscrito(equipo)) {
				equiposInscritos.remove(i);
			}
		}
	}
	
	public static boolean arbitroInscrito(Arbitro arbitro) {
		boolean existe = false;
		if (!arbitrosInscritos.isEmpty()) {
			for (Arbitro a : arbitrosInscritos) {
				if (a.getNumColegiado() == arbitro.getNumColegiado()) {
					existe = true;
				}
			}
		}
		return existe;
	}

	public static boolean jugadorInscrito(Jugador jugador) {
		boolean existe = false;
		if (!jugadoresInscritos.isEmpty()) {
			for (Jugador j : jugadoresInscritos) {
				if (j.getNombre().equals(jugador.getNombre())
						&& j.getApellido().equals(jugador.getApellido())) {
					existe = true;
				}
			}
		}
		return existe;
	}

	public static boolean equipoInscrito(Equipo equipo) {
		boolean existe = false;
		for (Equipo e : equiposInscritos) {
			if (e.getNombre().equals(equipo.getNombre())) {
				existe = true;
			}
		}
		return existe;
	}

}
