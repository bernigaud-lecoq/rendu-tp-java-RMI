package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote {
    public String getpwd() throws RemoteException;
    public String getmail() throws RemoteException;
    public void facturer(Facture facture) throws RemoteException;
    public void getDescription(MovieDesc movieDesc) throws RemoteException;
}
