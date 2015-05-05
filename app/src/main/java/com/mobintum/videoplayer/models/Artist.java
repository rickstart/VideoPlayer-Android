package com.mobintum.videoplayer.models;

import android.graphics.drawable.Drawable;

/**
 * Created by Rick on 27/04/15.
 */
public class Artist {

    private String nameArtist;
    private String nameCategory;
    private Drawable picture;

    public Artist(String nameArtist, String nameCategory, Drawable picture) {
        this.nameArtist = nameArtist;
        this.nameCategory = nameCategory;
        this.picture = picture;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public Drawable getPicture() {
        return picture;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }
}
