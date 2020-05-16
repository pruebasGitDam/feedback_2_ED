/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.feedback_2_ed;

import model.Jugador;
import utils.Inscripcion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rulo
 */
public class InscripcionTest {
	
	public InscripcionTest() {
	}
	
	/**
	 * Pruebas de inscripcion de jugador.
	 */
	@Test
	public void testInscribeJugador() {
		// Debe ser 0 porque no se ha inscrito ningún jugador
		assertEquals(0, Inscripcion.getJugadoresInscritos().size());
		
		// Creamos un jugador
		Jugador jugador = new Jugador("Direccion", 1990, "Nombre", "Apellidos", 654123123);
		
		// Lo inscribimos
		Inscripcion.inscribeJugador(jugador);
		
		// Comprobamos que hay un jugador
		assertEquals(1, Inscripcion.getJugadoresInscritos().size());
		
		// Comprobamos que el nombre del jugador es Nombre
		assertEquals("Nombre", Inscripcion.getJugadoresInscritos().get(0).getNombre());
		
		// Eliminamos el jugador
		Inscripcion.eliminaJugador(jugador);
		
		// Ahora debe ser 0 otra vez
		assertEquals(0, Inscripcion.getJugadoresInscritos().size());
	}
	
}
