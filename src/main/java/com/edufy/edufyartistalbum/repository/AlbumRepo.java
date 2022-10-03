package com.edufy.edufyartistalbum.repository;

import com.edufy.edufyartistalbum.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepo extends JpaRepository<Album, Integer> {
    Album findAlbumById(int albumId);
}
