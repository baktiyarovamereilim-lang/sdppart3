package musicclub;

public class MusicPlayerFactory {

    public static MusicPlayer createPlayer(String type) {

        return switch (type.toLowerCase()) {

            case "spotify" ->
                    new SpotifyPlayer();

            case "local" ->
                    new LocalPlayer();

            case "legacy" ->
                    new LegacyMusicAdapter(
                            new LegacyMusicService()
                    );

            default ->
                    throw new IllegalArgumentException(
                            "Unknown music player: " + type
                    );
        };
    }
}