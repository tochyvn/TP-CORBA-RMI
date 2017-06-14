package service1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import metier.Produit;

public interface ICatalogueRemote extends Remote {

	public List<Produit> consulterProduitParMC(String mc) throws RemoteException;
	public List<Produit> listProduits() throws RemoteException;
	public Produit getProduit(Long id) throws RemoteException;
	public double getPrixMoyen() throws RemoteException;
	
}
