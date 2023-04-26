package actividad1;

public class GeneradorFactorial {
	// defino los atributos privados

	private int numero;
	// defino el metodo constructor:

	GeneradorFactorial(int numero) {
		this.numero = numero;
	}
	// creo los metodos que se encargaran de generar el factorial por los dos
	// metodos:

	public long factorialIterativo() {
		int factorial = 1;
		for (int i = 1; i <= numero; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public long factorialRecursivo(int numero) {
		if (numero == 0) {
			return 1;
		} else {
			return numero * factorialRecursivo(numero - 1);
		}
	}
	// creo los setters y getters de los atributos privados:

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
