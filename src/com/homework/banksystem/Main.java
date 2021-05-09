package com.homework.banksystem;

import com.homework.banksystem.entity.Account;
import com.homework.banksystem.entity.Bill;
import com.homework.banksystem.entity.Deposit;
import com.homework.banksystem.entity.Person;
import com.homework.banksystem.service.DepositService;
import com.homework.banksystem.service.PaymentService;
import com.homework.banksystem.service.TransferService;

/**
 * В данном домашнем задании нужно написать небольшую банковскую систему.
 * Минимальная банковская система будет состоять из классов (сущностей): Bill (счет) Account (аккаунт)
 * Person (личность человека) Deopsit (пополнение счета) Payment (платеж).
 * <p>
 * Связи между сущностями будут такие: Account имеет поле типа Person, так же Account имеет поле типа Bill
 * Deopsit и Payment имеют по одному полю Bill
 * <p>
 * Класс Person будет иметь следующие поля: имя, фамилия, номер телефона.
 * Класс Account будет иметь поля: Bill и Person.
 * Класс Bill будет содеражать поле с числовым значением внутри: например Integer amount
 * Класс Payment будет содержать поле Bill
 * Класс Deopsit будет содержать поле Bill
 * <p>
 * Сценарии:
 * Созадние нескольких аккаунтов и счетов
 * В классах-сервисах (Напримет класс PaymentService) совершенить платежа (уменьшение счета)
 * И депозит (DepositService) (увеличение счета)
 * <p>
 * Перевод денег с одного аккаунта на другой
 * Создать дополнительный класс TransferService, создать в нем метод transfer и реализовать логику перевода денег с одного аккаунта на другой
 * <p>
 * В методе main не должно происходить никакой логики, кроме вызовов сервисов.
 * Сервисы будут выполнять все действия, в методе main можно только создавать изначальные объекты и вызывать сервисы
 * <p>
 * Так же стоит предусмотреть критические случаи, например не оставлять отрицательную сумму на счету
 */
public class Main {
    public static void main(String[] args) {
        Person SomePerson = new Person("Azamat", "Serikuly", "+777-777-77-77");
        Bill someBill = new Bill(10000);
        Account Azamat = new Account(SomePerson, someBill);

        Person SomePerson1 = new Person("Akan", "Maratuly", "+777-888-88-88");
        Bill someBill1 = new Bill(8000);
        Account Akan = new Account(SomePerson1, someBill1);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(Azamat, 1000);
        paymentService.pay(Akan, 1500);

        System.out.println();

        DepositService depositService = new DepositService();
        depositService.deposit(Azamat, 2000);
        depositService.deposit(Akan, 1000);

        System.out.println();

        TransferService transferService = new TransferService();
        transferService.transfer(Azamat, Akan, 3000);
    }
}
