package com.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class SubCategory implements Serializable {

    @Id
    @GeneratedValue
    private Long idSubCategory;

    @ManyToOne
    @JoinColumn
    private Category parentCategory;

    public SubCategory() {
    }

    public Long getIdSubCategory() {
        return idSubCategory;
    }

    public void setIdSubCategory(Long idSubCategory) {
        this.idSubCategory = idSubCategory;
    }
}
