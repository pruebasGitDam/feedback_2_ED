package dam.feedback_2_ed;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rulo
 */
public class Principal {

	public static void main(String[] args) {
		mostrarMenuInicial();
	}

	private static void mostrarMenuInicial() {
		int tipoUsuario;
		do {
			limpiarPantalla();
			System.out.println("Indica el tipo de usuario que quieres usar");
			System.out.println(""
					+ "[1] Jugador\n"
					+ "[2] Federado\n"
					+ "[3] Árbitro");

			tipoUsuario = lecturaNum();

			switch (tipoUsuario) {
				case 1:
					limpiarPantalla();
					System.out.println("Bienvenido, jugador");
					mostrarMenuJugador();
					break;
				case 2:
					limpiarPantalla();
					System.out.println("Bienvenido, federado");
					mostrarMenuFederado();
					break;
				case 3:
					limpiarPantalla();
					System.out.println("Bienvenido, árbitro");
					mostrarMenuArbitro();
					break;
				default:
					System.out.println("¡Error! Tipo no válido, vuelve a seleccionarlo");
					tipoUsuario = 0;
					break;
			}
		} while (tipoUsuario == 0);
	}

	private static void mostrarMenuJugador() {
		int opcion;
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println(""
					+ "[1] Inscribir jugador\n"
					+ "[2] Inscribir equipo (necesitas 5 jugadores)\n"
					+ "[3] Ver calendario (próximos encuentros)\n"
					+ "[4] Ver registro (partidos jugados)\n"
					+ "[5] Volver al menú principal");

			opcion = lecturaNum();

			switch (opcion) {
				case 1:
					int opcionCase1;
					do {
						limpiarPantalla();
						System.out.println("¿Cómo quieres inscribir al/los jugadores?");
						System.out.println(""
								+ "[1] Manual (Introducir a mano la ficha de cada jugador)\n"
								+ "[2] Automático (Obtener una lista de 5 jugadores)");

						opcionCase1 = lecturaNum();

						switch (opcionCase1) {
							case 1:
								String nombre,
								 apellido,
								 direccion;
								int fechaNac,
								 telefono;
								limpiarPantalla();
								System.out.println("Necesitas rellenar la ficha del jugador, vamos a ello!");
								System.out.println("Nombre del jugador");
								nombre = lecturaCad();
								System.out.println("Apellido del jugador");
								apellido = lecturaCad();
								System.out.println("Direccion del jugador");
								direccion = lecturaCad();
								System.out.println("Año de nacimiento del jugador");
								fechaNac = lecturaNum();
								System.out.println("Teléfono del jugador");
								telefono = lecturaNum();
								Jugador jugador = new Jugador(direccion, fechaNac, nombre, apellido, telefono);
								Inscripcion.inscribeJugador(jugador);
								limpiarPantalla();
								mostrarMenuJugador();
								break;
							case 2:
								int opcionCase2;
								do {
									limpiarPantalla();
									System.out.println("¿Qué lista quieres crear?");
									System.out.println(""
											+ "[1] Lista 1\n"
											+ "[2] Lista 2");

									opcionCase2 = lecturaNum();

									switch (opcionCase2) {
										case 1:
											ArrayList<Jugador> jugadoresAutomatic1 = RellenaDatos.creaJugadores1();
											System.out.println("Tus jugadores son:");
											for (int i = 0; i < jugadoresAutomatic1.size(); i++) {
												Inscripcion.inscribeJugador(jugadoresAutomatic1.get(i));
												System.out.println(jugadoresAutomatic1.get(i).getNombre() + " " + jugadoresAutomatic1.get(i).getApellido());
											}
											mostrarMenuJugador();
											break;
										case 2:
											ArrayList<Jugador> jugadoresAutomatic2 = RellenaDatos.creaJugadores2();
											System.out.println("Tus jugadores son:");
											for (int i = 0; i < jugadoresAutomatic2.size(); i++) {
												Inscripcion.inscribeJugador(jugadoresAutomatic2.get(i));
												System.out.println(jugadoresAutomatic2.get(i).getNombre() + " " + jugadoresAutomatic2.get(i).getApellido());
											}
											mostrarMenuJugador();
											break;
										default:
											System.out.println("¡Error! Vuelve a seleccionar");
											opcionCase2 = 0;
											break;
									}
								} while (opcionCase2 == 0);
								break;
							default:
								System.out.println("¡Error! Vuelve a seleccionar");
								opcionCase1 = 0;
								break;
						}

					} while (opcionCase1 == 0);
					break;
				case 2:
					int opcionCase2;
					do {
						System.out.println("¿Cómo quieres inscribir al/los equipos?");
						System.out.println(""
								+ "[1] Manual (Introducir a mano los datos de cada equipo)\n"
								+ "[2] Automático (Obtener un equipo listo)");

						opcionCase2 = lecturaNum();

						switch (opcionCase2) {
							case 1:
								limpiarPantalla();
								String nombre, patrocinador, colorcami1, colorcami2, categoria;
								ArrayList<Jugador> jugadores = new ArrayList<>();
								System.out.println("Debes rellenar algunos datos dl equipo, vamos a ello!");
								System.out.println("Nombre del equipo");
								nombre = lecturaCad();
								System.out.println("Patrocinador del equipo");
								patrocinador = lecturaCad();
								System.out.println("Color de la primera camiseta");
								colorcami1 = lecturaCad();
								System.out.println("Color de la segunda camiseta");
								colorcami2 = lecturaCad();
								System.out.println("Categoría");
								categoria = lecturaCad();
								System.out.println("Elije la lista de los jugadores que formarán el equipo");
								// Mostramos la lista de los que ya están inscritos
								for (int i = 0; i < Inscripcion.getJugadoresInscritos().size(); i++) {
									System.out.println("[" + i + "] " + Inscripcion.getJugadoresInscritos().get(i).getNombre());
								}
								int numJugador;
								for (int i = 0; i < 5; i++) {
									System.out.println("Escribe el número del jugador " + (i+1) );
									numJugador = lecturaNum();
									if (numJugador >= 0 && numJugador < Inscripcion.getJugadoresInscritos().size()) {
										jugadores.add(Inscripcion.getJugadoresInscritos().get(numJugador));
									} else {
										System.out.println("El número del jugador elegido no es válido, vuelve a intentarlo");
										i--; 
									}
								}
								Equipo nomEquipo = new Equipo(nombre, patrocinador, colorcami1, colorcami2, categoria, jugadores);
								Inscripcion.inscribeEquipo(nomEquipo);
								mostrarMenuJugador();
								break;
							case 2:
								int opcionCase22;
								do {									
									limpiarPantalla();
								System.out.println("Elige el equipo que quieres inscribir");
								System.out.println(""
										+ "[1] Equipo automático 1\n"
										+ "[2] Equipo automático 2");
								
								opcionCase22 = lecturaNum();
								
								switch (opcionCase22) {
									case 1:
										Equipo equipo1 = RellenaDatos.crearEquipo1();
										System.out.println("El equipo 1 se ha creado con el nombre: " + equipo1.getNombre() + " y el patrocinador: " + equipo1.getPatrocinador());
										Inscripcion.inscribeEquipo(equipo1);
										mostrarMenuJugador();
										break;
									case 2:
										Equipo equipo2 = RellenaDatos.crearEquipo2();
										System.out.println("El equipo 2 se ha creado con el nombre: " + equipo2.getNombre() + " y el patrocinador: " + equipo2.getPatrocinador());
										Inscripcion.inscribeEquipo(equipo2);
										mostrarMenuJugador();
										break;
									default:
										System.out.println("Opción no válida, inténtalo de nuevo");
										opcionCase22 = 0;
										break;
								}
								
								} while (opcionCase22 == 0);
								
								break;
							default:
								System.out.println("¡Error! Opción no válida, vuelve a seleccionar");
								opcionCase2 = 0;
								break;
						}

					} while (opcionCase2 == 0);
					break;
				case 3:
					System.out.println("Encuentros pendientes");
					for (int i = 0; i < Calendario.getCalendario().size(); i++) {
						System.out.println(Calendario.getCalendario().get(i).getEquipo1().getNombre() + " vs "
								+ Calendario.getCalendario().get(i).getEquipo2().getNombre() + " se juega el "
								+ Calendario.getCalendario().get(i).getFecha() + " en el campo "
								+ Calendario.getCalendario().get(i).getCampo());
					}
					mostrarMenuJugador();
					break;
				case 4:
					System.out.println("Encuentros jugados");
					for (int i = 0; i < Registro.partidosJugados().size(); i++) {
						System.out.println("El " + Registro.partidosJugados().get(i).getEquipo1().getNombre() + " vs "
								+ Registro.partidosJugados().get(i).getEquipo2().getNombre() + " terminó con el resultado ["
								+ Registro.partidosJugados().get(i).getGolesEquipo1() + " - "
								+ Registro.partidosJugados().get(i).getGolesEquipo2() + "]\n"
								+ "Fue arbitrado por " + Registro.partidosJugados().get(i).getArbitro().getNombre());
						if (Registro.partidosJugados().get(i).getNotas().length() > 1) {
							System.out.println("Tuvo las siguientes anotaciones:\n"
									+ Registro.partidosJugados().get(i).getNotas());
						}
					}
					mostrarMenuJugador();
					break;
				case 5:
					mostrarMenuInicial();
					break;
				default:
					System.out.println("¡Error! Opción no válida, vuelve a seleccionarla");
					opcion = 0;
					break;
			}
		} while (opcion == 0);
	}

	private static void mostrarMenuFederado() {
		int opcion;
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println(""
					+ "[1] Registrar jugador (el jugador tiene que estar inscrito)\n"
					+ "[2] Registrar equipo (el equipo tiene que estar inscrito)\n"
					+ "[3] Anotar en calendario (próximos encuentros)\n"
					+ "[4] Anotar en registro (partidos jugados)\n"
					+ "[5] Volver al menú principal");

			opcion = lecturaNum();

			switch (opcion) {
				case 1:
					// registrar jugador
					int numJugador;
					boolean numJugadorValido;
					System.out.println("Jugadores para registrar:");
					for (int  i = 0; i < Inscripcion.getJugadoresInscritos().size(); i++) {
						System.out.println("[" + i + "]" + Inscripcion.getJugadoresInscritos().get(i).getNombre());
					}
					
					do {						
						System.out.println("Introduce el número del jugador que quieres registrar:");
						numJugador = lecturaNum();
						if (numJugador >= 0 && numJugador < Inscripcion.getJugadoresInscritos().size()) {
							Registro.registarJugador(Inscripcion.getJugadoresInscritos().get(numJugador));
							numJugadorValido = true;
						} else {
							System.out.println("No se encuentra el jugador, vuelve a seleccionar");
							numJugadorValido = false;
						}
					} while (!numJugadorValido);
					
					System.out.println("Ahora la lista de inscritos es: ");
					for (int  i = 0; i < Inscripcion.getJugadoresInscritos().size(); i++) {
						System.out.println("[" + i + "] " + Inscripcion.getJugadoresInscritos().get(i).getNombre());
					}
					System.out.println("Ahora la lista registrados es: ");
					for (int  i = 0; i < Registro.getJugadoresRegistrados().size(); i++) {
						System.out.println("[" + i + "] " + Registro.getJugadoresRegistrados().get(i).getNombre());
					}
					mostrarMenuFederado();
					break;
				case 2:
					// registrar equipo
					int numEquipo;
					boolean numEquipoValido;
					System.out.println("Equipos para registrar");
					for (int i = 0; i < Inscripcion.getEquiposInscritos().size(); i++) {
						System.out.println("[" + i + "]" + Inscripcion.getEquiposInscritos().get(i).getNombre());
					}
					
					do {						
						System.out.println("Introduce el número del equipo que quieres registrar:");
						numEquipo = lecturaNum();
						if (numEquipo >= 0 && numEquipo < Inscripcion.getEquiposInscritos().size()) {
							Registro.registrarEquipo(Inscripcion.getEquiposInscritos().get(numEquipo));
							numEquipoValido = true;
						} else {
							System.out.println("No se encuentra el equipo, vuelve a seleccionar");
							numEquipoValido = false;
						}
					} while (!numEquipoValido);
					
					System.out.println("Ahora esta es la lista de equipos inscritos");
					for (int i = 0; i < Inscripcion.getEquiposInscritos().size(); i++) {
						System.out.println("[" + i + "] " + Inscripcion.getEquiposInscritos().get(i).getNombre());
					}
					System.out.println("Ahora esta es la lista de equipos registrados");
					for (int i = 0; i < Registro.getEquiposRegistrados().size(); i++) {
						System.out.println("[" + i + "] " + Registro.getEquiposRegistrados().get(i).getNombre());
					}
					mostrarMenuFederado();
					break;
				case 3:
					// anotar en calendario
					Equipo equipo1 = null;
					Equipo equipo2 = null;
					Partido partido;
					String campo;
					String fecha;
					
					int numEquipo1;
					int numEquipo2;
					
					boolean numEquipo1Valido = false;
					boolean numEquipo2Valido = true;
					
					System.out.println("Selecciona el equipo que juega en casa:");
					
					for (int i = 0; i < Registro.getEquiposRegistrados().size(); i++) {
						System.out.println("[" + i + "] " + Registro.getEquiposRegistrados().get(i).getNombre());
					}
					
					do {						
						numEquipo1 = lecturaNum();
						if (numEquipo1 >= 0 && numEquipo1 < Registro.getEquiposRegistrados().size()) {
							equipo1 = Registro.getEquiposRegistrados().get(numEquipo1);
							numEquipo1Valido = true;
						} else {
							System.out.println("El equipo no es válido, vuelve a seleccionar");
						}
					} while (numEquipo1Valido);
					
					System.out.println("Selecciona el equipo que juega en campo contrario:");
					
					for (int i = 0; i < Registro.getEquiposRegistrados().size(); i++) {
						System.out.println("[" + i + "] " + Registro.getEquiposRegistrados().get(i).getNombre());
					}
					
					do {						
						numEquipo2 = lecturaNum();
						if (numEquipo2 >= 0 && numEquipo2 < Registro.getEquiposRegistrados().size() && numEquipo1 != numEquipo2) {
							equipo2 = Registro.getEquiposRegistrados().get(numEquipo2);
							numEquipo2Valido = true;
						} else {
							System.out.println("El equipo no es válido, vuelve a seleccionar");
						}
					} while (numEquipo2Valido);
					
					System.out.println("Introduce el campo donde se jugará el partido");
					campo = lecturaCad();
					System.out.println("Introduce la fecha en la que se jugará");
					fecha = lecturaCad();
					
					partido = new Partido(equipo1, equipo2, campo, fecha);
					Calendario.publicarPartido(partido);
					mostrarMenuFederado();
					break;
				case 4:
					// anotar en registro
					if (Calendario.getJugados().size() > 0) {
							for (int i = 0; i < Calendario.getJugados().size(); i++) {
								Registro.registrarPartidoJugado(Calendario.getJugados().get(i));
							}
						}
					if (Calendario.getJugados().size() == Registro.partidosJugados().size()) {
						Calendario.getJugados().clear();
					}
					mostrarMenuFederado();
					break;
				case 5:
					mostrarMenuInicial();
					break;
				default:
					System.out.println("¡Error! Opción no válida, vuelve a seleccionarla");
					opcion = 0;
					break;
			}
		} while (opcion == 0);
	}

	private static void mostrarMenuArbitro() {
		int opcion;
		do {
			System.out.println("¿Qué quieres hacer?");
			System.out.println(""
					+ "[1] Inscribir árbitro en el campeonato"
					+ "[2] Rellenar acta de partido (el partido cambiará a 'jugado')"
					+ "[2] Volver al menú principal");

			opcion = lecturaNum();

			switch (opcion) {
				case 1:
					// Inscribir un árbitro
					//Arbitro arbitro = new Arbitro(colegiado, nombre, apellidos, telefo);
					break;
				case 2:
					/**
					 * Rellenar el acta de un partido que esté pendiente.
					 * Para ello se mostrarán los partidos que estan en la lista de pendientes
					 * se seleccionará uno y se rellenaran los siguientes datos:
					 * jugado, goles E1, goles E2, notas, el objeto arbitro
					 * 
					 * Al hacer esto, el partido tiene que cambiar de calendario.proxPartidos a Calendario.jugados
					 */
					
					break;
				case 3:
					mostrarMenuInicial();
					break;
				default:
					System.out.println("¡Error! Opción no válida, vuelve a seleccionarla");
					opcion = 0;
					break;
			}
		} while (opcion == 0);
	}

	private static int lecturaNum() {
		boolean valido = false;
		Scanner lector = new Scanner(System.in);
		int numPedido = 0;

		do {
			try {
				numPedido = lector.nextInt();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println(""
						+ "¡Cuidado! Solo puedes insertar números mayores que 0.\n"
						+ "Vuelve a intentarlo");
			}
		} while (!valido && numPedido != 0);

		return numPedido;
	}

	private static String lecturaCad() {
		boolean valido = false;
		Scanner lector = new Scanner(System.in);
		String cadPedida = "";

		do {
			try {
				cadPedida = lector.nextLine();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println(""
						+ "¡Opss! Algo ha fallado.\n"
						+ "Vuelve a intentarlo");
			}
		} while (!valido && !cadPedida.equals(""));

		return cadPedida;
	}

	private static void limpiarPantalla() {
		for (int i = 0; i < 100; i++) {
			System.out.println("\n");
		}
	}

}
