package musicclub;

public class Concert extends MusicEvent {

    public Concert(MusicPlayer player) {
        super(player);
    }

    @Override
    public void playSong(String song) {
        System.out.println("Concert starts!");
        player.play(song);
    }
}