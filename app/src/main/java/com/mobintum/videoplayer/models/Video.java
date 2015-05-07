package com.mobintum.videoplayer.models;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Rick on 27/04/15.
 */
public class Video {

    private String nameVideo;
    private String url;
    private String nameArtist;


    public Video(String nameVideo, String url, String nameArtist) {
        this.nameVideo = nameVideo;
        this.url = url;
        this.nameArtist = nameArtist;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static ArrayList<Video> getData(Context context, String nameArtist){

        ArrayList<Video> videos = new ArrayList<Video>();
        String vidAddress = "http://mobintum.com/video/John%20Newman%20-%20Love%20Me%20Again.mp4";

        switch(nameArtist){

            case "Julion Alavarez":
                videos.add(new Video("Así Fue", vidAddress,"Julion Alavarez"));
                break;
            case "Banda MS":

                break;
            case "John Newman":

                break;
            case "Dash Berlin":

                break;
            case "Victor Manuelle":

                break;
        }



        return videos;


    }
}
