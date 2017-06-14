package serveur;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service1.CatalogueServiceImpl;
import service1.ICatalogueRemote;

public class ServeurRMI {
	
	public static void main(String[] args) {
		try {
			//Creation de l'annuaire sur le port 1578
			LocateRegistry.createRegistry(1578);
			ICatalogueRemote obj = new CatalogueServiceImpl();
			System.out.println(obj);
			//On publie la reference du serveur
			Naming.rebind("rmi://localhost:1578/CAT", obj);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
}
