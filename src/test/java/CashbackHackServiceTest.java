import org.junit.Assert;
import ru.netology.service.CashbackHackService;


public class CashbackHackServiceTest {
    @org.junit.Test
    public void shouldReturn100ThenAmountIs900() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 900;
        int actual = cashBack.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0ThenAmountIs1000() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1000;
        int actual = cashBack.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn900ThenAmountIs1100() {
        CashbackHackService cashBack = new CashbackHackService();
        int amount = 1100;
        int actual = cashBack.remain(amount);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }

}
