import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduzca un valor entero: ");

		int a = scanner.nextInt();

		if(a > 10) {
			System.out.print("El entero introducido es estricamente  mayor que 10.");
	
		} else {
			System.out.print("El entero introducido no cumple la restriccion");
		
		}

		if(a <= 10) {

			System.out.print("El entero introducido es menor o igual a 10");
		
		} else {
		
			System.out.print("El entero introducido no cumple la restriccion");
		
		}
	}
}
