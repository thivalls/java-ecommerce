package com.br.javaecommerce.enums;

public enum BillReceiveStatus {
    PAYED("Quitada"),
    OPENED("Aberta"),
    EXPIRED("Vencida"),
    NOPAYED("À pagar");

    private final String description;

    BillReceiveStatus(String description) {
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
