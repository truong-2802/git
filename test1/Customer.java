package com.test1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
        private String customerCode;
        private String customerName;
        private int accNumber;
        private long amount;

        public Customer() {
            this.customerCode = "";
            this.customerName = "";
            this.accNumber = 0;
            this.amount = 0;
        }

        public void input() {
            Scanner a = new Scanner(System.in);

            System.out.println(" customer code (5 characters) :");
            String code = a.nextLine().trim();
            while (code.length() != 5) {
                System.out.println("Invalid customer code .(must be 5 characters). Please try again.");
                System.out.println(" customer code  (5 characters): :");
                code = a.nextLine().trim();
            }
            this.customerCode = code;

            System.out.println(" account number (6 digits starting with 100): : ");
            String account = a.nextLine().trim();
            boolean validAccount = false;
            while (!validAccount) {
                if (account.length() != 6 || !account.startsWith("100")) {
                    System.out.println("Invalid account number  (must be 6 digits starting with 100). Please try again.");
                    System.out.println("Enter account number (6 digits starting with 100)::");
                    account = a.nextLine().trim();
                } else {
                    validAccount = true;
                }
            }
            this.accNumber = Integer.parseInt(account);

            System.out.println(" customer name:");
            String name = a.nextLine().trim();
            while (name.isEmpty()) {
                System.out.println("Invalid customer name. Please re-enter.");
                System.out.println("Enter customer name:");
                name = a.nextLine().trim();
            }
            this.customerName = name;
        }

        public void depositAndWithdraw(long money, int type) {
            if (type == 0) {
                if (money > 0) {
                    this.amount += money;
                    System.out.println("Amount of money " + "$" + money + " has been deposited to the account.");
                } else {
                    System.out.println("Invalid deposit amount.");
                }
            } else if (type == 1) {
                if (money <= this.amount && money > 0) {
                    this.amount -= money;
                    System.out.println("$" + money + " has been withdrawn from the account.");
                } else {
                    System.out.println("Non-sufficient funds or invalid withdrawal amount.");
                }
            }
        }

        @Override
        public String toString() {
            return " " + customerCode + ", " + customerName + ", " + accNumber + ", $" + amount + ".";
    }
}
