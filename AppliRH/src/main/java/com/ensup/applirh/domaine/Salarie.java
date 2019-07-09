package com.ensup.applirh.domaine;

import java.sql.Date;

public class Salarie {

	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String fonction;
	private Date date_embauche;
	

	// Constructeurs

	public Salarie(){
		super();
	}
	
	

	public Salarie(String login, String password, String nom, String prenom, String email, String adresse, String fonction, Date date_embauche) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.fonction = fonction;
		this.date_embauche = date_embauche;
	}


	// Getters & Setters
	
	
	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public String getFonction() {
		return fonction;
	}



	public void setFonction(String fonction) {
		this.fonction = fonction;
	}



	public Date getDate_embauche() {
		return date_embauche;
	}



	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}



	@Override
	public String toString() {
		return "Salarie [login=" + login + ", password=" + password + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", adresse=" + adresse + ", fonction=" + fonction + ", date_embauche=" + date_embauche
				+ ", getLogin()=" + getLogin() + ", getPassword()=" + getPassword() + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + ", getEmail()=" + getEmail() + ", getAdresse()=" + getAdresse()
				+ ", getFonction()=" + getFonction() + ", getDate_embauche()=" + getDate_embauche() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}