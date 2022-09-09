package Entity;

import Interface.IAsesoria;

public class Profesional extends Usuario implements IAsesoria {

	String titulo, fechaIngreso;
	int tag;

	public Profesional(String nombreUsuario, String nombres, String apellidos, String fechaNacimiento, String run,
			String titulo, String fechaIngreso, int tag) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run, tag);
		this.titulo = titulo;
		this.fechaIngreso = fechaIngreso;
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String analizarUsuario() {
		String expresion = super.analizarUsuario() + "\nProfesional [titulo=" + titulo + ", fechaIngreso="
				+ fechaIngreso + "]";
		return expresion;
	}

	public String listarUsuario() {
		String expresion = super.listarUsuario();
		return expresion;
	}
	
	public int listarType() {
		int tipo = this.getTag();
		return tipo;
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + ", toString()=" + super.toString()
				+ "]";
	}

}
