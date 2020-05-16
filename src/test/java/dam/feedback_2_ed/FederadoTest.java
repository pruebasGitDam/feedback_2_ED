/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.feedback_2_ed;

import model.Federado;
import model.Jugador;
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
public class FederadoTest {
	
	public FederadoTest() {
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
	 * Test of getNumFederado method, of class Federado.
	 */
	@Test
	public void testGetNumFederado() {
		System.out.println("getNumFederado");
		Federado instance = null;
		int expResult = 0;
		int result = instance.getNumFederado();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of setNumFederado method, of class Federado.
	 */
	@Test
	public void testSetNumFederado() {
		System.out.println("setNumFederado");
		int numFederado = 0;
		Federado instance = null;
		instance.setNumFederado(numFederado);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of registrarJugador method, of class Federado.
	 */
	@Test
	public void testRegistrarJugador() {
		System.out.println("registrarJugador");
		Jugador jugador = null;
		Federado instance = null;
		instance.registrarJugador(jugador);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}
