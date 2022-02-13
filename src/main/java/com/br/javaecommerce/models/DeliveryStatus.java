package com.br.javaecommerce.models;

import java.util.Objects;

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
@Table(name = "traces")
public class DeliveryStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String distributionCenter;
    private String city;
    private String state;
    private String status;

    @ManyToOne
    @JoinColumn(name = "order_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "traces_order_fk"))
    private Order order;


    public DeliveryStatus() {
    }

    public DeliveryStatus(long id, String distributionCenter, String city, String state, String status) {
        this.id = id;
        this.distributionCenter = distributionCenter;
        this.city = city;
        this.state = state;
        this.status = status;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDistributionCenter() {
        return this.distributionCenter;
    }

    public void setDistributionCenter(String distributionCenter) {
        this.distributionCenter = distributionCenter;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DeliveryStatus id(long id) {
        setId(id);
        return this;
    }

    public DeliveryStatus distributionCenter(String distributionCenter) {
        setDistributionCenter(distributionCenter);
        return this;
    }

    public DeliveryStatus city(String city) {
        setCity(city);
        return this;
    }

    public DeliveryStatus state(String state) {
        setState(state);
        return this;
    }

    public DeliveryStatus status(String status) {
        setStatus(status);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof DeliveryStatus)) {
            return false;
        }
        DeliveryStatus deliveryStatus = (DeliveryStatus) o;
        return id == deliveryStatus.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
