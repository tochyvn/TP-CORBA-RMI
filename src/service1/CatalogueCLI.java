package service1;

import java.rmi.Naming;
import java.util.List;

import metier.Produit;

public class CatalogueCLI {

	public static void main(String[] args) {
		
		try {
			ICatalogueRemote stub = (ICatalogueRemote) Naming.lookup("rmi://localhost:1578/CAT");
			System.out.println("Prix Moyen : " + stub.getPrixMoyen());
			List<Produit> produits = stub.consulterProduitParMC("EP");
			for (Produit produit : produits) {
				System.out.println(produit.getNomProduit() + "  -- " + produit.getPrix());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
