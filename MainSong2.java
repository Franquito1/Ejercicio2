package C4toSem;

public class MainSong2 extends Thread {
        String nombre;

        public MainSong2(String nombre) {
            this.nombre = nombre;
        }

        public void run() {

              System.out.println( nombre + " realizará un conteo regresivo");
                           for (int i = 10; i > 0; i--) {
                    System.out.println(nombre + " contando: " + i);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Conteo " +nombre+" finalizado.");
            }

       
}
