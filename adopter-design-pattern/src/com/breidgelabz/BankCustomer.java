package com.breidgelabz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    @Override
    public void giveBankDetails() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the account holder name: ");
            String customerName = bufferedReader.readLine();
            System.out.println();

            System.out.print("Enter the account number: ");
            long accountNumber = Long.parseLong(bufferedReader.readLine());
            System.out.println();

            System.out.print("Enter the bank name: ");
            String bankName = bufferedReader.readLine();

            setAccountHolderName(customerName);
            setAccountNumber(accountNumber);
            setBankName(bankName);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accountNumber = getAccountNumber();
        String accountHolderName = getAccountHolderName();
        String bankName = getBankName();
        return ("The account number " + accountNumber + " of" + " " + accountHolderName + " in" + " " + bankName + " bank is valid and authenticated for issuing the credit card.");
    }
}
