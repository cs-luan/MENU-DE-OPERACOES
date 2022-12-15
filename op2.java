import java.util.Scanner;

public class op2 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);

        int resultadoSomatorio = 1;
        StringBuilder somador = new StringBuilder();

        System.out.println("Insira um número para descobrir seu somatório:");
        int somatorioDoNumero = entrance.nextInt();

        while (somatorioDoNumero <= 0) {
            System.out.println("Insira um número maior que zero para realizar seu respectivo somatório:");
            somatorioDoNumero = entrance.nextInt();
        }

        for (int count = somatorioDoNumero; count > 1; count--) {
            resultadoSomatorio += count;
            somador.append(count).append(" + ");
        }

        if (somatorioDoNumero == 1){
            System.out.println("O somatório do número " + somatorioDoNumero + " = " + resultadoSomatorio);
        } else {
            System.out.println("O somatório do número " + somatorioDoNumero + " = " + somador + "1 = " + resultadoSomatorio);
        }
    }
}