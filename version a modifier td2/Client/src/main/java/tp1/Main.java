package tp1;
import tp1.Distante.Distante;
import tp1.Distante.Resultat;
import tp1.Distante.Service;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("type login or signin to  advance to the next step\n");
        // String host = (args.length < 1) ? null : args[0];
        Scanner sc = new Scanner(System.in);
        String siglog = sc.nextLine();
        Runnable client1 = null;



        System.out.print("enter your mail\n");
            // String input
        String name = sc.nextLine();
        System.out.print("enter your password\n");


            // String input
        String pwd = sc.nextLine();
        try {
            client1 = new ClientThread(name,pwd,siglog);
            System.out.print(siglog);
            new Thread(client1).start();


        } catch (RemoteException e) {
            System.out.println("error on client main");
            throw new RuntimeException(e);
        }

    }
}