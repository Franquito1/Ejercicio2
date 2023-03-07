package C4toSem;

public class MainSong3 extends Thread {
        String nombre;

        public MainSong3(String nombre) {
            this.nombre = nombre;
        }

        public void run() {

              System.out.println( nombre + " realizará una cuenta progresiva");
                           for (int i = 1; i <= 10; i++) {
                    System.out.println(nombre+" contando: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Conteo " +nombre+" finalizado.");
            }

       
}
