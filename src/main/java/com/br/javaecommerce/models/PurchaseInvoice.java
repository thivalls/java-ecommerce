package com.br.javaecommerce.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "purchase_invoices")
public class PurchaseInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;
    private String serialNumber;
    private String description;
    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal icms;

    @Temporal(TemporalType.DATE)
    private Date transaction;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    @OneToOne
    private BillToPay billToPay;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTotal() {
        return this.total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getIcms() {
        return this.icms;
    }

    public void setIcms(BigDecimal icms) {
        this.icms = icms;
    }

    public Date getTransaction() {
        return this.transaction;
    }

    public void setTransaction(Date transaction) {
        this.transaction = transaction;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public BillToPay getBillToPay() {
        return this.billToPay;
    }

    public void setBillToPay(BillToPay billToPay) {
        this.billToPay = billToPay;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PurchaseInvoice)) {
            return false;
        }
        PurchaseInvoice invoice = (PurchaseInvoice) o;
        return id == invoice.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
