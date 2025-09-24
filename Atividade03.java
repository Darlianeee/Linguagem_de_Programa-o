//Componentes: Darliane, Jose, Kalondra, Lais, Levi, Raquelly//

package Darliane;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
      Scanner tecladoScanner = new Scanner(System.in); 
      int num = 1;
      int par = 0;
      int impar = 0;
      int contador = 1;
      
      System.out.println("*** Digite números até ser encontrado um zero");
      
      while (num != 0) {
        System.out.print("\n  Escreva o " + contador + "° número: ");
        num = tecladoScanner.nextInt();
        contador = contador + 1;
      
        if (num == 0) {
          System.out.println("\n    -> FIM DA LEITURA");
        }
        else if (num % 2 == 0) {
          System.out.println("\n    -> Esse número é par");
            par= par + 1;
        }
        else {
          System.out.println("\n    -> Esse número é ímpar");
          impar = impar + 1;
        }
      }
      
      System.out.println("\n*** Resultado do programa");
      System.out.println("\n  Foram digitados " + par + " número (s) pares e " + impar + " número (s) ímpares");
      tecladoScanner.close();
        
    }
}