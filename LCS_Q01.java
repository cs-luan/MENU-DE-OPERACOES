/* 1 – Fazer um programa em Java que mostre o menu abaixo e ao ser escolhida a opção o programa deve realizar as
operações necessárias sempre utilizando estruturas de repetição e não as funções pré-definidas do Java.
Devem ser feitas todas as validações dos números digitados para que as operações apenas aceitem números válidos para as opções do menu.
O menu deve aparecer sempre ao final de cada operação e o programa só deve ser finalizado quando o usuário escolher a opção “6 – Sair”. 
Aluno: Luan Correia Silva */ 

import java.util.Scanner; 

public class LCS_Q01 {

public static void main(String[] args) {

        Scanner menu = new Scanner (System.in);
        boolean i = true;
        do {
        System.out.print("\n##--MENU DE OPERAÇÕES--##\n\n");
        System.out.print("|------------------------------------------------|\n");
        System.out.print("| Opção 1 - Fatorial de um número                |\n");
        System.out.print("| Opção 2 - Somatório de um número               |\n");
        System.out.print("| Opção 3 - Potência de um número                |\n");
        System.out.print("| Opção 4 - Divisão de um número por outro       |\n");
        System.out.print("| Opção 5 - Multiplicação de um número por outro |\n");
        System.out.print("| Opção 6 - Sair                                 |\n");
        System.out.print("|------------------------------------------------|\n");
        System.out.print("Digite uma opção: ");

        int opcao = menu.nextInt();

        

        if (opcao == 1) {
            System.out.print("Opção FATORIAL DE UM NÚMERO selecionada! ");
            Scanner entrance = new Scanner(System.in);

            int resultadoFatorial = 1;
            StringBuilder multiplicador = new StringBuilder();

            System.out.println("\nInsira um número para descobrir seu respectivo Fatorial:");
            int fatorialDoNumero = entrance.nextInt();

            while (fatorialDoNumero < 0) {
            System.out.println("Não é possível calcular o fatorial de números negativos!");
            System.out.println("\nInsira um número maior ou igual a zero para descobrir seu respectivo Fatorial:");
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

        if (opcao == 2) {
            System.out.print("Opção SOMATÓRIO DE UM NÚMERO selecionada! ");
            Scanner entrance = new Scanner(System.in);

            int resultadoSomatorio = 1;
            StringBuilder somador = new StringBuilder();

            System.out.println("\nInsira um número para descobrir seu somatório:");
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
        
        if (opcao == 3) {
            System.out.print("Opção POTÊNCIA DE UM NÚMERO selecionada! "); 
            Scanner entrance = new Scanner(System.in);
            int result = 1, base, exp;

            System.out.print("\nInforme o valor da base: ");
            base = entrance.nextInt();
            if (base < 0 ) {
            System.out.println("O valor " + base + " é menor que zero, portanto não foi aceito, insira um valor maior ou igual a zero para efetuar a operação: ");
            base = entrance.nextInt();
            }
            System.out.print("\nInforme o valor do expoente: ");
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

        if (opcao == 4) {
            System.out.print("Opção DIVISÃO DE UM NÚMERO POR OUTRO selecionada! ");
            Scanner entrance = new Scanner(System.in);
            int numeroA, numeroB;
	
            System.out.println("\nInforme o primeiro número: ");
            numeroA = entrance.nextInt();
            System.out.println("Informe o segundo número: ");
            numeroB = entrance.nextInt();
        
            int restoDivisao = numeroA;
        
            while(restoDivisao - numeroB >= 0){
            System.out.println("["+restoDivisao+"]" + " - " + 
                    "[" + numeroB + "]" + " = " + (restoDivisao -=numeroB));
            }
            System.out.println("\nO quociente da divisão é igual a: " + numeroA / numeroB);
            System.out.println("O resto da divisão é: " + restoDivisao); 
        }

        if (opcao == 5) {
            
        }
        if (opcao == 6) {
            System.out.print("Até Logo!");
            i = false;
        }

        }while(i);   

        
        
    }
}