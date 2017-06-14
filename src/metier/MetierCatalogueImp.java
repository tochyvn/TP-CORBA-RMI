package metier;

import java.util.ArrayList;
import java.util.List;

public class MetierCatalogueImp {
	
	private List<Produit> produits;
	
	public MetierCatalogueImp() {
		this.produits = new ArrayList<Produit>();
		produits.add(new Produit(1L, "HP250", 6000, "image1.jpg"));
		produits.add(new Produit(2L, "EPSON50", 3500, "image2.jpg"));
		produits.add(new Produit(1L, "NOKIA 1020", 500, "image3.jpg"));
	}
	
	public List<Produit> listProduits() {
		return this.produits;
	}
	
	public List<Produit> getProduitParMC(String mc) {
		List<Produit> prods = new ArrayList<>();
		
		for(Produit p : produits) {
			if (p.getNomProduit().indexOf(mc) != -1) {
				prods.add(p);
			}
		}
		
		return prods;
	}
	
	public Produit getProduit(Long idProd) {
		for (Produit produit : produits) {
			if (produit.getIdProduit().equals(idProd)) {
				return produit;
			}
		}
		return null;
	}
	
}
