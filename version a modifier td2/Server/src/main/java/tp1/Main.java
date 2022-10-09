package tp1;

import tp1.Distante.Connection;
import tp1.Distante.Service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(String[] args) {
        try {
            Connection connection=new tp1.Connection();

            //Distant stub = (Distant) UnicastRemoteObject.exportObject(objetDistant, 1090);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.createRegistry(2002);
            //Registry registry = LocateRegistry.getRegistry();
            registry.bind("Connection", connection);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());

            e.printStackTrace();
        }
    }

}
