package filosofos;

public class Filosofos {

    /**
     * @param args the command line arguments
     */
    public static Gestor gestor;
    public static Thread filosofo1;
    public static Thread filosofo2;
    public static Thread filosofo3;
    public static Thread filosofo4;
    public static Thread filosofo5;

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        gestor = new Gestor();
        filosofo1 = new Thread(new Consumidor(1, gestor));
        filosofo2 = new Thread(new Consumidor(2, gestor));
        filosofo3 = new Thread(new Consumidor(3, gestor));
        filosofo4 = new Thread(new Consumidor(4, gestor));
        filosofo5 = new Thread(new Consumidor(5, gestor));


        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();
        filosofo5.start();

    }

}
