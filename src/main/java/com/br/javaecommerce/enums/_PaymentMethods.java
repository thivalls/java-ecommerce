package com.br.javaecommerce.enums;

public enum _PaymentMethods {
    CREDITCARD("Cartão de crédito"),
    BOLETO("Boleto");

    private final String description;

    _PaymentMethods(String description) {
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
