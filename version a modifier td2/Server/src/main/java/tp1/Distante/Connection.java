package tp1.Distante;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Connection extends Remote {
    boolean signIn(String mail, String pwd) throws RuntimeException, RemoteException;
    VODService login(String mail, String pwd) throws RuntimeException, RemoteException;
}