package com.edufy.edufyartistalbum.service;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import com.edufy.edufyartistalbum.repository.AlbumArtistRepo;
import com.edufy.edufyartistalbum.repository.AlbumRepo;
import com.edufy.edufyartistalbum.repository.ArtistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {
    @Autowired
    AlbumArtistRepo albumArtistRepo;
    @Autowired
    AlbumRepo albumRepo;
    @Autowired
    ArtistRepo artistRepo;

    public AlbumService() {
    }

    public AlbumService(AlbumArtistRepo albumArtistRepo, AlbumRepo albumRepo, ArtistRepo artistRepo) {
        this.albumArtistRepo = albumArtistRepo;
        this.albumRepo = albumRepo;
        this.artistRepo = artistRepo;
    }

    public List<Album> getAlbumById(int artistId) {
        Artist artist = artistRepo.findArtistById(artistId);
        List<AlbumArtist> albumArtists = albumArtistRepo.findAllByArtistArtistId(artist);
        List<Album> albums = new ArrayList<>();
        for (AlbumArtist a : albumArtists) {
            albums.add(albumRepo.findAlbumById(a.getAlbumalbumid().getId()));
        }
        return albums;
    }
}
