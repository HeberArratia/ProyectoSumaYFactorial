package Servicio;

public class SumaYFactorialServicio {
	
	// Metodo que recibe dos parametros de entero y retorna la suma
	public int sumaNumeros(int a, int b){
		return a + b;
	}
	
	// Metodo que calcula el factorial de un numero que recibe por parametro
	public int factorial(int a){
		// Comienza a contar desde 1
		int factorial = 1;
		// El ciclo se ejecuta la cantidad de veces del numero recibido
		for (int i = 1; i<=a;i++){
			// Se multiplica cada factor
			factorial *= i;
		}
		// Se retorna el factorial
		return factorial;
	}

}
