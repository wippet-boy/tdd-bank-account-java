package org.xpdojo.bank;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Test comment
 */
public class Account {


    int balance = 0;


    public int balance (){
        return balance;
    }

    public void deposit(int amount) {
        if (amount >= 0){
            balance += amount;
        }
    }

    public String statement() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        return "Account{" +
                "balance=" + balance +
                ", date=" + date +
                ", time=" + time +
                '}';
    }


    public void withdraw (int amount) {
        balance = balance - amount;
    }

    public void transfer (Account target, int value) {
        if (balance >= value && value > 0) {
            target.deposit(value);
            this.withdraw(value);
        }
    }
}
