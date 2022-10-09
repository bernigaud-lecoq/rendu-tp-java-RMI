package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Service extends Remote {
    public int getNumber() throws RemoteException;
    public int multiplyNumber(int number, Client cname) throws RemoteException;
}
