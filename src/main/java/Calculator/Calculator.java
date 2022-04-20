//Indicating the compiler that the "Calculator" class is contained in
// the package/folder named "Calculator".
package Calculator;

//Importing necessary packages provides information through logger messages.
//These are logger frameworks (APIs) allows to obtain loggers.
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Importing Scanner class from java API which does the job of taking the
//input from the user.
import java.util.Scanner;

//Imported java.lang.System.exit method so that the user will be given
//an option to exit the application.
import static java.lang.System.exit;

//Following is the class "Calculator" containing methods for evaluate
//squareRoot, factorial, Natural logarithm, power operations.
public class Calculator {

    //Creating logger to get the data.
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator(){

    }

    //squareRoot method to compute the Square Root of any given positive number.
    public double squareRoot(double input){
        //Calling info method from logger class, which log the message "squareRoot"
        //allowing us to store the data of when we ran this operation.
        logger.info("squareRoot");
        return Math.sqrt(input);
    }

    //factorial method to compute the factorial of any given positive number.
    public double factorial(double input){
        if(input < 0){
            //Calling info method from logger class, which log the message "factorial"
            //allowing us to store the data of when we ran this operation.
            logger.info("factorial");
            return Double.NaN;
        }
        else{
            //ground variable is 1! initially and we iterate through loop to obtain the
            //factorial of required positive number.
            double ground = 1;
            for(int i = 1; i <= input; i++){
                ground *= i;
            }
            logger.info("factorial");
            //Calling info method from logger class, which log the message "factorial"
            //allowing us to store the data of when we ran this operation.
            return ground;
        }
    }

    //logarithm method to compute the Natural logarithm of any given positive number.
    public double logarithm(double input){
        //Calling info method from logger class, which log the message "logarithm"
        //allowing us to store the data of when we ran this operation.
        logger.info("logarithm");
        return Math.log(input);
    }

    //power method to compute the power of any given positive number.
    //Here input1 indicates the base and input2 indicates exponent of
    //the operation we want to evaluate.
    public double power(double input1, double input2){
        //Calling info method from logger class, which log the message "power"
        //allowing us to store the data of when we ran this operation.
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
                case 1: //Square Root Operation
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Square Root Result is " + cal.squareRoot(input1));
                    break;

                case 2: //Factorial Operation
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    double result = cal.factorial(input1);
                    System.out.println("Factorial Result is " + result);
                    break;
                case 3: //Natural logarithm Operation
                    System.out.print("Enter the Input value: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Natural Logarithm Result is " + cal.logarithm(input1));
                    break;
                case 4: //Power Operation
                    System.out.println("Enter the Input value for base: ");
                    input1 = scanner.nextDouble();
                    System.out.println("Enter the Input value for exponent: ");
                    input2 = scanner.nextDouble();
                    System.out.println("Power Operation Result is " + cal.power(input1,input2));
                    break;

                case 5: //Exiting Option for the user.
                    System.out.println("Exiting...Bye!");
                    exit(0);
                default:    //Only inputs from 1 to 5 are allowed.
                    System.out.println("Invalid Input! Please choose among the given options 1 to 5.");

            }
            System.out.println("\n");
        }

    }
}