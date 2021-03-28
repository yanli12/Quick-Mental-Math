import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class Main {  
  public static void main(String[] args) { 
    boolean playAgain = true;

    while(playAgain){
      System.out.println("How many problems do you want to try?");
      Scanner in = new Scanner(System.in);
      int numProb = in.nextInt();
      long start = System.currentTimeMillis();
    
      int score = 0;
      int input = 0;
      for(int i = 0; i < numProb; i++){
        Equation problem = new Equation();
        System.out.println(problem.toString());
        input = in.nextInt();
        
        if(input == problem.getAnswer()){
          score++;
        }
      }
      double timeElasped = 0.001*(System.currentTimeMillis() - start);

      System.out.println("Score: " + score + "/" + numProb);
      System.out.println("Time Taken: " + timeElasped + " seconds");
      System.out.println("\nDo you want to start a new round? (y/n)");

      char again = in.next().charAt(0);
      if(again == 'n')
        playAgain = false;

    }
    System.out.println("The End!");
  }  
} 
