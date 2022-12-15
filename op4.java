import java.util.Scanner;

public class op4 {
    public static void main(String[] args) {
        int numeroA, numeroB;
		
        Scanner entrance = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        numeroA = entrance.nextInt();
        if (numeroA <= 0) {
            System.out.print("Valor inválido para essa operação, insira outro valor que seja maior que 0: ");
            numeroA = entrance.nextInt();
        }
        System.out.println("Informe o segundo número: ");
        numeroB = entrance.nextInt();
        if (numeroB <= 0) {
            System.out.print("Valor inválido para essa operação, insira outro valor que seja maior que 0: "); 
            numeroB = entrance.nextInt();
        }
        
        int restoDivisao = numeroA;
        
        while(restoDivisao - numeroB >= 0){
            System.out.println("["+restoDivisao+"]" + " - " + 
                    "[" + numeroB + "]" + " = " + (restoDivisao -=numeroB));
        }
        System.out.println("\nO quociente da divisão é igual a: " + numeroA / numeroB);
        System.out.println("O resto da divisão é: " + restoDivisao); 
    }
}
