package com.br.javaecommerce.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sale_invoices")
public class SaleInvoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String number;
    private String serialNumber;
    private String type;

    @Column(columnDefinition = "text")
    private String xml;
    @Column(columnDefinition = "text")
    private String pdf;


    public SaleInvoice() {
    }

    public SaleInvoice(long id, String number, String serialNumber, String type, String xml, String pdf) {
        this.id = id;
        this.number = number;
        this.serialNumber = serialNumber;
        this.type = type;
        this.xml = xml;
        this.pdf = pdf;
    }

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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getXml() {
        return this.xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getPdf() {
        return this.pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public SaleInvoice id(long id) {
        setId(id);
        return this;
    }

    public SaleInvoice number(String number) {
        setNumber(number);
        return this;
    }

    public SaleInvoice serialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    public SaleInvoice type(String type) {
        setType(type);
        return this;
    }

    public SaleInvoice xml(String xml) {
        setXml(xml);
        return this;
    }

    public SaleInvoice pdf(String pdf) {
        setPdf(pdf);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SaleInvoice)) {
            return false;
        }
        SaleInvoice saleInvoice = (SaleInvoice) o;
        return id == saleInvoice.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
