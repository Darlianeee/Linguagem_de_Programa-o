//Componentes: Darliane, Jose, Kalondra, Lais, Levi, Raquelly//

package Darliane;
import java.util.Scanner;
public class Atividade04 {
		public static void main(String[] args) {
	        Scanner tecladoScanner = new Scanner(System.in);
	        
	        int num = 1;
	        int numMaior = Integer.MIN_VALUE;
	        int numMenor = Integer.MAX_VALUE;
	        int contador = 1;
	        
	        System.out.println("*** Fase da digitação \n");
	        
	       
	        while(num != 0) {
	        	 System.out.print(" Digite o " + contador + "º número: ");
	             num = tecladoScanner.nextInt();
	             contador = contador + 1;
	             
	             if (num != 0) {
	                 if (num > numMaior) {
	                     numMaior = num;
	                 }
	                 if (num < numMenor) {
	                     numMenor = num;
	                 }
	             }
	             
	        }
	        System.out.println("\n*** Resultado do programa \n");
	        System.out.println("    O menor número digitado é " + numMenor + " e o maior número digitado é " + numMaior);
		}
	
}
