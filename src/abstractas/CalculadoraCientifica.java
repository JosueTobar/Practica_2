package abstractas;

import java.util.Scanner;

public class CalculadoraCientifica extends Calculadora {

	
	@Override
	public double sumar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public double restar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public double multiplicar(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public double dividir(double num1, double num2) {
		
		return num1 / num2;
	}

	@Override
	public boolean validar(String cadena) {
	// TODO Auto-generated method stub
		double num;
		try {
		    num = Double.parseDouble(cadena);
		return true;
		} catch (Exception e) {
			System.err.print("solo puede ingresar numeros :");
			return false;
		}
	}
}
