import java.io.IOException;
import java.util.*;

 
public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int X = 0;
      int M = 0;
      while(true)
      {
        X = input.nextInt();
        M = input.nextInt();
        if ((X == 0) & (M == 0))
          break;
        System.out.println(X*M);
      }
  }
}