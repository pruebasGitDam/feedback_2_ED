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
public class Partido {
	
	private boolean jugado;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	private String campo;
	private String fecha;
	private String notas;
	private Arbitro arbitro;

	// Este lo hace el federado (antes de que se juegue)
	public Partido(Equipo equipo1, Equipo equipo2, String campo, String fecha) {
		this.jugado = false;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = -1;
		this.golesEquipo2 = -1;
		this.campo = campo;
		this.fecha = fecha;
		this.notas = "";
		this.arbitro = null;
	}
	
	// Este lo hace el árbitro (después de jugarse)
//	public Partido(boolean jugado, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2, String campo, String fecha, String notas, Arbitro arbitro) {
//		this.jugado = true;
//		this.equipo1 = equipo1;
//		this.equipo2 = equipo2;
//		this.golesEquipo1 = golesEquipo1;
//		this.golesEquipo2 = golesEquipo2;
//		this.campo = campo;
//		this.fecha = fecha;
//		this.notas = notas;
//		this.arbitro = arbitro;
//	}

	public boolean getJugado() {
		return jugado;
	}

	public void setJugado(boolean jugado) {
		this.jugado = jugado;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	public Arbitro getArbitro() {
		return arbitro;
	}

	public void setArbitro(Arbitro arbitro) {
		this.arbitro = arbitro;
	}
	
}
