/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.feedback_2_ed;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rulo
 */
public class InscripcionTest {
	
	public InscripcionTest() {
	}
	
	@BeforeAll
	public static void setUpClass() {
	}
	
	@AfterAll
	public static void tearDownClass() {
	}
	
	@BeforeEach
	public void setUp() {
	}
	
	@AfterEach
	public void tearDown() {
	}

	/**
	 * Test of inscribeJugador method, of class Inscripcion.
	 */
	@Test
	public void testInscribeJugador() {
		System.out.println("inscribeJugador");
		Jugador jugador = null;
		Inscripcion.inscribeJugador(jugador);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of inscribeEquipo method, of class Inscripcion.
	 */
	@Test
	public void testInscribeEquipo() {
		System.out.println("inscribeEquipo");
		Equipo equipo = null;
		Inscripcion.inscribeEquipo(equipo);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getJugadoresInscritos method, of class Inscripcion.
	 */
	@Test
	public void testGetJugadoresInscritos() {
		System.out.println("getJugadoresInscritos");
		ArrayList<Jugador> expResult = null;
		ArrayList<Jugador> result = Inscripcion.getJugadoresInscritos();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getEquiposInscritos method, of class Inscripcion.
	 */
	@Test
	public void testGetEquiposInscritos() {
		System.out.println("getEquiposInscritos");
		ArrayList<Equipo> expResult = null;
		ArrayList<Equipo> result = Inscripcion.getEquiposInscritos();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of eliminaJugador method, of class Inscripcion.
	 */
	@Test
	public void testEliminaJugador() {
		System.out.println("eliminaJugador");
		Jugador jugador = null;
		Inscripcion.eliminaJugador(jugador);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of eliminaEquipo method, of class Inscripcion.
	 */
	@Test
	public void testEliminaEquipo() {
		System.out.println("eliminaEquipo");
		Equipo equipo = null;
		Inscripcion.eliminaEquipo(equipo);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of jugadorInscrito method, of class Inscripcion.
	 */
	@Test
	public void testJugadorInscrito() {
		System.out.println("jugadorInscrito");
		Jugador jugador = null;
		boolean expResult = false;
		boolean result = Inscripcion.jugadorInscrito(jugador);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of equipoInscrito method, of class Inscripcion.
	 */
	@Test
	public void testEquipoInscrito() {
		System.out.println("equipoInscrito");
		Equipo equipo = null;
		boolean expResult = false;
		boolean result = Inscripcion.equipoInscrito(equipo);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
