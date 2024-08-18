package main;

public class operadores {
	
	public static void main(String []args) {
		
		// Operadores aritméticos. 
		// Declaración de las variables.
		int variableX = 50, variableY= 10;
		int resultado;
		
		// Realización de una operación de suma. 
		resultado = variableX + variableY;
		
		// Imprimos el resultado.
		System.out.println(resultado);
		
		// Realización de una operación resta.
		resultado = variableX - variableY;
		
		// Imprimos el resultado. 
		System.out.println(resultado);
		
		// Realización de una operación multiplicación.
		resultado = variableX * variableY;
				
		// Imprimos el resultado. 
		System.out.println(resultado);
		
		// Realización de una operación división (/).
		resultado = variableX / variableY;
				
		// Imprimos el resultado. 
		System.out.println(resultado);
		
		// Agregamos un valor más a la variable.
		variableX = variableX + 1;
		System.out.println(variableX);
		
		// crecemos a la variable.
		variableX++;
		System.out.println(variableX);
		
		// Decrecemos a la variable.
		variableX--;
		System.out.println(variableX);
		
		// Sumamos 100 a nuestra variable
		variableX += 100;
		System.out.println(variableX);
		
		// Sumamos 100 a nuestra variable
		variableX -= 100;
		System.out.println(variableX);
		
		// Multiplicamos a la variableX por 3
		variableX *= 3; 
		System.out.println(variableX);
		
		// dividimos por 5 a nuestra variable
		variableX /= 5;
		System.out.println(variableX);
		
		
	}
}
