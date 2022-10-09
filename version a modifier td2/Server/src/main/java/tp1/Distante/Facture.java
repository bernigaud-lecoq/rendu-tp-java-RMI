package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Facture extends Remote {
    public void print() throws RemoteException;
    public int getPrice() throws RemoteException;
}
