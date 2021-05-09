package com.homework.banksystem.entity;

/* ${@Author} created on 06.05.2021 inside the package - com.homework.banksystem */
public class Deposit {
    private Bill bill;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Deposit(Bill bill) {
        this.bill = bill;
    }
}
