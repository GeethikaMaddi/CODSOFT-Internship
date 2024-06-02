import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    private  int comp_input,score=0;
    private boolean correct_ans;

    //computer generates num b/w 1 to 100
    public  void  generateNum(){
        Random x=new Random();
        comp_input=x.nextInt(100)+1;
    }

    //  give feedback to the user
    public void check(int user_num) {
        correct_ans=false;
        if (user_num == comp_input) {
            System.out.println("You guessed the right number\n You got 1 point");
            score++;
            correct_ans=true;
        }
        else if (user_num > comp_input)
            System.out.println("Your guessed  number is too high");
        else
            System.out.println("Your guessed  number is too low");
    }

    public void game() {
        //limiting the number of attempts to 5
        int no_of_attempts = 5,user_input;
        Scanner sc = new Scanner(System.in);
        int num_of_rounds=3;
        //loop for number of rounds
        for(int j=1;j<=num_of_rounds;j++){
            generateNum();
            System.out.println("You are in Round "+j);
            System.out.println("Please enter a number between 1 and 100:");

            //loop for no. of attempts in each round
            for (int i = 1; i <= no_of_attempts; i++) {
              System.out.printf("This is your  Attempt %d\n", i);

              //to check the input is b/w 1 to 100
               while (true) {
                 user_input = sc.nextInt();
                  if (user_input >= 1 && user_input <= 100) {
                     break;
                  }
                  else {
                     System.out.println("Selected number out of range. Please enter a number between 1 and 100:");
                  }
               }

               check(user_input);

               if (correct_ans)
                  break;
            }
          System.out.println("Your Score is: "+ score);
    }
        System.out.println("All 3 rounds are over\n your total score is "+ score);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Guessing Game\n the game has 3 rounds,\n each round has 5 attempts");
        Guess_Number obj=new Guess_Number();
        obj.game();
    }
}
