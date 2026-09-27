package musicclub;

public class LocalPlayer implements MusicPlayer {

    @Override
    public void play(String song) {
        System.out.println("Local player is playing: " + song);
    }
}