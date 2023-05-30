import java.util.Scanner;

public class CalculaFatorial {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Digite um número inteir para calcular o fatorial: ");
      int numero = input.nextInt();

      int fatorial = 1;

      for (int i = 1; i <= numero; i++) {
         fatorial *= i;
      }

      System.out.println("O fatoril  " + numero + " é " + fatorial);
   }
}