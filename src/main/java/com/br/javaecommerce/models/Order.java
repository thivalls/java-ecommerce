package com.br.javaecommerce.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
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
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Person.class)
    @JoinColumn(name = "person_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_person_fk"))
    private Person person;

    @ManyToOne
    @JoinColumn(name = "billing_address_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_bill_address_fk"))
    private Address billingAddress;

    @ManyToOne
    @JoinColumn(name = "shipping_address_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_ship_address_fk"))
    private Address shippingAddress;

    private BigDecimal total;
    private BigDecimal discount;
    private BigDecimal shipping;
    private int daysForDelivery;

    @Temporal(TemporalType.DATE)
    private Date saleDate;

    @Temporal(TemporalType.DATE)
    private Date deliveryDate;

    @OneToOne
    @JoinColumn(name = "sale_invoice_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_sale_invoice_fk"))
    private SaleInvoice saleInvoice;

    @ManyToOne
    @JoinColumn(name = "payment_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_payment_fk"))
    private PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "coupon_id", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "order_coupon_fk"))
    private Coupon coupon;

    public Order() {
    }

    public Order(long id, Person person, Address billingAddress, Address shippingAddress, BigDecimal total,
            BigDecimal discount, BigDecimal shipping, int daysForDelivery, Date saleDate, Date deliveryDate,
            SaleInvoice saleInvoice, PaymentMethod paymentMethod, Coupon coupon) {
        this.id = id;
        this.person = person;
        this.billingAddress = billingAddress;
        this.shippingAddress = shippingAddress;
        this.total = total;
        this.discount = discount;
        this.shipping = shipping;
        this.daysForDelivery = daysForDelivery;
        this.saleDate = saleDate;
        this.deliveryDate = deliveryDate;
        this.saleInvoice = saleInvoice;
        this.paymentMethod = paymentMethod;
        this.coupon = coupon;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public BigDecimal getShipping() {
        return this.shipping;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public int getDaysForDelivery() {
        return this.daysForDelivery;
    }

    public void setDaysForDelivery(int daysForDelivery) {
        this.daysForDelivery = daysForDelivery;
    }

    public Date getSaleDate() {
        return this.saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Date getDeliveryDate() {
        return this.deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public SaleInvoice getSaleInvoice() {
        return this.saleInvoice;
    }

    public void setSaleInvoice(SaleInvoice saleInvoice) {
        this.saleInvoice = saleInvoice;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Coupon getCoupon() {
        return this.coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Order id(long id) {
        setId(id);
        return this;
    }

    public Order person(Person person) {
        setPerson(person);
        return this;
    }

    public Order billingAddress(Address billingAddress) {
        setBillingAddress(billingAddress);
        return this;
    }

    public Order shippingAddress(Address shippingAddress) {
        setShippingAddress(shippingAddress);
        return this;
    }

    public Order total(BigDecimal total) {
        setTotal(total);
        return this;
    }

    public Order discount(BigDecimal discount) {
        setDiscount(discount);
        return this;
    }

    public Order shipping(BigDecimal shipping) {
        setShipping(shipping);
        return this;
    }

    public Order daysForDelivery(int daysForDelivery) {
        setDaysForDelivery(daysForDelivery);
        return this;
    }

    public Order saleDate(Date saleDate) {
        setSaleDate(saleDate);
        return this;
    }

    public Order deliveryDate(Date deliveryDate) {
        setDeliveryDate(deliveryDate);
        return this;
    }

    public Order saleInvoice(SaleInvoice saleInvoice) {
        setSaleInvoice(saleInvoice);
        return this;
    }

    public Order paymentMethod(PaymentMethod paymentMethod) {
        setPaymentMethod(paymentMethod);
        return this;
    }

    public Order coupon(Coupon coupon) {
        setCoupon(coupon);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return id == order.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

}
