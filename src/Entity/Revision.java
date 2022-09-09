package Entity;

public class Revision {

	private String idRevision, nombreAlusivoRevision, detalleParaRevisar;
	private int estado;
	private VisitaTerreno visitaTerreno;
	
	public Revision(String idRevision, String nombreAlusivoRevision, String detalleParaRevisar, int estado,
			VisitaTerreno visitaTerreno) {
		this.idRevision = idRevision;
		this.nombreAlusivoRevision = nombreAlusivoRevision;
		this.detalleParaRevisar = detalleParaRevisar;
		this.estado = estado;
		this.visitaTerreno = visitaTerreno;
		visitaTerreno.agregaRevision(this);
	}

	public Revision() {
		
	}

	public String getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(String idRevision) {
		this.idRevision = idRevision;
	}

	public String getNombreAlusivoRevision() {
		return nombreAlusivoRevision;
	}

	public void setNombreAlusivoRevision(String nombreAlusivoRevision) {
		this.nombreAlusivoRevision = nombreAlusivoRevision;
	}

	public String getDetalleParaRevisar() {
		return detalleParaRevisar;
	}

	public void setDetalleParaRevisar(String detalleParaRevisar) {
		this.detalleParaRevisar = detalleParaRevisar;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
}
