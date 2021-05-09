package com.homework.banksystem.entity;

/* ${@Author} created on 06.05.2021 inside the package - com.homework.banksystem */
public class Bill{
    private int amount;

    public Bill(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
