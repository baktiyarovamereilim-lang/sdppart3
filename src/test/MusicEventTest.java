package test;

import musicclub.Concert;
import musicclub.MusicPlayer;
import musicclub.Rehearsal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MusicEventTest {

    static class StubMusicPlayer implements MusicPlayer {

        String lastSong;

        @Override
        public void play(String song) {
            lastSong = song;
        }
    }

    @Test
    void concertDelegatesToPlayer() {

        StubMusicPlayer player = new StubMusicPlayer();

        Concert concert = new Concert(player);

        concert.playSong("Believer");

        assertEquals("Believer", player.lastSong);
    }

    @Test
    void rehearsalDelegatesToPlayer() {

        StubMusicPlayer player = new StubMusicPlayer();

        Rehearsal rehearsal = new Rehearsal(player);

        rehearsal.playSong("Numb");

        assertEquals("Numb", player.lastSong);
    }
}