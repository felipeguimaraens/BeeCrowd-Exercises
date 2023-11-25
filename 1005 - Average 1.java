import java.io.IOException;
import java.util.*;

 
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float n1 = input.nextFloat();
      float n2 = input.nextFloat();
      String result = String.format("%.5f",WeightedAverage(n1,n2));
      System.out.println("MEDIA = " + result);
  }
  
    public static double WeightedAverage(float n1, float n2){
      //weighted average
      return ((n1*3.5) + (n2*7.5))/11;
    }
}