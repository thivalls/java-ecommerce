package com.br.javaecommerce.enums;

public enum DeliveryStatus {
    DELIVERED("Entregue"),
    OUTFORDELIVERY("Saiu para entrega"),
    INTRANSIT("Em trânsito");


    private final String description;

    DeliveryStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
