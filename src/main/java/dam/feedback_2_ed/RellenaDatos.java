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
public class RellenaDatos {
	
	private static final String[] NOMBRES = {"Juan", "María", "Paco", "Manu", "Sandra", "Isma", "Rosa", "Jose", "Ana", "Santi"};
	private static final String[] APELLID = {"Ramos", "Peré", "Sanz", "Merlo", "Díaz", "Santos", "Casas", "Fló", "Puerta", "Soles"};
	private static final String[] DIRECCI = {"Calle 1", "Calle 2", "Calle 3", "Calle 4", "Calle 5", "Calle 6", "Calle 7", "Calle 8", "Calle 9", "Calle 10"};
	private static final int[] ANIOS_NACI = {1990, 1991, 1980, 1984, 1998, 2000, 1996, 2001, 1999, 1998};
	private static final int[] NUM_TELEFO = {12345, 12345, 12345, 12345, 12345, 12345, 12345, 12345, 12345, 12345};
	
	private static final String[] NOMBRE = {"Donettes FC", "Fruskys CF"};
	private static final String[] PATROC = {"Bimbo", "Bacardy"};
	private static final String[] COLCA1 = {"Marrón", "Azúl"};
	private static final String[] COLCA2 = {"Amarilla", "Blanca"};
	private static final String[] CATEGO = {"Juveniles", "Cadetes"};
	
	
	public RellenaDatos(){}
	
	public static ArrayList<Jugador> creaJugadores1() {
		Jugador jugador;
		ArrayList<Jugador> jugadores = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			jugador = new Jugador(DIRECCI[i], ANIOS_NACI[i], NOMBRES[i], APELLID[i], NUM_TELEFO[i]);
			jugadores.add(jugador);
		}
		return jugadores;
	}
	
	public static ArrayList<Jugador> creaJugadores2() {
		Jugador jugador;
		ArrayList<Jugador> jugadores = new ArrayList<>();
		for (int i = 5; i < 10; i++) {
			jugador = new Jugador(DIRECCI[i], ANIOS_NACI[i], NOMBRES[i], APELLID[i], NUM_TELEFO[i]);
			jugadores.add(jugador);
		}
		return jugadores;
	}
	
	public static Equipo crearEquipo1() {
		Equipo equipo = new Equipo(NOMBRE[0], PATROC[0], COLCA1[0], COLCA2[0], CATEGO[0], creaJugadores1());
		return equipo;
	}
	
	public static Equipo crearEquipo2() {
		Equipo equipo = new Equipo(NOMBRE[1], PATROC[1], COLCA1[1], COLCA2[1], CATEGO[1], creaJugadores2());
		return equipo;
	}
	
	public static void probandoClase() {
		Equipo equipo1 = crearEquipo1();
		Equipo equipo2 = crearEquipo2();
		
		System.out.println("Mostramos datos:\n"
		+ equipo1.getNombre() + ", " + equipo2.getCategoria()
		+ equipo1.getJugadores().get(0).getNombre() + ", " + equipo2.getJugadores().get(3).getDireccion());
		
	}
}
