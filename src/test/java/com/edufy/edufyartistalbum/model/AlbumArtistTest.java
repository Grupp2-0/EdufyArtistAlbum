package com.edufy.edufyartistalbum.model;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class AlbumArtistTest {
    AlbumArtist albumArtist;
    AlbumArtist spyAlbumArtist;
    Artist artistMock = mock(Artist.class);
    Artist artistMockTest = mock(Artist.class);
    Album albumMock = mock(Album.class);
    Album albumMockTest = mock(Album.class);

    @Test
    void shouldGetId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        assertEquals(1, albumArtist.getId());
    }

    @Test
    void shouldSetId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        spyAlbumArtist = Mockito.spy(albumArtist);
        spyAlbumArtist.setId(2);
        assertEquals(2, spyAlbumArtist.getId());
    }

    @Test
    void shouldGetAlbumAlbumId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        assertEquals(albumMock, albumArtist.getAlbumalbumid());
    }

    @Test
    void shouldSetAlbumAlbumId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        spyAlbumArtist = Mockito.spy(albumArtist);
        spyAlbumArtist.setAlbumalbumid(albumMockTest);
        assertEquals(albumMockTest, spyAlbumArtist.getAlbumalbumid());
    }

    @Test
    void shouldGetArtistArtistId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        assertEquals(artistMock, albumArtist.getArtistArtistId());
    }

    @Test
    void shouldSetArtistArtistId() {
        albumArtist = new AlbumArtist(1, albumMock, artistMock);
        spyAlbumArtist = Mockito.spy(albumArtist);
        spyAlbumArtist.setArtistArtistId(artistMockTest);
        assertEquals(artistMockTest, spyAlbumArtist.getArtistArtistId());
    }


}
