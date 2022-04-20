package Calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import static java.lang.System.exit;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){

    }

    public double squareRoot(double input){
        logger.info("squareRoot");
        return Math.sqrt(input);
    }
    public double factorial(double input){
        if(input < 0){
            logger.info("factorial");
            return Double.NaN;
        }
        else{
            double ground = 1;
            for(int i = 1; i <= input; i++){
                ground *= i;
            }
            logger.info("factorial");
            return ground;
        }
    }

    public double logarithm(double input){
        logger.info("logarithm");
        return Math.log(input);
    }

    public double power(double input1, double input2){
        logger.info("power");
        return Math.pow(input1, input2);
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int pick;
        double input1, input2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Welcome to Scientific Calculator.");
        while(true){
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Please enter your choice from the above operations available: ");
            pick = scanner.nextInt();
            switch (pick){
                case 1:
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Square Root Result is " + cal.squareRoot(input1));
                    break;

                case 2:
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    double result = cal.factorial(input1);
                    System.out.println("Factorial Result is " + result);
                    break;
                case 3:
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Natural Logarithm Result is " + cal.logarithm(input1));
                    break;
                case 4:
                    System.out.println("Enter the Input value for base: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Enter the Input value for exponent: ");
                    input2 = scanner.nextDouble();
                    System.out.println("Power Operation Result is " + cal.power(input1,input2));
                    break;

                case 5:
                    System.out.println("exiting...");
                    exit(0);
                default:
                    System.out.println("Invalid Input! Please choose among the given options 1 to 5.");

            }
            System.out.println("\n");
        }

    }
}