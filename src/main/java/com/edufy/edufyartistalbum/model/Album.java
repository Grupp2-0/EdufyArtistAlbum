package com.edufy.edufyartistalbum.model;

import javax.persistence.*;

/*
* Klassen Album får att skapa upp Album-objekt ifrån. Har en koppling till Album-tabellen i databasen
* @author Daniel Solölid
*/

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumid", nullable = false)
    private Integer id;
    @Column(name = "albumname", length = 100)
    private String albumName;

    public Album() {
    }

    public Album(Integer id, String albumName) {
        this.id = id;
        this.albumName = albumName;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

}