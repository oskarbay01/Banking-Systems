package com.homework.banksystem.service;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;

public class DepositService {
    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();

        int currentBill = bill.getAmount();
        System.out.println("Операция пополнения счета,текущий значение счета " + currentBill);
        bill.setAmount(currentBill + amount);
        System.out.println("Пополнения счета прошло успешно,новое значение счета " + bill.getAmount());

    }
}
