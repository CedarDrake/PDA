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
    int LOWER_BOUND = 14;
    int realagelow = 0;
    int realagehigh = 0;
    boolean shouldContinue = true;
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }
    public void minage() {
        double agelow = age;
        realagelow = (int)Math.ceil(agelow/2) + 7;
    }
    public void maxage() {
        double agehigh = age;
        realagehigh = (int)Math.floor(agehigh-7) * 2;
    }
    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (shouldContinue) {
            System.out.println("How old are you? Enter 0 to end program.");
            try {
                age = scanner.nextInt();
                if (age == 0) {
                    System.out.println("Program eneded :(");
                    shouldContinue = false;
                }
                System.out.println(age);
                if (age < LOWER_BOUND && age != 0) {
                    System.out.println(age + " is too young!");
                } else if (age != 0) {
                    minage();
                    maxage();
                    System.out.println("You're age range is " + realagelow + " " + realagehigh);
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

