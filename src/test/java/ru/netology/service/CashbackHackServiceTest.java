package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test

    public void CashbackHackTest() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackTest1() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackTest2() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(0);
        int expected = 1_000;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackTest3() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackTest4() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(1_001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void CashbackHackTest5() {
        CashbackHackService cashbackHack = new CashbackHackService();
        int actual = cashbackHack.remain(1_000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
