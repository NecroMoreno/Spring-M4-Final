package Entity;

public class Accidente {
	private String idAccidente, fechaAccidente, hora, lugar, origen, concecuencias;
	private Cliente cliente;
	
	public Accidente(String idAccidente, String fechaAccidente, String hora, String lugar,
			String origen, String concecuencias, Cliente cliente) {
		this.idAccidente = idAccidente;
		this.fechaAccidente = fechaAccidente;
		this.hora = hora;
		this.lugar = lugar;
		this.origen = origen;
		this.concecuencias = concecuencias;
		this.cliente = cliente;
		cliente.agregaAccidente(this);
	}

	public String getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(String idAccidente) {
		this.idAccidente = idAccidente;
	}

	public String getFechaAccidente() {
		return fechaAccidente;
	}

	public void setFechaAccidente(String fechaAccidente) {
		this.fechaAccidente = fechaAccidente;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConcecuencias() {
		return concecuencias;
	}

	public void setConcecuencias(String concecuencias) {
		this.concecuencias = concecuencias;
	}
	
}
