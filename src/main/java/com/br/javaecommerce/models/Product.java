package com.br.javaecommerce.models;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unity;
    private String name;

    private Boolean active = Boolean.TRUE;

    @Column(columnDefinition = "text")
    private String description;
    
    private Double weight;
    private Double width;
    private Double height;
    private Double depth;
    private BigDecimal salePrice = BigDecimal.ZERO;
    private int stock = 0;
    private int alertMinStockQuantity = 0;
    private String videoLink;
    private Boolean showMinStockAlert = Boolean.FALSE;
    private int views;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnity() {
        return this.unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDepth() {
        return this.depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getAlertMinStockQuantity() {
        return this.alertMinStockQuantity;
    }

    public void setAlertMinStockQuantity(int alertMinStockQuantity) {
        this.alertMinStockQuantity = alertMinStockQuantity;
    }

    public String getVideoLink() {
        return this.videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Boolean isShowMinStockAlert() {
        return this.showMinStockAlert;
    }

    public Boolean getShowMinStockAlert() {
        return this.showMinStockAlert;
    }

    public void setShowMinStockAlert(Boolean showMinStockAlert) {
        this.showMinStockAlert = showMinStockAlert;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Product)) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
