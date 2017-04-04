package projet.cadre.model;



public class DemandesVehicule {
	
	private int id;
	private String vehicules_immatriculation;
	private int employes_idEmploye;
	private String etat;
	private String dateDebut;
	private String dateFin;
	
	public DemandesVehicule(String imma, int id, String etat, String dateDebut, String dateFin){
		this.vehicules_immatriculation=imma;
		this.employes_idEmploye=id;
		this.etat=etat;
		this.dateDebut=dateDebut;
		this.dateFin=dateFin;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setVehicules_immatriculation(String vehicules_immatriculation) {
		this.vehicules_immatriculation = vehicules_immatriculation;
	}


	public void setEmployes_idEmploye(int employes_idEmploye) {
		this.employes_idEmploye = employes_idEmploye;
	}


	public String getVehicules_immatriculation() {
		return vehicules_immatriculation;
	}


	public int getEmployes_idEmploye() {
		return employes_idEmploye;
	}


	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}
	
}
