package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 *Via interfacet AlbumRepo kan vi ställa frågor till databasen och hämta Album-objekt.
 *@author Daniel Solölid
 */
@Repository
public interface AlbumRepo extends JpaRepository<Album, Integer> {
    Album findAlbumById(int albumId);
}
