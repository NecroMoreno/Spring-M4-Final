package Entity;

import java.util.ArrayList;

public class VisitaTerreno {

	private String idVisitaTerreno, fechaVisita, horaVisita, lugar, comentarios;
	private Cliente cliente;
	private ArrayList<Revision> revisiones;
	
	public VisitaTerreno(String idVisitaTerreno, String fechaVisita, String horaVisita, String lugar,
			String comentarios, Cliente cliente) {
		this.idVisitaTerreno = idVisitaTerreno;
		this.fechaVisita = fechaVisita;
		this.horaVisita = horaVisita;
		this.lugar = lugar;
		this.comentarios = comentarios;
		this.cliente = cliente;
		this.revisiones = new ArrayList<Revision>();
		cliente.agregaVisitaTerreno(this);
	}

	public String getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	public void setIdVisitaTerreno(String idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	public String getFechaVisita() {
		return fechaVisita;
	}

	public void setFechaVisita(String fechaVisita) {
		this.fechaVisita = fechaVisita;
	}

	public String getHoraVisita() {
		return horaVisita;
	}

	public void setHoraVisita(String horaVisita) {
		this.horaVisita = horaVisita;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	public void agregaRevision(Revision revision) {
		revisiones.add(revision);
	}
	
}
