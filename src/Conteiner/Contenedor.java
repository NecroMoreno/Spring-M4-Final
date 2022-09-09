package Conteiner;

import java.util.ArrayList;

import Entity.Administrativo;
import Entity.Capacitacion;
import Entity.Cliente;
import Entity.Profesional;
import Entity.Usuario;
import Interface.IAsesoria;

public class Contenedor {

	private static ArrayList<IAsesoria> asesorias;
	private static ArrayList<Capacitacion> capacitaciones;

	public Contenedor() {
		this.asesorias = new ArrayList<IAsesoria>();
		this.capacitaciones = new ArrayList<Capacitacion>();
	}

	public void addAsesorias(IAsesoria todosLosTiposDeIAsesoria) {
		asesorias.add(todosLosTiposDeIAsesoria);
	}

	public void agregaCapacitacion(Capacitacion capacitacion) {
		this.capacitaciones.add(capacitacion);
	}

	public void imprimeTodo() {
		for (IAsesoria r : asesorias) {
			System.out.println(r.analizarUsuario());
		}
	}

	public void listarUsuario() {
		for (IAsesoria r : asesorias) {
			System.out.println(r.listarUsuario());
		}
	}

	public void imprimeAsesorias() {
		for (IAsesoria r : asesorias) {
			System.out.println(r.toString());
		}
	}

	// un boolean y recive un rut tambien agregar uno que muestre solo los cliente.

	public void listarSoloCliente() {

		for (IAsesoria r : asesorias) {
			if (r instanceof Cliente) {
				System.out.println(r.analizarUsuario() + "\n");
			}

		}
	}

	public void listarSoloAdministrador() {

		for (IAsesoria r : asesorias) {
			if (r instanceof Administrativo) {
				System.out.println(r.analizarUsuario() + "\n");
			}

		}
	}

	public void listarSoloProfesional() {
		for (IAsesoria r : asesorias) {
			if (r instanceof Profesional) {
				System.out.println(r.analizarUsuario() + "\n");
			}

		}
	}

	public void listarCapacitaciones() {

		for (Capacitacion r : capacitaciones) {

			System.out.println(r.toString() + "\n");

		}
	}

	public boolean comparaRunUsuario(String run) {

		boolean flag = false;

		for (IAsesoria r : asesorias) {

			if (r instanceof Usuario) {
				if (((Usuario) r).getRun().equals(run)) {
					flag = true;
					return flag;
				}

			}

		}
		return flag;
	}

	public void eliminarUsuario(String run) {

		int contador = 0;
		int aux = -1;
		boolean flag = false;

		for (IAsesoria r : asesorias) {
			if (r instanceof Usuario) {

				if (((Usuario) r).getRun().equals(run)) {

					aux = contador;
					flag = true;
				}

			}
			contador++;
		}

		if (flag)
			asesorias.remove(aux);
	}

	public Cliente rescataCliente(String rut) {

		Cliente cliente = new Cliente();

		for (IAsesoria r : asesorias) {
			if (r instanceof Cliente) {

				if (((Cliente) r).getRut().equals(rut)) {
					cliente = new Cliente(((Cliente) r).getNombreUsuario(), ((Cliente) r).getFechaNacimiento(),
							((Cliente) r).getRun(), ((Cliente) r).getNombres(), ((Cliente) r).getApellidos(),
							((Cliente) r).getRut(), ((Cliente) r).getTelefono(), ((Cliente) r).getAfp(),
							((Cliente) r).getSistemaSalud(), ((Cliente) r).getDireccion(), ((Cliente) r).getComuna(),
							((Cliente) r).getEdad(), ((Cliente) r).getTag());

				}
			}
		}

		return cliente;
	}

	public boolean comparaRutCliente(String rut) {

		boolean flag = false;

		for (IAsesoria r : asesorias) {
			if (r instanceof Cliente) {

				if (((Cliente) r).getRut().equals(rut)) {
					flag = true;
					return flag;
				}

			}

		}
		return flag;

	}

}
