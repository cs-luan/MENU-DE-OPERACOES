import java.util.Scanner;

public class op4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dividendo, divisor;
    int quociente = 0;

    System.out.print("Insira o valor do dividendo: ");
    dividendo = sc.nextInt();
    System.out.print("Insira o valor do divisor: ");
    divisor = sc.nextInt();

    while (dividendo >= divisor) {
      dividendo -= divisor;
      quociente++;
    }

    System.out.println("O quociente da divisão é: " + quociente);
    System.out.println("O resto da divisão é: " + dividendo);
  }
}
