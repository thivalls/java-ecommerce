package com.br.javaecommerce.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.br.javaecommerce.enums.BillPaymentStatus;

@Entity
@Table(name = "payments")
public class BillToPay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private BigDecimal total;
    private BigDecimal discount;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dueDate;

    @Temporal(TemporalType.DATE)
    private Date PaymentDate;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BillPaymentStatus status;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(name = "person_receive_fk", value = ConstraintMode.CONSTRAINT))
    private Person person;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "provider_id", nullable = false, foreignKey = @ForeignKey(name = "provider_receive_fk", value = ConstraintMode.CONSTRAINT))
    private Person provider;

    @ManyToOne(targetEntity = PaymentMethod.class)
    @JoinColumn(name = "payment_method", nullable = false, foreignKey = @ForeignKey(name = "payment_method_fk", value = ConstraintMode.CONSTRAINT))
    private PaymentMethod paymentMethods;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        PaymentDate = paymentDate;
    }

    public BillPaymentStatus getStatus() {
        return status;
    }

    public void setStatus(BillPaymentStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Person getProvider() {
        return provider;
    }

    public void setProvider(Person provider) {
        this.provider = provider;
    }

    public PaymentMethod getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(PaymentMethod paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BillToPay billToPay = (BillToPay) o;
        return id.equals(billToPay.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
