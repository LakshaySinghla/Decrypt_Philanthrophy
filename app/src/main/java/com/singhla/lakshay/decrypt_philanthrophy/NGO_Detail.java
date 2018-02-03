package com.singhla.lakshay.decrypt_philanthrophy;

/**
 * Created by Lakshay Singhla on 03-Feb-18.
 */

public class NGO_Detail {
    private long id ;
    private float target;
    private String name , img, description;

    public float getTarget() {
        return target;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTarget(float target) {
        this.target = target;
    }
}

