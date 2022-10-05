package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 *Via interfacet ArtistRepo kan vi ställa frågor till databasen och hämta Artist-objekt.
 *@author Daniel Solölid
*/
public interface ArtistRepo extends JpaRepository<Artist, Integer> {
    Artist findArtistById(int artistId);
}
