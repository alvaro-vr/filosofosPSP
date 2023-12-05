/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filosofos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class Consumidor implements Runnable {

    public final Gestor gestor;
    public int idFilosofo;

    public Consumidor(int idFilosofo, Gestor gestor) {
        this.gestor = gestor;
        this.idFilosofo = idFilosofo;
    }

    @Override
    public void run() {

        while (true) {
            try {
                gestor.comer(idFilosofo);
                Thread.sleep(1000);
                gestor.pensar(idFilosofo);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
