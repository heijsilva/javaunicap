import java.util.Scanner;  

public class Exemplo4 {  
    public static Scanner input = new Scanner(System.in);  

    public static void main(String[] args) {  
        int num1, num2;  

        // Exemplo de uso: lendo dois números inteiros  
        System.out.print("Digite o primeiro número: ");  
        num1 = input.nextInt();  
        System.out.print("Digite o segundo número: ");  
        num2 = input.nextInt();  

        // Exibindo a soma dos números  
        int soma = num1 + num2;  
        System.out.println("A soma dos números é: " + soma);  

        // Fechando o scanner  
        input.close();  
    }  
}