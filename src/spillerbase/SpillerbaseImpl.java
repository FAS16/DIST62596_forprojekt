/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spillerbase;

import galgeleg.GalgeImpl;
import galgeleg.GalgeInterface;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author fahadali
 */
public class SpillerbaseImpl extends UnicastRemoteObject implements SpillerbaseI {

    HashMap<String, GalgeImpl> galgeMap = new HashMap<>(); //kunne gemmes

    public SpillerbaseImpl() throws java.rmi.RemoteException {
    }

    @Override
    public GalgeInterface findSpil(String navn) throws RemoteException {
        System.out.println("findSpil(" + navn);
        return galgeMap.get(navn);
    }

    @Override
    public ArrayList<String> hentAlleSpillere() throws RemoteException {
        System.out.println("hentAlleSpillere()");
        return new ArrayList<>(galgeMap.keySet());
    }

    @Override
    public void registrerSpiller(String navn) throws RemoteException {

        if (galgeMap.containsKey(navn)) {
            throw new IllegalArgumentException("Spiller eksisterer allerede: " + navn);

        } else {
            System.out.println("Spiller registreret: " + navn);
            galgeMap.put(navn, new GalgeImpl());
        }
    }

}
