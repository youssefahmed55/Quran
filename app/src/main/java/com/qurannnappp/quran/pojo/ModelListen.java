package com.qurannnappp.quran.pojo;

public class ModelListen {

    private int image;
    private String Title;
    private String url ;
    private Boolean aBoolean;
    private int id;

    public ModelListen(int image, String title, String url, Boolean aBoolean, int id) {
        this.image = image;
        Title = title;
        this.url = url;
        this.aBoolean = aBoolean;
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
