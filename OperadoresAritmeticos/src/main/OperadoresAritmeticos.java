package main;

public class OperadoresAritmeticos {
	
		
		public static void main(String[] args) {
			
			
			//Operadores Aritmeticos
			
			int variableX = 50, variableY = 10;
			int resultado;
			
			resultado = variableX + variableY;
			System.out.println(resultado);
			resultado = variableX - variableY;
			System.out.println(resultado);
			resultado = variableX * variableY;
			System.out.println(resultado);
			resultado = variableX / variableY;
			System.out.println(resultado);
			
	/*----- CONVINACIONES CON OPERADORES--------*/
			
			//variableX++; Aumenta o puede decrecer el numero como variableX--;//
			
			variableX+= 200; //Aumenta con 200 y da como resultado 250, también puede ser como -=200
			
			System.out.println(variableX);
			
			//Tambien aparte de la convinación -= 0 += podemos hacerlo con * y /

		}

	}
