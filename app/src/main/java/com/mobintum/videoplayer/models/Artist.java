package com.mobintum.videoplayer.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

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

    public static ArrayList<Artist> getData(Context context, String nameCategory){

        ArrayList<Artist> artists = new ArrayList<Artist>();

        return artists;


    }
}
