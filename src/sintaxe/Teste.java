package sintaxe;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();
        System.out.println("Digite seu salário:");
        double salario = entrada.nextDouble();
        
         System.out.println("Nome: "+nome);
         System.out.println("Idade: "+idade);
         System.out.println("Salário: "+salario);
         
         System.out.println("Nome: "+nome+" Idade: "+idade);
    
    
    }
    
}
