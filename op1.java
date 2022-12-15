import java.util.Scanner;

public class op1 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        int resultadoFatorial = 1;
        StringBuilder multiplicador = new StringBuilder();

        System.out.println("Insira um número para descobrir seu respectivo Fatorial:");
        int fatorialDoNumero = entrance.nextInt();

        while (fatorialDoNumero < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos!");
            System.out.println("Insira um número maior ou igual a zero para descobrir seu respectivo Fatorial:");
            fatorialDoNumero = entrance.nextInt();
        }

        for (int count = fatorialDoNumero; count > 1; count--) {
            resultadoFatorial *= count;
            multiplicador.append(count).append(" x ");
        }

        if (fatorialDoNumero == 0) {
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else if (fatorialDoNumero == 1){
            System.out.println(fatorialDoNumero + "! = " + resultadoFatorial);
        } else {
            System.out.println(fatorialDoNumero + "! = " + multiplicador + "1 = " + resultadoFatorial);
        }
    }
}