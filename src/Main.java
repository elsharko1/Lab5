import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int sidesDice = 0;

        System.out.println("Welcome to Grand Circus Casino\n\n");
        System.out.println("How many sides are on the dice: ");
        sidesDice = scan.nextInt();

        //I am now calling the method by its name(rollDice) to use in the Main method
        //(sidesDice ) is trhe parameters, which is what we want out of our other method
        //the method named rollDice
        //now my sout printed the parameter from running it through the other method
        System.out.println(rollDice(sidesDice) + "\n" + rollDice(sidesDice));

        // write your code here
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
