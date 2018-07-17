import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args){

/*I'm thinking of a number. Guess it. If you've ever played that game or some version of it you're ready for the next assignment.
The computer will "pick" a number. Actually, you'll program one in the code. You can use a random number if you're ambitious.
Create a number-guessing game using a while-loop. The loop will allow users to guess until they get the number right.
Your program will keep looping as long as the guess is different from the secret number.

The output should look like this: (Secret number = 6) */


        Scanner keyboard = new Scanner(System.in);

        int magicNumber, guess = 0;

        magicNumber = 6;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        System.out.println("Your guess: ");
        guess = keyboard.nextInt();

        while (guess != magicNumber) {
            System.out.println("Incorrect! Guess again!");
            System.out.println("Your guess: ");
            guess = keyboard.nextInt();
        }

        System.out.println("That's right! You're a good guesser.");
        keyboard.close();










    }

}
