package tp1;

import tp1.Distante.*;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ClientThread extends UnicastRemoteObject implements Runnable, Client {
    private String cname;
    private String pwd;
    private String type;
    public ClientThread(String cname) throws RemoteException{
        this.cname = cname;

    }
    public ClientThread(String cname,String pwd,String type) throws RemoteException{
        this.cname = cname;
        this.pwd=pwd;
        this.type=type;
    }

    @Override
    public  String getmail() throws RemoteException{
        return cname;
    }
    @Override
    public String getpwd() throws RemoteException {
        return pwd;
    }

    @Override
    public void facturer(Facture facture) throws RemoteException {
        int price = facture.getPrice();
        System.out.println(price);
    }
    public void getDescription(MovieDesc movieDesc){
        System.out.println(movieDesc.getMovieName()+"\n"+movieDesc.synopsis());
    }
    //public void stream([]bytes chunck){}

    public void run(){
        try {
            Registry registry = LocateRegistry.getRegistry(2002);
            Connection stubConnection = (Connection) registry.lookup("Connection");

            if(type.equals("signin")){
            Boolean signsucces = stubConnection.signIn(this.cname,this.pwd);
            if(signsucces){
            System.out.println("you registered with email:"+cname+" and password:"+pwd);
            System.out.println("you registered corectly, now relaunch and connect if you want to use the service right now");}
            else{
            System.out.println("registeration failed");}
            }
            if(type.equals("login")){
                VODService signsucces = stubConnection.login(this.cname,this.pwd);
                System.out.println("this is fantastic");
            }
             //Resultat result = stubObjetDistant.sayResult(12);
             //System.out.println(result.toString());
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
