package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VODService extends Remote {
    public void viewCatalog() throws RemoteException;
    public Facture playMovie(String isbn,ClientBox box) throws RemoteException;
}
