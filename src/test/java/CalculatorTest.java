import Calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double delta = 1e-15;
    Calculator c = new Calculator();

    @Test
    public void squareRootPositive() {
        assertEquals("Testing True : squareRoot of a positive number", 10.0, c.squareRoot(100.0), delta);
        assertEquals("Testing True : squareRoot of a negative number", Double.NaN, c.squareRoot(-100.0), delta);
        assertEquals("Testing True : squareRoot of 0", 0.0, c.squareRoot(0.0), delta);
    }

    @Test
    public void squareRootNegative() {
        assertNotEquals("Testing False : squareRoot of a positive number", Double.NaN, c.squareRoot(64.0), delta);
        assertNotEquals("Testing False : squareRoot of a negative number", 6.0, c.squareRoot(-36.0), delta);
        assertNotEquals("Testing False : squareRoot of zero", Double.NaN, c.squareRoot(0.0), delta);
    }

    @Test
    public void factorialPositive() {
        assertEquals("Testing True : factorial of a positive number", 120.0, c.factorial(5.0), delta);
        assertEquals("Testing True : factorial of a negative number", Double.NaN, c.factorial(-25.0), delta);
        assertEquals("Testing True : factorial of zero", 1.0, c.factorial(0.0), delta);
    }

    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False : factorial of a negative number", 6.0, c.factorial(-24.0), delta);
        assertNotEquals("Testing False : factorial of a positive number", Double.NaN, c.factorial(36.0), delta);
    }

    @Test
    public void logarithmPositive() {
        assertEquals("Testing True : logarithm of a positive number", 2.302585092994046, c.logarithm(10.0), delta);
        assertEquals("Testing True : logarithm of a negative number", Double.NaN, c.logarithm(-25.0), delta);
    }

    @Test
    public void logarithmNegative() {
        assertNotEquals("Testing False : logarithm of a negative number", 6.0, c.logarithm(-24.0), delta);
        assertNotEquals("Testing False : logarithm of a positive number", Double.NaN, c.logarithm(36.0), delta);
    }

    @Test
    public void powerPositive() {
        assertEquals("Testing True : PowerFunction for a positive power", 8.0, c.power(2.0, 3.0), delta);
        assertEquals("Testing True : PowerFunction for a negative power", 0.125, c.power(2.0, -3.0), delta);
        assertEquals("Testing True : PowerFunction for 0^0", 1, c.power(0.0, 0.0), delta);
    }

    @Test
    public void powerNegative() {
        assertNotEquals("Testing False : PowerFunction for zero to the power zero", 8.0, c.power(0.0, 0.0), delta);
        assertNotEquals("Testing False : PowerFunction for negative power", 6.0, c.power(2.0, -3.0), delta);
    }

}