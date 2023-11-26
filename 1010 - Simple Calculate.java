import java.io.IOException;
import java.util.*;

 
public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int code = input.nextInt();
      int units = input.nextInt();
      float value = input.nextFloat();
      
      int code2 = input.nextInt();
      int units2 = input.nextInt();
      float value2 = input.nextFloat();
      
      String result = String.format("%.2f",Total(units, value, units2, value2));
      System.out.println("VALOR A PAGAR: R$ " + result);
  }

 public static float Total(int units, float value, int units2, float value2){
      return (units * value) + (units2 * value2);
    }
  
}
/*  public class Product {
    int code;
    int units;
    float value;
    
    public Product(code, value){
      code = code;
      value = value;
    }
    
    public static float Total(int units){
      return units * value;
    }
  }*/
  
  