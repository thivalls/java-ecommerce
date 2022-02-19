package com.br.javaecommerce.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @Column(nullable = false)
    private Integer rate;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(name = "reviews_person_fk", value = ConstraintMode.CONSTRAINT))
    private Person person;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "reviews_product_fk"))
    private Product product;

    public Review() {
    }

    public Review(long id, String description, int invoice, Person person, Product product) {
        this.id = id;
        this.description = description;
        this.rate = invoice;
        this.person = person;
        this.product = product;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Review id(long id) {
        setId(id);
        return this;
    }

    public Review description(String description) {
        setDescription(description);
        return this;
    }


    public Integer getRate() {
        return this.rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }


    public Review person(Person person) {
        setPerson(person);
        return this;
    }

    public Review product(Product product) {
        setProduct(product);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Review)) {
            return false;
        }
        Review review = (Review) o;
        return id == review.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
