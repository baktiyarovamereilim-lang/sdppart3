package test;

import musicclub.LegacyMusicAdapter;
import musicclub.LegacyMusicService;
import musicclub.MusicPlayer;
import musicclub.MusicPlayerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LegacyMusicAdapterTest {

    @Test
    void adapterTranslatesLegacyNotFoundError() {
        MusicPlayer adapter =
                new LegacyMusicAdapter(new LegacyMusicService());

        MusicPlayerException exception =
                assertThrows(
                        MusicPlayerException.class,
                        () -> adapter.play("")
                );

        assertEquals(
                "Track was not found in legacy music service",
                exception.getMessage()
        );
    }
}