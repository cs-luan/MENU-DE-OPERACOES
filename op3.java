import java.util.Scanner;

public class op3 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int result = 1, base, exp;

        System.out.print("Informe o valor da base: ");
        base = entrance.nextInt();
        if (base < 0 ) {
            System.out.println("O valor " + base + " é menor que zero, portanto não foi aceito, insira um valor maior ou igual a zero para efetuar a operação: ");
            base = entrance.nextInt();
        }
        System.out.print("Informe o valor do expoente: ");
        exp = entrance.nextInt();
        if (exp < 0 ) {
            System.out.println("O valor " + exp + " é menor que zero, portanto não foi aceito, insira um valor maior ou igual a zero para efetuar a operação: ");
            exp = entrance.nextInt();
        }    
        for (int count = 0; count < exp; count++) {
            result = result * base;
        }
        System.out.println(base + "^" + exp + " = " + result);

    }
}
