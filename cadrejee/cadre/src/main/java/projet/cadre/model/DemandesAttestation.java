package projet.cadre.model;

import java.sql.Date;

public class DemandesAttestation {
	
	private int id;
	private int attestations_idAttestation;
	private int employes_idEmploye;
	private String etat;
	private String date;
	
	public DemandesAttestation(int attestations_idAttestation, int employes_idEmploye, String etat, String date) {
		super();
		this.attestations_idAttestation = attestations_idAttestation;
		this.employes_idEmploye = employes_idEmploye;
		this.etat = etat;
		this.date = date;
	}

	public int getAttestations_idAttestation() {
		return attestations_idAttestation;
	}

	public void setAttestations_idAttestation(int attestations_idAttestation) {
		this.attestations_idAttestation = attestations_idAttestation;
	}

	public int getEmployes_idEmploye() {
		return employes_idEmploye;
	}

	public void setEmployes_idEmploye(int employes_idEmploye) {
		this.employes_idEmploye = employes_idEmploye;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public int getId() {
		return id;
	}

}
