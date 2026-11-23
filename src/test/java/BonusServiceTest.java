import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredUnderLimit() {
        BonusService service = new BonusService();

        //подготавливаем данные
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод
        long actual = service.calculate(amount, registered);

        //сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calculateForUnregisteredUnderLimit() {
        BonusService service = new BonusService();

        long amount = 5000;
        boolean registered = false;
        long expected = 50;

        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

}
