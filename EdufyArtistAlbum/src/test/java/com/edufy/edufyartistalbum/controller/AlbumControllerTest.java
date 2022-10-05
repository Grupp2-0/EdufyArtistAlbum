package com.edufy.edufyartistalbum.controller;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import com.edufy.edufyartistalbum.service.AlbumService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

@SpringBootTest
public class AlbumControllerTest {
    @MockBean
    AlbumService albumService;

    @Test
    void getAlbumForOneArtistTest() {
        List<Album> list = new ArrayList<>();
        Artist artist = new Artist(1, "Test Artist");
        Album album = new Album(1, "Test Album");
        list.add(album);
        Mockito.when(albumService.getAlbumById(artist.getId()))
                .thenReturn(list);
        List<Album> listTest = albumService.getAlbumById(artist.getId());
        assertEquals(listTest.get(0).getId(), artist.getId());
    }
}
