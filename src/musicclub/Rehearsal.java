package musicclub;

public class Rehearsal extends MusicEvent {

    public Rehearsal(MusicPlayer player) {
        super(player);
    }

    @Override
    public void playSong(String song) {
        System.out.println("Rehearsal starts!");
        player.play(song);
    }
}
