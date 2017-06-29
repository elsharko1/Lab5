import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int rollNum = 0;
        int sidesDice = 0;
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
        System.out.println("Welcome to Grand Circus Casino\n\n");
        System.out.println("How many sides are on the dice: ");
        sidesDice = scan.nextInt();

        rollNum = rollNum + 1;

            System.out.println("Roll " + rollNum );

        //I am now calling the method by its name(rollDice) to use in the Main method
        //(sidesDice ) is trhe parameters, which is what we want out of our other method
        //the method named rollDice
        //now my sout printed the parameter from running it through the other method
        System.out.println(rollDice(sidesDice) + "\n" + rollDice(sidesDice));

        // write your code here
            System.out.println("Continue? (y/n)");
            scan.nextLine();
            choice = scan.nextLine();

        }
        System.out.println("Goodbye");
    }
    // new method called rollDice
    // in parenthesis calling the specific integer we want
    public static int rollDice(int numSides) {

        //I'm going to use the Math random class
        //make a new integer
        int random = (int) (Math.random() * numSides +1);

        //need a return of the integer I named "random"
        return random;
    }




}
