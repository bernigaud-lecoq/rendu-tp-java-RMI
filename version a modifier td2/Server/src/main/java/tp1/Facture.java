package tp1;

import java.io.Serializable;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Facture extends UnicastRemoteObject implements tp1.Distante.Facture, Serializable {
    private String moviename;
    private int price;

    public Facture(int price) throws RemoteException {
        this.price = price;
    }
    public Facture(int price,String moviename) throws RemoteException {
        this.price = price;
        this.moviename=moviename;
    }

    public void print(){
        System.out.println("Vous avez été facturé " + price + " euros!");
    }
    public int getPrice(){
        return this.price;
    }
    public String getMoviename(){return this.moviename;}
}
