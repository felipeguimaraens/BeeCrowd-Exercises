import java.io.IOException;
import java.util.*;

 
public class Main {
  static int a = 0;
  
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int count = input.nextInt();
      
      for(int i=0;i<count;i++){
        //System.out.println("iteraction");
        int n = input.nextInt();
        String result = String.format("%d",Fib(n));
        System.out.println("fib(" + n + ") = " + a + " calls = "  + result);
        a = 0;
      }
      
  }

 public static int Fib(int n){
   if(n <= 1)
    return n;
   a = a + 2;
   return Fib(n-1) + Fib(n-2);
   }
}