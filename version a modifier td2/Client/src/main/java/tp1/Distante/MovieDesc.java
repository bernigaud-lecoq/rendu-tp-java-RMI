package tp1.Distante;

import java.rmi.Remote;

public interface MovieDesc extends Remote {
    public String getMovieName();
    public String isbn();
    public String synopsis();
}
