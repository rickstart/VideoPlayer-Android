package com.mobintum.videoplayer.models;

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
}
