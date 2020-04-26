package com.example.tessuitmediasatu;

public class Event {
    private String headingSatu, headingDua, tanggal, caption;
    private int image;

    public Event(String headingSatu, String headingDua, String tanggal, String caption, int image) {
        this.headingSatu = headingSatu;
        this.headingDua = headingDua;
        this.tanggal = tanggal;
        this.caption = caption;
        this.image = image;
    }

    public Event(){

    }

    public String getHeadingSatu() {
        return headingSatu;
    }

    public void setHeadingSatu(String headingSatu) {
        this.headingSatu = headingSatu;
    }

    public String getHeadingDua() {
        return headingDua;
    }

    public void setHeadingDua(String headingDua) {
        this.headingDua = headingDua;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
