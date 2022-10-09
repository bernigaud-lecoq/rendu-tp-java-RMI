package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Distante extends Remote {
    public void echo() throws RemoteException;
    public Resultat sayResult(int number) throws RemoteException;
    public Service getServiceAccess () throws RemoteException;
}
