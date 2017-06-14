package metier;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Produit implements Serializable{

	private Long idProduit;
	private String nomProduit;
	private double prix;
	private String photo;
	
	
	public Produit() {
		super();
	}
	
	public Produit(Long idProduit, String nomProduit, double prix, String photo) {
		super();
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.photo = photo;
	}

	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
}
