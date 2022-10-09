package tp1;

import tp1.Distante.Client;
import tp1.Distante.VODService;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Connection extends UnicastRemoteObject implements tp1.Distante.Connection , Serializable {
    private String[] clientlist;
    private String[] pwdList;
    private int nbclient;
    //private Movies[] movielist;
    public Connection() throws RemoteException{
        nbclient=0;
        this.clientlist=new String[10000];
    }

    @Override
    public boolean signIn(String mail, String pwd) throws RuntimeException, RemoteException {
        System.out.println("we're there");
        for(int i=0;i<nbclient;i++){
            if(clientlist[i]==mail){
                return false;
            }
        }
        clientlist[nbclient]=mail;
        pwdList[nbclient]=pwd;
        nbclient+=1;
        System.out.println(clientlist[nbclient-1]);
        System.out.println(pwdList[nbclient-1]);
        return true;
    }
    @Override
    public VODService login(String mail, String pwd){
        for(int i=0;i<nbclient;i++){
            if(clientlist[i]==mail){
                if(pwdList[i]==pwd){
                    return null;
                }
            }
        }

        return null;
    }
}
