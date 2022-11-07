import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void anotherRange() {
        SQRService service = new SQRService();
        int expected = 20;
        int actual = service.calcSqrt(100, 888);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void narrowRange() {
        SQRService service = new SQRService();
        int expected = 6;
        int actual = service.calcSqrt(236, 453);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void wideRange() {
        SQRService service = new SQRService();
        int expected = 90;
        int actual = service.calcSqrt(1, 9801);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void negativeRange() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqrt(-1, -1000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void originalRange() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calcSqrt(200, 600);

        Assertions.assertEquals(expected, actual);
    }
}