package com.br.javaecommerce.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition = "text", nullable = false)
    private String image;
    
    @Column(columnDefinition = "text", nullable = false)
    private String thumb;

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public ProductImage() {
    }

    public ProductImage(long id, String image, String thumb, Product product) {
        this.id = id;
        this.image = image;
        this.thumb = thumb;
        this.product = product;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getThumb() {
        return this.thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductImage id(long id) {
        setId(id);
        return this;
    }

    public ProductImage image(String image) {
        setImage(image);
        return this;
    }

    public ProductImage thumb(String thumb) {
        setThumb(thumb);
        return this;
    }

    public ProductImage product(Product product) {
        setProduct(product);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductImage)) {
            return false;
        }
        ProductImage productImage = (ProductImage) o;
        return id == productImage.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
