/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filosofos;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Gestor {

    boolean[] palillos = {
        true, true, true, true, true
    };

    public synchronized void comer(int nFilosofo) throws InterruptedException {

        switch (nFilosofo) {
            case 1:
                accionComer(0, 1, nFilosofo);
                break;

            case 2:
                accionComer(1, 2, nFilosofo);
                break;

            case 3:
                accionComer(2, 3, nFilosofo);
                break;
            case 4:
                accionComer(3, 4, nFilosofo);
                break;

            case 5:
                accionComer(4, 0, nFilosofo);
                break;

            default:
                throw new AssertionError();
        }
    }

    public synchronized void pensar(int nFilosofo) throws InterruptedException {

        switch (nFilosofo) {
            case 1:
                accionPensar(0, 1, nFilosofo);
                break;

            case 2:
                accionPensar(1, 2, nFilosofo);
                break;

            case 3:
                accionPensar(2, 3, nFilosofo);

                break;
            case 4:
                accionPensar(3, 4, nFilosofo);

                break;

            case 5:
                accionPensar(4, 0, nFilosofo);

                break;

            default:
                throw new AssertionError();
        }
    }

    public void accionComer(int posIzq, int posDer, int nFil) throws InterruptedException {

        if (palillos[posIzq] == true) {

            if (palillos[posDer] == true) {
                palillos[posIzq] = false;
                palillos[posDer] = false;
                System.out.println("Fil_" + nFil + "__COME");
            } else {
                wait();
            }
        } else {
            wait();
        }
    }

    public void accionPensar(int posIzq, int posDer, int nFil) throws InterruptedException {

        System.out.println("Fil_" + nFil + "__PIENSA");
        palillos[posIzq] = true;
        palillos[posDer] = true;
        notifyAll();

    }

}
