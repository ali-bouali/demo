package com.demo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Ad implements Serializable {

    @Id
    @GeneratedValue
    private Long idAd;

    private String title;
    private String description;
    private Date creationDate;
    private Date publishDate;
    private String adType;
    private String location;

    @ManyToOne
    @JoinColumn
    private User advertiser;

    @OneToOne
    @JoinColumn
    private Product product;

    @ManyToOne
    @JoinColumn
    private Category adCategory;

    public Ad(String title, String description, Date creationDate, Date publishDate, String adType, String location) {
        this.title = title;
        this.description = description;
        this.creationDate = creationDate;
        this.publishDate = publishDate;
        this.adType = adType;
        this.location = location;
    }

    public Long getIdAd() {
        return idAd;
    }

    public void setIdAd(Long idAd) {
        this.idAd = idAd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
