package Entity;

import Interface.IAsesoria;

public class Administrativo extends Usuario implements IAsesoria {

	private String area, experienciaPrevia;
	private int tag;

	public Administrativo(String nombreUsuario, String nombres, String apellidos, String fechaNacimiento, String run,
			String area, String experienciaPrevia, int tag) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run, tag);
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
		this.tag = tag;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
	public String analizarUsuario() {
		String expresion = super.analizarUsuario() + "\nAdministrativo [area=" + area + ", experienciaPrevia="
				+ experienciaPrevia + "]";
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
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", toString()="
				+ super.toString() + "]";
	}

}
