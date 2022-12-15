import java.util.Scanner;

public class op5 {
    public static void main(String[] args) {
        Scanner entrance = new Scanner(System.in);
        int numeroA = 1, numeroB;


        System.out.print("Informe o primeiro valor: " );
        numeroA = entrance.nextInt();
        System.out.print("Informe o segundo valor: ");
        numeroB = entrance.nextInt();

        while (numeroA <= (numeroA * numeroB)) {
            System.out.println("[" + numeroA + "]" + " + " + 
            "[" + numeroB + "]" + " = " + (numeroA += numeroB)); 
        }
        System.out.println("A operação " + numeroA + " x " + numeroB + " = " + numeroA);    
    }
}
