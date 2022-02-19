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
@Table(name = "invoice_product_items")
public class InvoiceProductItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "product_item_fk"))
    private Product product;

    @ManyToOne
    @JoinColumn(name = "invoice_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "invoice_item_fk"))
    private PurchaseInvoice invoice;

    @Column(nullable = false)
    private Double quantity;


    public InvoiceProductItem() {
    }

    public InvoiceProductItem(long id, Product product, PurchaseInvoice invoice, Double quantity) {
        this.id = id;
        this.product = product;
        this.invoice = invoice;
        this.quantity = quantity;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public PurchaseInvoice getInvoice() {
        return this.invoice;
    }

    public void setInvoice(PurchaseInvoice invoice) {
        this.invoice = invoice;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public InvoiceProductItem id(long id) {
        setId(id);
        return this;
    }

    public InvoiceProductItem product(Product product) {
        setProduct(product);
        return this;
    }

    public InvoiceProductItem invoice(PurchaseInvoice invoice) {
        setInvoice(invoice);
        return this;
    }

    public InvoiceProductItem quantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof InvoiceProductItem)) {
            return false;
        }
        InvoiceProductItem invoiceProductItem = (InvoiceProductItem) o;
        return id == invoiceProductItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
