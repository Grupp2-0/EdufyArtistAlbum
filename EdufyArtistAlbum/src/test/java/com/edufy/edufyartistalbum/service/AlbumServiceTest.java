package com.edufy.edufyartistalbum.service;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import com.edufy.edufyartistalbum.repository.AlbumArtistRepo;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.mock;

@SpringBootTest
class AlbumServiceTest {
    @MockBean
    AlbumArtistRepo albumArtistRepo;
    Album albumMock = mock(Album.class);

    @Test
    void getAlbumForOneArtistTest(){
        List<AlbumArtist> list = new ArrayList<>();
        Artist artist = new Artist(1, "Magnus Uggla");
        AlbumArtist albumArtist = new AlbumArtist(1, albumMock, artist);
        list.add(albumArtist);
        Mockito.when(albumArtistRepo.findAllByArtistArtistId(artist))
                .thenReturn(list);
        List<AlbumArtist> listTest = albumArtistRepo.findAllByArtistArtistId(artist);
        assertEquals(listTest.get(0).getArtistArtistId().getId(), artist.getId());
    }
}
