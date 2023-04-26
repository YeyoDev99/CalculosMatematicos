/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * PROGRAMA: GENERADOR DE SUCESIÓN DE FIBONACCI
 * FECHA: 25 DE MARZO DE 2023
 */

package actividad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class actividad2 {
	public static void main(String[] args) throws IOException {
		// declaro el BufferedReader:
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"\n\tBienvenido al generador de la sucesión de fibonacci de un número por metodo iterativo y recursivo:");
		// creo un ciclo para definir el programa:
		while (true) {
			System.out.println("\n\tdigite una opcion para generar la sucesión: ");
			System.out.println("\n\t1-método interativo: ");
			System.out.println("\t2-método recursivo: ");

			System.out.print("\n\tdigite cualquier otra tecla para salir: ");
			String eleccionMenu = in.readLine();
			if (eleccionMenu.equals("1")) {
				while (true) {
					System.out.print("\n\tdigite el número de elementos de la sucesión: ");
					int numero = Integer.parseInt(in.readLine());
					while (numero <= 0) {
						System.out.print("\n\tdigite un número valido(mayor que 0): ");
						numero = Integer.parseInt(in.readLine());
					}
					// se crea el objeto a partir de la clase "GeneradorFibonacci"
					GeneradorFibonacci generador = new GeneradorFibonacci(numero);
					// y finalmente utilizo getters para dar la sucesión:
					System.out.println("\n\tlos primeros " + generador.getNumero()
							+ " números de la sucesión de fibonacci por el metodo iterativo son:");
					System.out.print("\n\t");
					for (int i = 0; i < numero; i++) {
						generador.setNumero(i);
						System.out.print(generador.fibonacciIterativo() + " ");
					}

					System.out.print(
							"\n\n\tpor favor digite la letra \"y\" si desea seguir con este metodo, si desea volver al menu digite cualquier otra tecla: ");
					String eleccionError = in.readLine().toLowerCase();
					if (!eleccionError.equals("y")) {
						System.out.print(
								"\n\t----------------------------------------------------------------------------------------------------------- ");
						break;

					}
				}
			} else if (eleccionMenu.equals("2")) {
				while (true) {
					System.out.print("\n\tdigite el número de elementos de la sucesión: ");
					int numero = Integer.parseInt(in.readLine());
					while (numero < 0) {
						System.out.print("\n\tdigite un número valido(mayor que 0): ");
						numero = Integer.parseInt(in.readLine());
					}
					// se crea el objeto a partir de la clase "GeneradorFactorial"
					GeneradorFibonacci generador = new GeneradorFibonacci(numero);
					System.out.print("\n\tlos primeros " + generador.getNumero()
							+ " números de la sucesión de fibonacci por el metodo recursivo son:");

					System.out.print("\n\t");
					for (int i = 0; i < numero; i++) {
						generador.setNumero(i);
						System.out.print(generador.fibonacciRecursivo(generador.getNumero()) + " ");
					}
					// se le pregunta al usuario si desea seguir con el programa:
					System.out.print(
							"\n\n\tpor favor digite la letra \"y\" si desea seguir con este método, si desea volver al menu digite cualquier otra tecla: ");
					String eleccionError = in.readLine().toLowerCase();
					if (!eleccionError.equals("y")) {
						System.out.print(
								"\n\t----------------------------------------------------------------------------------------------------------- ");
						break;

					}
				}
			} else {
				System.out.print(
						"\n\t----------------------------------------------------------------------------------------------------------- ");
				System.out.println("\n\tgracias por utilizar nuestro programa.");
				break;
			}
			System.out.print(
					"\n\t----------------------------------------------------------------------------------------------------------- ");

		}

	}

}