package Controlador;

import java.rmi.RemoteException;

import Servicio.SumaYFactorialServicioProxy;

public class MainClass {

	public static void main(String[] args) {
		// Instanciamos al objeto
		SumaYFactorialServicioProxy obj = new SumaYFactorialServicioProxy();
		try {
			// Obtenemos la suma de dos numeros y la guardamos en una variable
			int valorsuma = obj.sumaNumeros(1,3);
			// Obtenemos el factorial de un numero y lo guardamos en una variable
			int valorfactorial = obj.factorial(3);
			// Imprimimos las variables
			System.out.println(valorsuma);
			System.out.println(valorfactorial);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
