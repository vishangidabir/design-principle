package com.breidgelabz;

public class AdapterPattern {
    public static void main(String[] args) {
        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        System.out.print(creditCard.getCreditCard());
    }
}
