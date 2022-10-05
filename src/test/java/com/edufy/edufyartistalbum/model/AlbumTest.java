package com.edufy.edufyartistalbum.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class AlbumTest {
    Album album;
    Album spyAlbum;

    @Test
    void shouldGetId() {
        album = new Album(1, "Test Album");
        assertEquals(1, album.getId());
    }

    @Test
    void shouldSetId() {
        album = new Album(1, "Test Album");
        spyAlbum = Mockito.spy(album);
        spyAlbum.setId(2);
        assertEquals(2, spyAlbum.getId());
    }

    @Test
    void shouldGetAlbumName() {
        album = new Album(1, "Test Album");
        assertEquals("Test Album", album.getAlbumName());
    }

    @Test
    void shouldSetAlbumName() {
        album = new Album(1, "Test Album");
        spyAlbum = Mockito.spy(album);
        spyAlbum.setAlbumName("Test Album");
        assertEquals("Test Album", spyAlbum.getAlbumName());
    }
}
