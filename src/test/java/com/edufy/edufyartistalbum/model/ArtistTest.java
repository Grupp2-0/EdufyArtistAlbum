package com.edufy.edufyartistalbum.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class ArtistTest {
    Artist artist;
    Artist spyArtist;

    @Test
    void shouldGetId() {
        artist = new Artist(1, "Test Artist");
        assertEquals(1, artist.getId());
    }

    @Test
    void shouldSetId() {
        artist = new Artist(1, "Test Artist");
        spyArtist = Mockito.spy(artist);
        spyArtist.setId(2);
        assertEquals(2, spyArtist.getId());
    }

    @Test
    void shouldGetArtistName() {
        artist = new Artist(1, "Test Artist");
        assertEquals("Test Artist", artist.getArtistName());
    }

    @Test
    void shouldSetArtistName() {
        artist = new Artist(1, "Test Artist");
        spyArtist = Mockito.spy(artist);
        spyArtist.setArtistName("Test Artist");
        assertEquals("Test Artist", spyArtist.getArtistName());
    }
}
