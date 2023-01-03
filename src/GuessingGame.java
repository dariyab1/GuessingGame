import java.util.Scanner;
public class GuessingGame {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("I'm thinking of a number from 1 to 100.");
        int num=(int)(Math.random()*100+1);
        int guess=0;
        while (guess!=num){
            System.out.print("What's your guess:");
            guess=input.nextInt();
            if(guess<num){
                System.out.println("Too low. Guess higher!");

            }
            else if(guess>num){
                System.out.println("Too high.  Guess lower!");

            }
            else if(guess==num){
                System.out.println("You got it! The number is "+num);
            }
        }

    }

}
