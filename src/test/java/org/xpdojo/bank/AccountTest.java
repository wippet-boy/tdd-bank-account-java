package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
	public void getBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAmount() {
        Account account = new Account();
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void withdrawAmount() {
        Account account = new Account();
        account.withdraw(5);
        assertThat(account.balance()).isEqualTo(-5);
    }

    public void trasferAmount () {
        Account account = new Account();
        account.deposit(20);
        Account targetAccount = new Account();
        targetAccount.deposit(5);

        account.transfer(targetAccount, 5);

        assertThat(account.balance()).isEqualTo(15);
        assertThat(targetAccount.balance()).isEqualTo(10);

    }


}
