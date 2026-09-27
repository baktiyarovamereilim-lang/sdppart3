package musicclub;

public abstract class MusicEvent {

    protected final MusicPlayer player;

    protected MusicEvent(MusicPlayer player) {
        this.player = player;
    }

    public abstract void playSong(String song);
}