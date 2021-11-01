import java.util.Scanner;
import java.util.Random;

public class project1 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static int totalGames=0, totalGuess=0, best=0;
    public static void main(String[] args) {
        String chose ="";
        do {
            totalGames++;
            play();
            System.out.print("Do you want to play again? ");
            chose=sc.next();
            System.out.println();
        } while (chose.equalsIgnoreCase("yes") || chose.equalsIgnoreCase("y"));
        show();
    }


    public static void play() {
        int numTrue = rd.nextInt(101);
        int num = -1, count = 0;
        System.out.println("I'm thinking of a number between 0 and 100...");
        do {
            count++;
            System.out.print("Your guess? ");
            num = sc.nextInt();
            if (num > numTrue) {
                System.out.println("It's lower.");
            } else if (num < numTrue) {
                System.out.println("It's highter.");
            } else {
                break;
            }

        } while (true);
        System.out.println("You got it right in " + count + " guesses!");
        totalGuess=totalGuess+count;
        if(totalGames==1){
            best=count;
        }
        if(count<best){
            best=count;
        }
    }

    public static void show() {
        double average=(double) totalGuess/totalGames;
        System.out.println("Overall results:");
        System.out.println("Total games   = "+totalGames);
        System.out.println("Total guesses = "+totalGuess);
        System.out.println("Guesses/game  = "+average);
        System.out.println("Best game     = "+best);
    }
}
   

   

   

   

      

   

   

   

    

   

   

   

   

   

   

   
   

   

 

   

   

   

   

   
