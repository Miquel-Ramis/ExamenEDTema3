import java.util.Scanner;
/*
 *Programa suma, para calcular la suma de dos valores introducidos por teclado
 *@version v1.0
 *@author Miquel
 *@see Para más información ver <a href="Google.com">Google</a>
 */
public class FuncionSuma {
	/*
	 * Variable para guardar el primer sumando
	 */
	private static int primerSumando;
	/*
	 * Variable para guardar el segundo sumando
	 */	
	private static int segundoSumando; 
	/*
	 * Funcion principal del programa
	 * @param args - El parametro habitual de la función main
	 */	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	/*
	 * Función que realiza la suma de los dos operandos
	 * @param Sumando1 - Primer sumando de la operacion suma 
	 * @param Sumando2 - Segundo sumando de la operacion suma
	 */
	private static int suma (int sumando1, int sumando2) {
		return sumando1 + sumando2;
	}

}
