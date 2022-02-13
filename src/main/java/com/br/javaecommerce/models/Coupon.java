package com.br.javaecommerce.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "coupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private BigDecimal value;
    private BigDecimal percentage;

    @Temporal(TemporalType.DATE)
    private Date due;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getValue() {
        return this.value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getPercentage() {
        return this.percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Date getDue() {
        return this.due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Coupon)) {
            return false;
        }
        Coupon discountCoupon = (Coupon) o;
        return Objects.equals(id, discountCoupon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}