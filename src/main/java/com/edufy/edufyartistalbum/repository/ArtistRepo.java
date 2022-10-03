package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepo extends JpaRepository<Artist, Integer> {
    Artist findArtistById(int artistId);
}
