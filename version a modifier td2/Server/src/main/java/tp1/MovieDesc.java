package tp1;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MovieDesc extends UnicastRemoteObject implements tp1.Distante.MovieDesc, Serializable {
    private String ISBN;
    private String Description;
    private String movieName;

    public MovieDesc(String movieName,String Description,String ISBN) throws RemoteException {
        this.Description = Description;
        this.movieName=movieName;
        this.ISBN=ISBN;
    }
    @Override
    public String getMovieName() {
        return movieName;
    }

    @Override
    public String isbn() {
        return this.ISBN;
    }

    @Override
    public String synopsis() {
        return Description;
    }
}
