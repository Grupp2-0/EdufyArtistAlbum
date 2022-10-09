package com.edufy.edufyartistalbum.controller;

import com.edufy.edufyartistalbum.model.Album;
import com.edufy.edufyartistalbum.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/artistAlbum")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    /*Metoden anropas för att hämta samtliga album för en artist
    *@author Daniel Solölid
    *@params Id
    *@returns Id
    */
    @GetMapping("/getArtistAlbum")
    public List<Album> getArtistAlbumById(int id) {
        return albumService.getAlbumById(id);
    }
}
