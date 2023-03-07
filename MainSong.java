package C4toSem;


import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MainSong extends Thread {
        String nombre;

        public MainSong(String nombre) {
            this.nombre = nombre;
        }
        public void run() {
            try {
                File archivoSonido = new File("C:\\Users\\juand\\OneDrive\\Documents\\NetBeansProjects\\Franquito\\src\\C4toSem\\a.wav.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(archivoSonido));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.out.println("Error al reproducir el archivo de sonido: " + e.getMessage());
            }
        }
    
}
