package C4toSem;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MAINSong11 {
    public static void main(String[] args) {

        Thread MainSong2 = new MainSong2("Accion 1");
        Thread MainSong3 = new MainSong3("Accion 2");
        Thread MainSong = new MainSong("Hilo de la canción");

        MainSong3.start();
        MainSong2.start();
        MainSong.start();
    }
}
