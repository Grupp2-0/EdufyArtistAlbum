package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.model.AlbumArtist;
import com.edufy.edufyartistalbum.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 *Via interfacet AlbumArtistRepo kan vi ställa frågor till databasen och hämta AlbumArtist-objekt.
 *@author Daniel Solölid
*/
@Repository
public interface AlbumArtistRepo extends JpaRepository<AlbumArtist, Integer> {
    List<AlbumArtist> findAllByArtistArtistId(Artist artist);
}

