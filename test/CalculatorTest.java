import com.baharmand.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void two_plus_two_plus_two_is_six() {
        float result = Calculator.add(2, 2, 2);
        assertEquals(6, result);
    }

    @Test
    void testPerformSubtraction() {
        float result = Calculator.subtract(100.0f, 50.0f, 25.0f);
        assertEquals(25.0f, result, 0.01f);
    }

    @Test
    public void testPerformMultiplication() {
        float result = Calculator.multiply(5.0f, 10.0f);
        assertEquals(50.0f, result, 0.01f);
    }

    @Test
    public void testPerformDivision() {
        float result = Calculator.divide(100.0f, 0.0f);
        assertEquals(Float.MIN_VALUE, result, 0.01f);
    }
    }

