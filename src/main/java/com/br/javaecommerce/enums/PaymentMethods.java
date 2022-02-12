package com.br.javaecommerce.enums;

public enum PaymentMethods {
    CREDITCARD("Cartão de crédito"),
    BOLETO("Boleto");

    private final String description;

    PaymentMethods(String description) {
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
