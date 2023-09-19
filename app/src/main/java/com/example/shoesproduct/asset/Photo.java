package com.example.shoesproduct.asset;

public class Photo {
    private int id;
    private String photoSource;
    private String photoTitle;
    private String photoDescription;
    public Photo() {
    }
    public Photo(int id, String photoSource, String photoTitle, String photoDescription) {
        this.id = id;
        this.photoSource = photoSource;
        this.photoTitle = photoTitle;
        this.photoDescription = photoDescription;
    }

    public int getId() {
        return id;
    }

    public String getPhotoSource() {
        return photoSource;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public String getPhotoDescription() {
        return photoDescription;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhotoSource(String photoSource) {
        this.photoSource = photoSource;
    }

    public void setPhotoTitle(String photoTitle) {
        this.photoTitle = photoTitle;
    }

    public void setPhotoDescription(String photoDescription) {
        this.photoDescription = photoDescription;
    }
}
