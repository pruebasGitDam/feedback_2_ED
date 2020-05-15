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
public class Equipo {
	
	private String nombre;
	private String patrocinador;
	private String colorCamiseta1;
	private String colorCamiseta2;
	private String categoria;
	private ArrayList<Jugador> jugadores;

	public Equipo(String nombre, String patrocinador, String colorCamiseta1, String colorCamiseta2, String categoria, ArrayList<Jugador> jugadores) {
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colorCamiseta1 = colorCamiseta1;
		this.colorCamiseta2 = colorCamiseta2;
		this.categoria = categoria;
		this.jugadores = jugadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public String getColorCamiseta1() {
		return colorCamiseta1;
	}

	public void setColorCamiseta1(String colorCamiseta1) {
		this.colorCamiseta1 = colorCamiseta1;
	}

	public String getColorCamiseta2() {
		return colorCamiseta2;
	}

	public void setColorCamiseta2(String colorCamiseta2) {
		this.colorCamiseta2 = colorCamiseta2;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
}
