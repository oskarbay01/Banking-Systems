package com.homework.banksystem.service;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;

public class PaymentService {
    public void pay(Account account, int amount) {

        Bill bill = account.getBill();//получение счет из аккаунта
        if (bill.getAmount() < amount) {
            System.out.println("Платеж невозможен,недостаточно стредств");
        } else {
            int currentBill = bill.getAmount();
            System.out.println("Происходить операция платежа,текущее значение счета " + currentBill);
            bill.setAmount(currentBill - amount);
            System.out.println("Платеж завершен,новое значение счета " + bill.getAmount());
        }
    }
}
