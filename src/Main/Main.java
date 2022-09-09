package Main;

import java.util.Scanner;

import Conteiner.Contenedor;
import Entity.Administrativo;
import Entity.Capacitacion;
import Entity.Cliente;
import Entity.Profesional;
import Utility.Valida;

public class Main {

	public static Cliente ingresaCliente() {

		Scanner sc = new Scanner(System.in);
		Boolean flag;

		String nombreUsuario, fechaNacimiento, run, nombres, apellidos, rut, telefono, afp, direccion, comuna;
		int sistemaSalud = 0, edad = 0;

		do {
			System.out.println("Ingrese nombre de usuario");
			nombreUsuario = sc.nextLine();
			flag = Valida.validaSoloChar(nombreUsuario);
		} while (flag == false);

		do {
			System.out.println("Ingrese nombres del cliente");
			nombres = sc.nextLine();
			flag = Valida.validaSoloChar(nombres);
		} while (flag == false);

		do {
			System.out.println("Ingrese apellidos del cliente");
			apellidos = sc.nextLine();
			flag = Valida.validaSoloChar(apellidos);
		} while (flag == false);

		do {
			System.out.println("Ingrese fecha de nacimiento del cliente");
			fechaNacimiento = sc.nextLine();
			flag = Valida.validarFecha(fechaNacimiento);
		} while (flag == false);

		do {
			System.out.println("Ingrese R.U.N. del cliente");
			run = sc.nextLine();
			flag = Valida.validaRut(run);
		} while (flag == false);

		do {
			System.out.println("Ingrese R.U.T. Asociado al cliente");
			rut = sc.nextLine();
			flag = Valida.validaRut(rut);
		} while (flag == false);

		do {
			System.out.println("Ingrese teléfono del cliente 999999999");
			telefono = sc.nextLine();
			flag = Valida.validaTelefono(telefono);
		} while (flag == false);

		do {
			System.out.println("Ingrese dirección del cliente");
			direccion = sc.nextLine();
			flag = Valida.validaLugar(direccion);
		} while (flag == false);

		do {
			System.out.println("Ingrese comuna del cliente");
			comuna = sc.nextLine();
			flag = Valida.validaSoloChar(comuna);
		} while (flag == false);

		do {

			System.out.println("Ingrese edad del cliente");
			String auxiliar = sc.nextLine();
			flag = Valida.validaEsNumero(auxiliar);
			if (flag) {
				edad = Integer.parseInt(auxiliar);

				if (edad == 0) {
					System.out.println("Ingrese edad mayor a 15");
				}

			} else {
				System.out.println("Ingrese valor válido");
			}

		} while ((edad < 16) || (flag == false));

		do {
			System.out.println("Ingrese afp del cliente");
			afp = sc.nextLine();
			flag = Valida.validaSoloChar(afp);
		} while (flag == false);

		do {

			System.out.println("Ingrese sistema de salud del cliente \n1: Para Fonasa \n2: Para Isapre");
			String auxiliar2 = sc.nextLine();
			flag = Valida.validaEsNumero(auxiliar2);
			if (flag) {
				sistemaSalud = Integer.parseInt(auxiliar2);
			}

			switch (sistemaSalud) {

			case 1:
				flag = true;
				break;
			case 2:
				flag = true;
				break;
			default:
				flag = false;
				System.out.println("Ingrese dato númerico valido: 1 o 2");

			}

		} while (flag == false);

		Cliente clienteObj = new Cliente(nombreUsuario, fechaNacimiento, run, nombres, apellidos, rut, telefono, afp,
				sistemaSalud, direccion, comuna, edad, 1);
		// necesito guardar esto en la interfaz

		System.out.println("presione enter para continuar...");
		sc.nextLine();
		return clienteObj;

	}

	// (String nombreUsuario, String nombres, String apellidos, String
	// fechaNacimiento, String run,
	// String area, String experienciaPrevia)

	public static Administrativo ingresaAdministrativo() {

		Scanner sc = new Scanner(System.in);
		Boolean flag;

		String nombreUsuario, nombres, apellidos, fechaNacimiento, run, area, experienciaPrevia;

		do {
			System.out.println("Ingrese nombre de usuario");
			nombreUsuario = sc.nextLine();
			flag = Valida.validaSoloChar(nombreUsuario);
		} while (flag == false);

		do {
			System.out.println("Ingrese nombres del Administrativo");
			nombres = sc.nextLine();
			flag = Valida.validaSoloChar(nombres);
		} while (flag == false);

		do {
			System.out.println("Ingrese apellidos del Administrativo");
			apellidos = sc.nextLine();
			flag = Valida.validaSoloChar(apellidos);
		} while (flag == false);

		do {
			System.out.println("Ingrese fecha de nacimiento del Administrativo");
			fechaNacimiento = sc.nextLine();
			flag = Valida.validarFecha(fechaNacimiento);
		} while (flag == false);

		do {
			System.out.println("Ingrese R.U.N. del Administrativo");
			run = sc.nextLine();
			flag = Valida.validaRut(run);
		} while (flag == false);

		do {
			System.out.println("Ingrese Area del Administrativo");
			area = sc.nextLine();
			flag = Valida.validaSoloChar(area);
		} while (flag == false);

		do {

			System.out.println("Ingrese experiencia del Administrativo");
			String auxiliar = sc.nextLine();
			flag = Valida.validaEsNumero(auxiliar);
			experienciaPrevia = auxiliar;

		} while (flag == false);

		Administrativo administrativoObj = new Administrativo(nombreUsuario, nombres, apellidos, fechaNacimiento, run,
				area, experienciaPrevia, 2);
		// necesito guardar esto en la interfaz

		System.out.println("presione enter para continuar...");
		sc.nextLine();
		return administrativoObj;

	}

	// (String nombreUsuario, String nombres, String apellidos, String
	// fechaNacimiento, String run, String titulo, String fechaIngreso)

	public static Profesional ingresaProfesional() {

		Scanner sc = new Scanner(System.in);
		Boolean flag;

		String nombreUsuario, nombres, apellidos, fechaNacimiento, run, titulo, fechaIngreso;

		do {
			System.out.println("Ingrese nombre de usuario");
			nombreUsuario = sc.nextLine();
			flag = Valida.validaSoloChar(nombreUsuario);
		} while (flag == false);

		do {
			System.out.println("Ingrese nombres del Profesional");
			nombres = sc.nextLine();
			flag = Valida.validaSoloChar(nombres);
		} while (flag == false);

		do {
			System.out.println("Ingrese apellidos del Profesional");
			apellidos = sc.nextLine();
			flag = Valida.validaSoloChar(apellidos);
		} while (flag == false);

		do {
			System.out.println("Ingrese fecha de nacimiento del Profesional");
			fechaNacimiento = sc.nextLine();
			flag = Valida.validarFecha(fechaNacimiento);
		} while (flag == false);

		do {
			System.out.println("Ingrese R.U.N. del Profesional");
			run = sc.nextLine();
			flag = Valida.validaRut(run);
		} while (flag == false);

		do {
			System.out.println("Ingrese título del Profesional");
			titulo = sc.nextLine();
			flag = Valida.validaSoloChar(titulo);
		} while (flag == false);

		do {
			System.out.println("Ingrese fecha de ingreso del Profesional");
			fechaIngreso = sc.nextLine();
			flag = Valida.validarFecha(fechaIngreso);
		} while (flag == false);

		Profesional profesionalObj = new Profesional(nombreUsuario, nombres, apellidos, fechaNacimiento, run, titulo,
				fechaIngreso, 3);
		// necesito guardar esto en la interfaz

		System.out.println("presione enter para continuar...");
		sc.nextLine();
		return profesionalObj;

	}

	public static Capacitacion ingresaCapacitacion(String rutCliente, Cliente cliente) {

		Scanner sc = new Scanner(System.in);
		Boolean flag;

		String identificador, dia, hora, lugar;
		int cantidadAsistentes = 0, duracion = 0;

		do {
			System.out.println("Ingrese ID Empresa"); // el rut es un identificador por eso lo usaré como tal
			identificador = sc.nextLine();
			flag = Valida.validaRut(identificador);
		} while (flag == false);

		do {
			System.out.println("Ingrese dia Lunes, Martes, Miércoles, Jueves, Viernes, Sábado.");
			dia = sc.nextLine();
			flag = Valida.validaDia(dia);

		} while (flag == false);

		do {
			System.out.println("Ingrese hora, en formato HH:MM formato 24hrs(de 00 a 24).");
			hora = sc.nextLine();
			flag = Valida.validaHora(hora);
		} while (flag == false);

		do {
			System.out.println("Ingrese el lugar a realizar la capacitación");
			lugar = sc.nextLine();
			flag = Valida.validaLugar(lugar);
		} while (flag == false);

		// Se pide que ingrese la cantidad de asistentes si es igual a 0 vuelve a
		// pedirlo
		do {

			System.out.println("Ingrese la cantidad de asistentes, número entero.");
			String auxiliar = sc.nextLine();
			flag = Valida.validaEsNumero(auxiliar);
			if (flag) {
				cantidadAsistentes = Integer.parseInt(auxiliar);

				if (cantidadAsistentes == 0) {
					System.out.println("Ingrese valor mayor a 0"); // caso si se ingresa 0
				}

			} else {
				System.out.println("Ingrese valor válido"); // caso si se ingresa un valor no válido
			}

		} while ((cantidadAsistentes == 0) || (flag == false));

		/*
		 * Se pide que ingrese los minutos que durara la capacitacion la verdad debí
		 * hice que los minutos fueran mayor a 30 no a 0 ya que me parece algo mínimo
		 * para una capacitación incluso insuficiente
		 */

		do {

			System.out.println("Ingrese la duración de la capacitación, en minutos(número entero).");
			String auxiliar = sc.nextLine();
			flag = Valida.validaEsNumero(auxiliar);
			if (flag) {
				duracion = Integer.parseInt(auxiliar);

				if (duracion < 30) {
					System.out.println("Ingrese desde 30 minutos y más");
				}

			} else {
				System.out.println("Ingrese valor válido");
			}

		} while ((duracion < 30) || (flag == false));

		Capacitacion capacitacionObj = new Capacitacion(identificador, rutCliente, dia, hora, lugar, duracion,
				cantidadAsistentes, cliente);

		System.out.println("presione enter para continuar...");
		sc.nextLine();

		return capacitacionObj;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Boolean flag = false;
		String opcionString;
		String rutCheck;
		Contenedor contenedor = new Contenedor();

		do {
			do {
				System.out.println(
						"Ingrese una opcion\nIngrese 1 si desea ingresar un Cliente\nIngrese 2 Para ingresar Profesional\nIngrese 3 Para ingresar Administrativo\nIngrese 4 Para ingresar Capacitación, solo si existe cliente/s\nIngrese 5 Para Eliminar Usuario por RUN\nIngrese 6 Para listar Usuarios\nIngrese 7 Para listar Usuarios por tipo\nIngrese 8 Para listar capacitaciones con el cliente asociado\nIngrese 9 Para salir y terminar el programa");
				opcionString = sc.nextLine();
				flag = Valida.validaEsNumero(opcionString);
			} while (flag == false);

			int opcion = Integer.parseInt(opcionString);

			switch (opcion) {

			case 1:
				Cliente clienteObj = ingresaCliente();
				contenedor.addAsesorias(clienteObj);
				flag = false;
				break;
			case 2:
				Profesional profesionalObj = ingresaProfesional();
				contenedor.addAsesorias(profesionalObj);
				flag = false;
				break;
			case 3:
				Administrativo administrativoObj = ingresaAdministrativo();
				contenedor.addAsesorias(administrativoObj);
				flag = false;
				break;
			case 4:

				contenedor.listarSoloCliente();

				do {
					System.out.println("\nIngrese RUT del Cliente que desea crear la capacitación");
					rutCheck = sc.nextLine();
					flag = Valida.validaRut(rutCheck);
				} while (flag == false);

				if (contenedor.comparaRutCliente(rutCheck)) {

					Cliente cliente = contenedor.rescataCliente(rutCheck);
					Capacitacion capacitacionObj = ingresaCapacitacion(rutCheck, cliente);
					contenedor.agregaCapacitacion(capacitacionObj);
					System.out.println("\nAgregado con éxito\n");
				} else {
					System.out.println("\nRut inexistente\n");
				}
				flag = false;
				break;
				// consistencia(finalmente queda con problemas de consistencia pero es porque el
				// ejercicio es asi no porque yo lo quiera, el arraylist de capacitacion deberia
				// guardarse en cliente no en el contenedor por asociacion, si queda en ambos
				// lados podria crear inconcistencia de datos)
				// ingresaCapacitacion();
			case 5:

				contenedor.listarUsuario();

				do {
					System.out.println("\nIngrese RUN del Usuario a Eliminar");
					rutCheck = sc.nextLine();
					flag = Valida.validaRut(rutCheck);
				} while (flag == false);
				if (contenedor.comparaRunUsuario(rutCheck)) {
					contenedor.eliminarUsuario(rutCheck);
				}
				contenedor.listarUsuario();
				flag = false;
				// eliminarUsuario();
				break;
			case 6:
				// listarUsuarios();
				contenedor.listarUsuario();
				System.out.println("\n");
				flag = false;
				break;
			case 7:
				do {
				do {
					System.out.println(
							"Ingrese una opcion\nIngrese 1 Para listar por Cliente\nIngrese 2 Para Listar por Profesional\nIngrese 3 Para Listar por Administrativo");
					opcionString = sc.nextLine();
					flag = Valida.validaEsNumero(opcionString);
				} while (flag == false);
					
				int op = Integer.parseInt(opcionString);
				switch (op) {
					
				case 1:
					contenedor.listarSoloCliente();
					flag=true;
					break;
				case 2:
					contenedor.listarSoloProfesional();
					flag=true;
					break;
				case 3:
					contenedor.listarSoloAdministrador();
					flag=true;
					break;
					default:
						flag=false;
						System.out.println("Ingrese opcion válida");
				
				}
				} while (flag == false);
				
				// listarUsuariosTipo();
				// listar usuario por tipo
				flag = false;
				break;
			case 8:
				contenedor.listarCapacitaciones();
				// listarCapacitaciones();
				flag = false;
				break;
			case 9:
				System.out.println("\nColorin colorado este cuento se ha acabo\n");
				flag = true;
				// opcion termino
				break;
			}
		} while (flag == false);
	}
}
