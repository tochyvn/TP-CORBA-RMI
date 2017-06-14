package service;

import java.rmi.Naming;

public class ClientRMI {

	public static void main(String[] args) {

		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/DK");
			System.out.println(stub.conversion(10));
			System.out.println(stub.getServerDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
