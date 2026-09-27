package musicclub;

public class SpotifyPlayer implements MusicPlayer {

    @Override
    public void play(String song) {
        System.out.println("Spotify is playing: " + song);
    }
}