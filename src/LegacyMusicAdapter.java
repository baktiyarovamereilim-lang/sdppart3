package musicclub;

public class LegacyMusicAdapter implements MusicPlayer {

    private final LegacyMusicService legacyService;

    public LegacyMusicAdapter(LegacyMusicService legacyService) {
        this.legacyService = legacyService;
    }

    @Override
    public void play(String song) {

        int trackId = convertSongToTrackId(song);
        int volume = 80;

        int resultCode = legacyService.startTrack(trackId, volume);

        if (resultCode == 400) {
            throw new MusicPlayerException(
                    "Invalid volume for legacy music service"
            );
        }

        if (resultCode == 404) {
            throw new MusicPlayerException(
                    "Track was not found in legacy music service"
            );
        }

        if (resultCode != 0) {
            throw new MusicPlayerException(
                    "Legacy music service failed"
            );
        }
    }

    private int convertSongToTrackId(String song) {

        if (song == null || song.isBlank()) {
            return -1;
        }

        return Math.abs(song.hashCode());
    }
}