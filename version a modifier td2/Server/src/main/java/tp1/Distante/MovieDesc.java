package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MovieDesc extends Remote {
    public String getMovieName() throws RemoteException;
    public String isbn() throws RemoteException;
    public String synopsis() throws RemoteException;
}
