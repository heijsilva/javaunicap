import java.util.Scanner;

public class Exemplo2{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        double num3 = 3.15, num4;

        System.out.print("Digite seu numero");
        num2 = input.nextInt();

        System.out.print("Digite seu numero");
        num4 = input.nextDouble();

        System.out.println("Numero 1 = " + num1);
        System.out.println("Numero 2 = " + num2);
        System.out.println("Numero 3 = " + num3);
        System.out.println("Numero 4 = " + num3);
    }
}