package projet.cadre.model;

public class Attestations {
	
	private int idAttestation;
	private String typeAttestation;
	
	public Attestations(String typeAttestation) {
		super();
		this.typeAttestation = typeAttestation;
	}
	
	public int getIdAttestation() {
		return idAttestation;
	}
	
	public void setIdAttestation(int idAttestation) {
		this.idAttestation = idAttestation;
	}
	
	public String getTypeAttestation() {
		return typeAttestation;
	}
	
	public void setTypeAttestation(String typeAttestation) {
		this.typeAttestation = typeAttestation;
	}
	
}
