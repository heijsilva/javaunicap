import java.util.Scanner;  

public class For {  
  public static Scanner input = new Scanner(System.in);  

  public static void main(String[] args) {  
    int num1, num2, qtdInterv;  

    System.out.print("Digite um número inteiro: ");  
    num1 = input.nextInt();  

    do {  
      System.out.print("Digite um número inteiro maior que " + num1 + ": ");  
      num2 = input.nextInt();  
    } while (num2 <= num1);  

    qtdInterv = num2 - num1 + 1;  
    System.out.println(  
      "Existem " + qtdInterv + " números no intervalo de " +  
      num1 + " a " + num2  
    );  
    System.out.print("E esses números são: {");  

    // Loop para imprimir os números no formato
    for (int i = num1; i <= num2; ++i) {  
      System.out.print(i);  
      if (i < num2) {  
        System.out.print(", "); // Adiciona vírgula se não for o último número.
      }  
    }  
    System.out.println("}");  
  }  
}