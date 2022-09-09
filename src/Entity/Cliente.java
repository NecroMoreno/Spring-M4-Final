package Entity;

import java.util.ArrayList;

import Interface.IAsesoria;

public class Cliente extends Usuario implements IAsesoria {

	private String rut, telefono, afp, direccion, comuna;
	private int edad, sistemaSalud, tag;

	private ArrayList<Accidente> accidentes;
	private ArrayList<VisitaTerreno> visitasTerreno;
	// private ArrayList<Capacitacion> capacitaciones; No es necesario agregar acá
	// capacitación a pesar que quedaria mejor que en un container por la asociacion
	// quedaria rebundante ya que este ya se almacena en la clase container

	public Cliente(String nombreUsuario, String fechaNacimiento, String run, String nombres, String apellidos,
			String rut, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad,
			int tag) {
		super(nombreUsuario, nombres, apellidos, fechaNacimiento, run, tag);
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.tag = tag;
		this.accidentes = new ArrayList<Accidente>();
		this.visitasTerreno = new ArrayList<VisitaTerreno>();
		// this.capacitaciones = new ArrayList<Capacitacion>();
	}

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistemaSalud() {
		return sistemaSalud;
	}

	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	/*
	 * public void agregaCapacitacion(Capacitacion capacitacion) {
	 * this.capacitaciones.add(capacitacion); }
	 */

	public void agregaAccidente(Accidente accidente) {
		this.accidentes.add(accidente);
	}

	public void agregaVisitaTerreno(VisitaTerreno visitaTerreno) {
		this.visitasTerreno.add(visitaTerreno);
	}

	public String obtenerNombre() {
		String nombreCompleto = super.getNombres() + " " + super.getApellidos();
		return nombreCompleto;

	}

	public String obtenerSistemaSalud() {

		String sistemaSaludToString = "";

		switch (sistemaSalud) {

		case 1:
			sistemaSaludToString = "Fonasa";
			break;
		case 2:
			sistemaSaludToString = "Isapre";

		}
		return sistemaSaludToString;
	}

	@Override
	public String toString() {
		return super.toString() + "Cliente [rut=" + rut + ", telefono=" + telefono + ", afp=" + afp + ", sistemaSalud="
				+ sistemaSalud + ", direccion=" + direccion + ", comuna=" + comuna + ", edad=" + edad + ", accidentes="
				+ accidentes + ", visitasTerreno=" + visitasTerreno + "]";
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
	public String analizarUsuario() {
		String expresion = super.analizarUsuario() + "\n[Direccion: " + direccion + "]" + "\n[Comuna: " + comuna + "]";
		return expresion;
	}

}
