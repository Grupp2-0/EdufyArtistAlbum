package com.edufy.edufyartistalbum.model;

import javax.persistence.*;

@Entity
@Table(name = "album")
public class Album {

    public Album() {
    }

    public Album(Integer id, String albumName) {
        this.id = id;
        this.albumName = albumName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumid", nullable = false)
    private Integer id;

    @Column(name = "albumname", length = 100)
    private String albumName;

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