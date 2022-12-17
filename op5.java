import java.util.Scanner;

public class op5 {
   public static void main(String[] args) {
      Scanner entrance = new Scanner(System.in);

      System.out.print("Digite o primeiro número: ");
      int a = entrance.nextInt();
      System.out.print("Digite o segundo número: ");
      int b = entrance.nextInt();

      int result = multiply(a, b);
      System.out.println("Resultado: " + result);

      entrance.close();
   }

   public static int multiply(int a, int b) {
      int result = 0;
      for (int count = 0; count < b; count++) {
         result += a;
      }
      return result;
   }
}
