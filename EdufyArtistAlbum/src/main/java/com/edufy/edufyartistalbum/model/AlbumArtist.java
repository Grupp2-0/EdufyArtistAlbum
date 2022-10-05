package com.edufy.edufyartistalbum.model;

import javax.persistence.*;

/*
 * Klassen Album får att skapa upp AlbumArtist-objekt ifrån. Har en koppling till AlbumArtist-tabellen i databasen
 * @author Daniel Solölid
 */

@Entity
@Table(name = "album_artist")
public class AlbumArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "albumartistid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "albumalbumid", nullable = false)
    private Album albumalbumid;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "artistartistid", nullable = false)
    private Artist artistArtistId;

    public AlbumArtist(Integer id, Album albumalbumid, Artist artistArtistId) {
        this.id = id;
        this.albumalbumid = albumalbumid;
        this.artistArtistId = artistArtistId;
    }

    public AlbumArtist() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Album getAlbumalbumid() {
        return albumalbumid;
    }

    public void setAlbumalbumid(Album albumAlbumId) {
        this.albumalbumid = albumAlbumId;
    }

    public Artist getArtistArtistId() {
        return artistArtistId;
    }

    public void setArtistArtistId(Artist artistArtistId) {
        this.artistArtistId = artistArtistId;
    }

}