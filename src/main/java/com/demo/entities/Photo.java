package com.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Photo implements Serializable {

    @Id
    @GeneratedValue
    private Long idPhoto;
    private String image;
    private String description;

    @ManyToOne
    @JoinColumn
    private Product product;

    public Photo(String image, String description) {
        this.image = image;
        this.description = description;
    }

    public Long getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(Long idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
