package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount(100.0);
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        System.out.println("After each test");
    }

    @Test
    public void testDeposit() {
        account.deposit(50.0);

        assertEquals(150.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(40.0);

        assertEquals(60.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawInsufficientFunds() {
        account.withdraw(200.0);

        assertEquals(100.0, account.getBalance(), 0.001);
    }
}
