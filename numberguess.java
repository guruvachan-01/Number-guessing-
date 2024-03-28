package System_tron;

import java.util.Random;
import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        Random r=new Random();
        int numbguess=r.nextInt(100);

        Scanner sc=new Scanner(System.in);
        int guess;

        System.out.println("Guess the number 1 to 100");
        guess=sc.nextInt();

        if (guess == numbguess){
            System.out.println("Congratulations, you guessed the number!");
        } else if (guess< numbguess) {
            System.out.println(" your guess is too low");

        } else {
            System.out.println("your guess is to high");

        }
    }
}