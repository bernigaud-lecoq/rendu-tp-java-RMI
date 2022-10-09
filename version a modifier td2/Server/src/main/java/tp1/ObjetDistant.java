
package tp1;

import tp1.Distante.Distante;
import tp1.Distante.Resultat;
import tp1.Distante.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetDistant extends UnicastRemoteObject implements Distante {
    public ObjetDistant (Service service) throws RemoteException {
        this.service = service;
    }
    private Service service;
    public void echo() throws RemoteException
    {
        System.out.println( "Hello World!" );
    }

    public Resultat sayResult(int number) throws RemoteException
    {
        return new Resultat(number);
    }

    @Override
    public Service getServiceAccess() throws RemoteException {
        return service;
    }
}
