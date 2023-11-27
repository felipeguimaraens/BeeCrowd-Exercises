import java.io.IOException;
import java.util.*;

 
public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int tea = input.nextInt();
      int rightAnswers = 0;
      ArrayList<Integer> participants = new ArrayList<Integer>();
      
      for(int i=0;i<5;i++){
        //System.out.println("iteraction");
        int answer = input.nextInt();
        participants.add(answer);
      }
      for(int i = 0; i < participants.size(); i++){
        if(participants.get(i) == tea)
          rightAnswers++;
      }
      System.out.println(rightAnswers);
  }
}