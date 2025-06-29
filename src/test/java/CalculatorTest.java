import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 2;
        int b = 3;
        assertEquals(5, a + b);
    }
}
