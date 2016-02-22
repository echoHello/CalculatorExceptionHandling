/**
 * Created by Taylor on 2/21/16.
 */
public class App {
    public static void main(String[] args) throws DivideByZeroException {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 1));
        System.out.println(calculator.add(3,4));
        System.out.println(calculator.substract(10,5));
        System.out.println(calculator.substract(4,3));
        System.out.println(calculator.multiply(2,2));
        System.out.println(calculator.multiply(3,4));
        try {
            System.out.println(calculator.divide(10,2));
        } catch (DivideByZeroException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(calculator.divide(0,3));
        } catch (DivideByZeroException d) {
            System.out.println(d);
        }
    }
}

/*  PART 2 BEFORE MODIFICATION
        try {
        calculator.divide(0,4);
        } catch (IllegalArgumentException e) {
            System.out.println("You cannot divide by 0");
        }
 */