import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testExactlyOneThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }



    @org.junit.Test
    public void testLessThanOneThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals (expected, actual);
    }

}