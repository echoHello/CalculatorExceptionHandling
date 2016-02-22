import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Taylor on 2/21/16.
 */
public class CalculatorSpec {

    Calculator calculator;
    int firstInt;
    int secondInt;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        firstInt = 2;
        secondInt = 3;
        int actual = calculator.add(firstInt,secondInt);
        int expected = 5;
        assertEquals("The sum was not correct",expected,actual);
    }

    @Test
    public void subtractTest() {
        firstInt = 8;
        secondInt = 5;
        int actual = calculator.substract(firstInt,secondInt);
        int expected = 3;
        assertEquals("The difference was not correct",expected,actual);
    }

    @Test
    public void multiplyTest() {
        firstInt = 3;
        secondInt = 3;
        int actual = calculator.multiply(firstInt,secondInt);
        int expected = 9;
        assertEquals("The product was not correct",expected,actual);

    }
    @Test
    public void divideTest() throws DivideByZeroException{
        int actual = 0;
        firstInt = 0;
        secondInt = 2;
        try {
            actual = calculator.divide(firstInt, secondInt);
        } catch (DivideByZeroException e) {
            System.out.println(e);
        }
        int expected = 0;
        assertEquals("The quotient was not correct",expected,actual);
    }

}
