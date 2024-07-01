package practise;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int computer=generate();
        int count=4;
        int flag=0;
        while(count>0) {
            System.out.println("Enter any guess number");
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if (guess==computer){
                System.out.println("You guessed Correct number!!!");
                flag=1;
                break;
            }
            else{
                if(guess>computer){
                    System.out.println("Actual number is smaller than "+guess);
                }
                else{
                    System.out.println("Actual number is larger than "+guess);
                }
                count--;
                System.out.println("You still have "+count+" turns left");
            }
        }
        if(flag==1){
            System.out.println("You Won");

        }
        else{ System.out.println("You Lost");
            System.out.println("Actual number is "+computer);}
    }
    private static int generate() {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
//        System.out.println("Actual number "+number);
        return number;
    }

}
