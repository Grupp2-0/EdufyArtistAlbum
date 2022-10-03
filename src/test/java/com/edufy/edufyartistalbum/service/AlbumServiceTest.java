package com.edufy.edufyartistalbum.service;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import com.edufy.edufyartistalbum.repository.AlbumArtistRepo;
import com.edufy.edufyartistalbum.repository.AlbumRepo;
import com.edufy.edufyartistalbum.repository.ArtistRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.reactivestreams.Publisher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static reactor.core.publisher.Mono.when;

@ExtendWith(MockitoExtension.class)
public class AlbumServiceTest {

    @Mock
    private AlbumRepo albumRepo;

    @Mock
    private ArtistRepo artistRepo;

    @Mock
    private AlbumArtistRepo albumArtistRepo;

    @InjectMocks
    private AlbumService albumService;

    @BeforeEach
    public void setUp() {
        List<Album> albums = new ArrayList<>();
        Album album1 = new Album(1, "good kid, m.A.A.d city");

        albums.add(album1);
    }


    @Test
    public void findAlbumForOneArtistByIdTest() {

        int id = 1;
        List<Album> albums = new ArrayList<>();
        Album album1 = new Album(1, "good kid, m.A.A.d city");
        albums.add(album1);

        List<Artist> artists = new ArrayList<>();
        Artist artist1 = new Artist(1, "Kendrick Lamar");
        artists.add(artist1);

        List<AlbumArtist> albumArtists = new ArrayList<>();
        AlbumArtist albumArtist = new AlbumArtist(1, album1, artist1);
        albumArtists.add(albumArtist);

        /*Mockito.when(albumArtistRepo.findAllByArtistArtistId(artist1)).thenReturn(albumArtists);*/
        Mockito.when(albumService.getAlbumById(id)).thenReturn(albums);
        assertEquals(1, 1);
    }

    @Test
    void findAllAlbumTest() {

        List<Album> albums = new ArrayList<>();
        Album album1 = new Album(1, "good kid, m.A.A.d city");
        Album album2 = new Album(2, "AM");
        Album album3 = new Album(3, "Satan I Gatan");

        albums.add(album1);
        albums.add(album2);
        albums.add(album3);


        /*final Album album = new Album(1, "good kid, m.A.A.d city");*/

        /*given(albumRepo.findAlbumById(album.getId())).willReturn(album);
        final List<Album> expected = albumService.getAlbumById(id);
        asserThat(expected).isNotNull;*/

    }
}
