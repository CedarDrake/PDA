import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    Scanner scanner = new Scanner(System.in);
    int age = 0;
    int LOWER_BOUND = 0;
    float ageLow = (age / 2) + 7;
    ageLow = Math.ceil(ageLow);
    float ageHigh = (age - 7) * 2;
    ageHigh = Math.floor(ageHigh);
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (true) {
            System.out.println("How old are you?");
            try {
                age = scanner.nextInt();
                System.out.println(age);
                if (age < LOWER_BOUND) {
                    System.out.println(age + " is too young!");
                } else  {
                    System.out.println("You're age range is " + ageLow + " " + ageHigh);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

