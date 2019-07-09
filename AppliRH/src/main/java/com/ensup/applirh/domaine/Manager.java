package com.ensup.applirh.domaine;

import java.sql.Date;

public class Manager extends Salarie {
	
	private String liste_employes;
	
	public Manager() {
		super();
	}

	public Manager(String liste_employes) {
		super();
		this.liste_employes = liste_employes;
	}
	
	public Manager(String login, String password, String nom, String prenom, String email, String adresse, String fonction, Date date_embauche) {
		super(login, password, nom, prenom, email, adresse, fonction, date_embauche);
		this.liste_employes = liste_employes;
	}

	public String getListe_employes() {
		return liste_employes;
	}

	public void setListe_employes(String liste_employes) {
		this.liste_employes = liste_employes;
	}
	
	
}
