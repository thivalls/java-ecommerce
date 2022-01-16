package com.br.javaecommerce.enums;

public enum AddressType {
    DELIVERY("Entrega"),
    BILLING("Cobrança");

    private String description;

    AddressType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.description;
    }
}
