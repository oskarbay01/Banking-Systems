package com.homework.banksystem.entity;

/**
 *
 */
public class Payment {
private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Payment(Bill bill) {
        this.bill = bill;
    }
}
