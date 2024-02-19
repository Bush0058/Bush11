import java.util.Scanner;

public class GuessNumber {
public static void main(String[] args) {
     Scanner input =new Scanner(System.in);

    int guess = -1;
int answer =7;
    do {
        System.out.println( "Enter a number between 1 to 10");
        guess =input.nextInt();

            if (guess > answer)

                System.out.println("your guess is too high");


         if (guess < answer)
            System.out.println("your guess is too low" );{
            
         }
        } while(guess!= answer); System.out.println();
    System.out.println("Dit svar er rigtigt !!!:)");

    }
 }
