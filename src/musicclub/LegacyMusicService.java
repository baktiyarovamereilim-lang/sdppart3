package musicclub;

public class LegacyMusicService {

    public int startTrack(int trackId, int volume) {

        if (trackId <= 0) {
            return 404;
        }

        if (volume < 0 || volume > 100) {
            return 400;
        }

        System.out.println(
                "Legacy Music Service is playing track ID "
                        + trackId
                        + " at volume "
                        + volume
        );

        return 0;
    }
}