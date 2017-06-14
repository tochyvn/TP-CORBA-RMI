package service1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import metier.MetierCatalogueImp;
import metier.Produit;

@SuppressWarnings("serial")
public class CatalogueServiceImpl extends UnicastRemoteObject implements ICatalogueRemote {
	
	private MetierCatalogueImp metier;

	public CatalogueServiceImpl() throws RemoteException {
		super();
		metier = new MetierCatalogueImp();
	}

	@Override
	public List<Produit> consulterProduitParMC(String mc) throws RemoteException {
		return metier.getProduitParMC(mc);
	}

	@Override
	public List<Produit> listProduits() throws RemoteException {
		return metier.listProduits();
	}

	@Override
	public Produit getProduit(Long id) throws RemoteException {
		return metier.getProduit(id);
	}

	@Override
	public double getPrixMoyen() throws RemoteException {
		double sum = 0;
		List<Produit> produits = this.listProduits();
		for (Produit p : produits) {
			sum += p.getPrix();
		}
		
		return sum/produits.size();
	}

	
	
}
