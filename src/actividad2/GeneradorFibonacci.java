package actividad2;

public class GeneradorFibonacci {
	// defino los atributos privados

	private int numero;
	// defino el metodo constructor:

	GeneradorFibonacci(int numero) {
		this.numero = numero;
	}
	// creo los metodos que se encargaran de generar la sucesión por los dos
	// metodos:

	public int fibonacciIterativo() {
		if (numero <= 1) {
			return numero;
		}
		int numeroFib = 1;
		int numeroAnterior = 1;
		for (int i = 2; i < numero; i++) {
			int numeroTemporal = numeroFib;
			numeroFib += numeroAnterior;
			numeroAnterior = numeroTemporal;
		}
		return numeroFib;
	}

	public int fibonacciRecursivo(int numero) {
		if (numero <= 1) {
			return numero;
		} else {
			return fibonacciRecursivo(numero - 1) + fibonacciRecursivo(numero - 2);
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
