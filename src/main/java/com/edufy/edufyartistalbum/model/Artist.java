package com.edufy.edufyartistalbum.model;

import javax.persistence.*;

/*
 * Klassen Album får att skapa upp Artist-objekt ifrån. Har en koppling till Artist-tabellen i databasen
 * @author Daniel Solölid
 */

@Entity
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistid", nullable = false)
    private Integer id;
    @Column(name = "artistname", nullable = false, length = 100)
    private String artistName;

    public Artist() {
    }

    public Artist(Integer id, String artistName) {
        this.id = id;
        this.artistName = artistName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

}