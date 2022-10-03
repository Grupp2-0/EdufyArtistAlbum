package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumArtistRepo extends JpaRepository<AlbumArtist, Integer> {
    List<AlbumArtist> findAllByArtistArtistId(Artist artist);
}

