package tp1;

import tp1.Distante.Client;
import tp1.Distante.MovieDesc;
import tp1.Distante.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceDistant extends UnicastRemoteObject implements Service {
    private int myNumber = 5;

    public ServiceDistant() throws RemoteException{

    }
    @Override
    public int getNumber() throws RemoteException {
        return myNumber;
    }

    @Override
    public int multiplyNumber(int number, Client cname) throws RemoteException {
        myNumber = myNumber*number;
        Facture facture = new Facture(50);
        MovieDesc movieDesc=new tp1.MovieDesc("ptitard","c'est l'histoire d'un pokemon de ouf","111-2-3333-2609-4");

        try {

            cname.facturer(facture);
            cname.getDescription(movieDesc);
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + " val renvoyée: " + myNumber + " au Client " + cname);
        return myNumber;
    }
}
