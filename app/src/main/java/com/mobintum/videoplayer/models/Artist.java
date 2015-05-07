package com.mobintum.videoplayer.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.mobintum.videoplayer.R;

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

        switch(nameCategory){

            case "Banda":
                artists.add( new Artist("Julion Alavarez","Banda", context.getResources().getDrawable(R.mipmap.ic_julion)));
                artists.add( new Artist("Banda MS","Banda", context.getResources().getDrawable(R.mipmap.ic_ms)));
                break;
            case "Pop":
                artists.add( new Artist("John Newman","Pop", context.getResources().getDrawable(R.mipmap.ic_john_newman)));
                break;
            case "Electronica":
                artists.add( new Artist("Dash Berlin","Electronica", context.getResources().getDrawable(R.mipmap.ic_dash_berlin)));
                break;
            case "Salsa":
                artists.add( new Artist("Victor Manuelle","Salsa", context.getResources().getDrawable(R.mipmap.ic_victor_manuelle)));
                break;
        }



        return artists;


    }
}
