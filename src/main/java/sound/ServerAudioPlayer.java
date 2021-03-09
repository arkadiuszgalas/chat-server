package sound;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class ServerAudioPlayer {

    Clip clip;
    AudioInputStream audioInputStream;
    static String filePath;
    static String localDir;

    public ServerAudioPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        localDir = System.getProperty("user.dir");
        filePath = localDir + "\\src\\main\\resources\\file_example_WAV_1MG.wav";

        audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
    }

    public void play() {
        clip.start();
    }
    public void close() { clip.close(); }
}