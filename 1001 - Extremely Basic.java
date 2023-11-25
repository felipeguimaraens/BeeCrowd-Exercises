import java.io.IOException;
import java.util.*;
 
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int A = input.nextInt();
      int B = input.nextInt();
      int result = sum(A,B);
      System.out.println("X = "+ result);
  }
  
    public static int sum(int A, int B){
      return A + B;
    }
}