package com.example.loginactivity;

public class itemdata {
    String name;
    String asal;
    int image;

    public itemdata(String name, String asal, int image) {
        this.name = name;
        this.asal = asal;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
