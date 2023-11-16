import ru.netology.service.CashbackHackService;


import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldReturn100ThenAmountIs900() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 900;
        int actual = cashBack.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn0ThenAmountIs1000() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1000;
        int actual = cashBack.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn900ThenAmountIs1100() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1100;
        int actual = cashBack.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

}
