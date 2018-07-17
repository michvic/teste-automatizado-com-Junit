package calculadora;

public class Calculadora {
	
	public Double dividir(Double dividendo, Double divisor) {
		if (divisor == 0)
			throw new RuntimeException();
		return dividendo / divisor;
	}
}
