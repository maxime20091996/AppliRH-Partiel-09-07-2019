package com.ensup.applirh.domaine;

import java.sql.Date;

public class Formation {

	private String theme;
	private Date date_debut;
	private int duree;
	private String description;
	private String avis;
	
	public Formation() {
		super();
	}

	public Formation(String theme, Date date_debut, int duree, String description, String avis) {
		super();
		this.theme = theme;
		this.date_debut = date_debut;
		this.duree = duree;
		this.description = description;
		this.avis = avis;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAvis() {
		return avis;
	}

	public void setAvis(String avis) {
		this.avis = avis;
	}

	@Override
	public String toString() {
		return "Formation [theme=" + theme + ", date_debut=" + date_debut + ", duree=" + duree + ", description="
				+ description + ", avis=" + avis + ", getTheme()=" + getTheme() + ", getDate_debut()=" + getDate_debut()
				+ ", getDuree()=" + getDuree() + ", getDescription()=" + getDescription() + ", getAvis()=" + getAvis()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
