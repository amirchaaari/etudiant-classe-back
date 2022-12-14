package com.nadhem.etudiants.entities;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String cin;
	@ManyToOne
	private Classe classe;
	
		public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
		

		public Etudiant(String nom, String prenom, Date dateNaissance, String cin) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
			this.cin = cin;
		}


		public Long getIdEtudiant() {
			return idEtudiant;
		}


		public void setIdEtudiant(Long idEtudiant) {
			this.idEtudiant = idEtudiant;
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


		public Classe getClasse() {
			return classe;
		}


		public void setClasse(Classe classe) {
			this.classe = classe;
		}


		public Date getDateNaissance() {
			return dateNaissance;
		}


		public void setDateNaissance(Date dateNaissance) {
			this.dateNaissance = dateNaissance;
		}


		public String getCin() {
			return cin;
		}


		public void setCin(String cin) {
			this.cin = cin;
		}


		@Override
		public String toString() {
			return "Etudiant [idEtudiant=" + idEtudiant + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance="
					+ dateNaissance + ", cin=" + cin + "]";
		}
}
