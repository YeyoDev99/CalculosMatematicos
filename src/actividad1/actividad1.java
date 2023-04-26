/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * PROGRAMA: GENERADOR DE FACTORIALES
 * FECHA: 25 DE MARZO DE 2023
 */

package actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class actividad1 {
	public static void main(String[] args) throws IOException {
		// declaro el BufferedReader:
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\tBienvenido al calculador de factorial de un número por metodo iterativo y recursivo:");
		// creo un ciclo para definir el programa:
		while (true) {
			System.out.println("\n\tdigite una opcion para generar el factorial: ");
			System.out.println("\n\t1-método interativo: ");
			System.out.println("\t2-método recursivo: ");

			System.out.print("\n\tdigite cualquier otra tecla para salir: ");
			String eleccionMenu = in.readLine();
			if (eleccionMenu.equals("1")) {
				while (true) {
					System.out.print("\n\tdigite un número para calcular su factorial por el método iterativo: ");
					int numero = Integer.parseInt(in.readLine());
					while (numero < 0) {
						System.out.print("\n\tdigite un número valido(mayor o igual que 0): ");
						numero = Integer.parseInt(in.readLine());
					}
					// se crea el objeto a partir de la clase "GeneradorFactorial"
					GeneradorFactorial generador = new GeneradorFactorial(numero);
					long factorial = generador.factorialIterativo();
					// y finalmente utilizo getters para dar el factorial:
					System.out.println("\n\t--el factorial del número " + generador.getNumero() + " es " + factorial
							+ " por método iterativo ");
					// se le pregunta al usuario si desea seguir con el programa:
					System.out.print(
							"\n\tpor favor digite la letra \"y\" si desea seguir con este método, si desea volver al menú digite cualquier otra tecla: ");
					String eleccionError = in.readLine().toLowerCase();
					if (!eleccionError.equals("y")) {
						System.out.print(
								"\n\t----------------------------------------------------------------------------------------------------------- ");
						break;

					}
				}
			} else if (eleccionMenu.equals("2")) {
				while (true) {
					System.out.print("\n\tdigite un número para calcular su factorial por el método recursivo: ");
					int numero = Integer.parseInt(in.readLine());
					while (numero < 0) {
						System.out.print("\n\tdigite un número valido(mayor o igual que 0): ");
						numero = Integer.parseInt(in.readLine());
					}
					// se crea el objeto a partir de la clase "GeneradorFactorial"
					GeneradorFactorial generador = new GeneradorFactorial(numero);
					long factorial = generador.factorialRecursivo(generador.getNumero());
					// y finalmente utilizo getters para dar el factorial:
					System.out.println("\n\t--el factorial del número " + generador.getNumero() + " es " + factorial
							+ " por método recursivo ");
					// se le pregunta al usuario si desea seguir con el programa:
					System.out.print(
							"\n\tpor favor digite la letra \"y\" si desea seguir con este método, si desea volver al menú digite cualquier otra tecla: ");
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
