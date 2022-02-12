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
@Table(name = "invoices")
public class Invoice {
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Invoice)) {
            return false;
        }
        Invoice invoice = (Invoice) o;
        return id == invoice.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
