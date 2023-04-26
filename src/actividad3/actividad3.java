/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * PROGRAMA: CALCULADOR DE DETERMINANTE DE MATRIZ 3X3
 * FECHA: 25 DE MARZO DE 2023
 */

package actividad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class actividad3 {
	public static void main(String[] args) throws IOException {
		// declaro el BufferedReader:
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"\n\tBienvenido al calculador de determinante de una matriz 3x3 por método iterativo y recursivo:");
		// creo un ciclo para definir el programa:
		while (true) {
			System.out.println("\n\tdigite una opcion para calcular el determinante: ");
			System.out.println("\n\t1-método iterativo: ");
			System.out.println("\t2-método recursivo: ");

			System.out.print("\n\tdigite cualquier otra tecla para salir: ");
			String eleccionMenu = in.readLine();
			if (eleccionMenu.equals("1")) {
				while (true) {
					System.out.println("\n\tIntroduzca los elementos de la matriz de orden 3x3:\n");
					double[][] matriz = new double[3][3];
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							int numeroIUsuario = i + 1;
							int numeroJUsuario = j + 1;
							System.out.print("\tElemento " + "[" + numeroIUsuario + "]" + "[" + numeroJUsuario + "]: ");
							matriz[i][j] = Double.parseDouble(in.readLine());
						}
					}
					// se crea el objeto a partir de la clase "CalculadorDeterminanteMatriz"
					CalculadorDeterminanteMatriz generador = new CalculadorDeterminanteMatriz(matriz);
					double determinante = generador.calcularDeterminanteIterativo();

					System.out.println("\n\tel determianante de la matriz:\n");
					for (int i = 0; i < 3; i++) {
						System.out.print("\t| ");
						for (int j = 0; j < 3; j++) {
							System.out.print(generador.getMatriz()[i][j] + "  ");
						}
						System.out.print("|");
						System.out.println();

					}
					System.out.println(" \n\tpor el método iterativo es: ");
					System.out.println("\n\t" + determinante);

					System.out.print(
							"\n\n\tpor favor digite la letra \"y\" si desea seguir con este método, si desea volver al menu digite cualquier otra tecla: ");
					String eleccionError = in.readLine().toLowerCase();
					if (!eleccionError.equals("y")) {
						System.out.print(
								"\n\t----------------------------------------------------------------------------------------------------------- ");
						break;

					}
				}
			} else if (eleccionMenu.equals("2")) {
				while (true) {
					System.out.println("\n\tIntroduzca los elementos de la matriz de orden 3x3:\n");
					double[][] matriz = new double[3][3];
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							int numeroIUsuario = i + 1;
							int numeroJUsuario = j + 1;
							System.out.print("\tElemento " + "[" + numeroIUsuario + "]" + "[" + numeroJUsuario + "]: ");
							matriz[i][j] = Double.parseDouble(in.readLine());
						}
					}
					// se crea el objeto a partir de la clase "CalculadorDeterminanteMatriz"
					CalculadorDeterminanteMatriz generador = new CalculadorDeterminanteMatriz(matriz);
					double determinante = generador.calcularDeterminanteRecursivo(generador.getMatriz());

					System.out.println("\n\tel determianante de la matriz:\n");
					for (int i = 0; i < 3; i++) {
						System.out.print("\t| ");
						for (int j = 0; j < 3; j++) {
							System.out.print(generador.getMatriz()[i][j] + "  ");
						}
						System.out.print("|");
						System.out.println();

					}
					System.out.println(" \n\tpor el método recursivo es: ");
					System.out.println("\n\t" + determinante);
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