
package model;


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
	
	public static void actaDePartido(Partido partido, Arbitro arbitro, int golesE1, int golesE2, String notas) {
		partido.setArbitro(arbitro);
		partido.setJugado(true);
		partido.setGolesEquipo1(golesE1);
		partido.setGolesEquipo2(golesE2);
		partido.setNotas(notas);
		
		Calendario.actaDePartido(partido);
	}
	
}
