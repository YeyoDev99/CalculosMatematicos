package DeterminanteMatriz;

public class CalculadorDeterminanteMatriz {
	// defino los atributos privados

	private double[][] matriz;
	// defino el metodo constructor:

	CalculadorDeterminanteMatriz(double[][] matriz) {
		this.matriz = matriz;
	}
	// creo los metodos que se encargaran de calcular el determinante por los dos
	// metodos:

	public double calcularDeterminanteIterativo() {
		double determinante = 0;
		// se calcula el determiante por el metodo de Sarrus:
		determinante += matriz[0][0] * matriz[1][1] * matriz[2][2];
		determinante += matriz[1][0] * matriz[2][1] * matriz[0][2];
		determinante += matriz[2][0] * matriz[0][1] * matriz[1][2];
		determinante -= matriz[0][2] * matriz[1][1] * matriz[2][0];
		determinante -= matriz[1][2] * matriz[2][1] * matriz[0][0];
		determinante -= matriz[2][2] * matriz[0][1] * matriz[1][0];
		return determinante;
	}

	public double calcularDeterminanteRecursivo(double[][] matriz) {
		// se calcula el determianante por su definicion y se usa recursividad para
		// calcular los determinantes de las menores de la matriz:
		if (matriz.length == 1) {
			return matriz[0][0];
		} else if (matriz.length == 2) {
			double[][] subMatriz1 = { { matriz[1][1] } };
			double[][] subMatriz2 = { { matriz[0][1] } };

			return matriz[0][0] * calcularDeterminanteRecursivo(subMatriz1)
					- matriz[1][0] * calcularDeterminanteRecursivo(subMatriz2);

		} else {
			double[][] subMatriz1 = { { matriz[1][1], matriz[1][2] }, { matriz[2][1], matriz[2][2] } };
			double[][] subMatriz2 = { { matriz[0][1], matriz[0][2] }, { matriz[2][1], matriz[2][2] } };
			double[][] subMatriz3 = { { matriz[0][1], matriz[0][2] }, { matriz[1][1], matriz[1][2] } };
			return matriz[0][0] * calcularDeterminanteRecursivo(subMatriz1)
					- matriz[1][0] * calcularDeterminanteRecursivo(subMatriz2)
					+ matriz[2][0] * calcularDeterminanteRecursivo(subMatriz3);
		}
	}
	// creo los setters y getters de los atributos privados:

	public double[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(double[][] matriz) {
		this.matriz = matriz;
	}

}
