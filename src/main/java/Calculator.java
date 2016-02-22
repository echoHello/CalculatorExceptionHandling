/**
 * Created by Taylor on 2/21/16.
 */
public class Calculator {

    public static int add(int firstInt, int secondInt) {
        int sum = firstInt + secondInt;
        return sum;
    }

    public static int substract(int firstInt, int secondInt) {
        int difference = firstInt - secondInt;
        return difference;
    }

    public static int multiply(int firstInt, int secondInt) {
        int product = firstInt * secondInt;
        return product;
    }

    public static int divide(int firstInt, int secondInt) throws DivideByZeroException {
        if (firstInt == 0) {
            throw new DivideByZeroException("You absolutely cannot divide by 0");
        }
        int quotient = firstInt/secondInt;
        return quotient;
    }
}

/*  PART 2 BEFORE MODIFICATION
    public static int divide(int firstInt, int secondInt) throws IllegalArgumentException {
        if (firstInt == 0) {
            throw new IllegalArgumentException();
        }
        int quotient = firstInt/secondInt;
        return quotient;
    }
 */
