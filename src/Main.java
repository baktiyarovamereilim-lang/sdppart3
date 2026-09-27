package musicclub;

public class Main {

    public static void main(String[] args) {

        String playerType = "spotify";

        MusicPlayer player =
                MusicPlayerFactory.createPlayer(playerType);

        MusicEvent concert = new Concert(player);

        concert.playSong("Imagine Dragons - Believer");
    }
}