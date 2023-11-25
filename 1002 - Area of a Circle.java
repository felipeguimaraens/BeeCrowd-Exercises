import java.io.IOException;
import java.util.*;

 
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double R = input.nextDouble();
      String result = String.format("%.4f",CircleArea(R));
      System.out.println("A=" + result);
  }
  
    public static double CircleArea(double R){
      return 3.14159 * R * R;
    }
}