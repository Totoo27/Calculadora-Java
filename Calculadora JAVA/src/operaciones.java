import java.util.Scanner;

public class operaciones {

	
	// Otro
	
	public static char PosToChar(int numero) {
		char caracter = ' ';

		if(numero == 0){
			caracter = 'A';
		} else if(numero == 1){
			caracter = 'B';
		} else if(numero == 2){
			caracter = 'C';
		} else if(numero == 3){
			caracter = 'D';
		}

		return caracter;
	}
	
	// Operaciones comunes
	
	public static float suma() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		float res = a+b;
		
		System.out.print("El resultado es: " + res);
		
		return res;
	}
	
	public static float resta() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		float res = a-b;
		
		System.out.print("El resultado es: " + res);
		
		return res;
	}
	
	public static float multiplicacion() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		float res = a*b;
		
		System.out.print("El resultado es: " + res);
		
		return res;
	}
	
	public static float division() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		if(b != 0) {
			float res = a/b;
			
			System.out.print("El resultado es: " + res);
			
			return res;
		} else {
			System.out.print("No se puede dividir entre 0");
			return 0;
		}
		
	}
	
	public static float potencia() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		float res = (float) Math.pow(a, b);
		
		System.out.print("El resultado es: " + res);
		
		return res;
	}
	
	public static float raiz() {
		// Variables
		
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		
		//ingreso de datos
		System.out.print("Ingrese el primer numero");
		a = scanner.nextFloat();
		System.out.print("Ingrese el segundo numero");
		b = scanner.nextFloat();
		
		//resultado
		if(b != 0) {
			float res = (float) Math.pow(a, 1/b);
			
			System.out.print("El resultado es: " + res);
			
			return res;
		} else {
			System.out.print("No se puede hacer raiz de 0");
			return 0;
		}
	}
	
	// Operaciones con Vectores
	
	public static float[] ingresoVector(float[] vector){
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < vector.length; i++){

			System.out.print("Ingrese el numero " + (i + 1) + ": ");
			vector[i] = scanner.nextFloat();

		}
		
		System.out.println("");
		return vector;
	}
	
	public static float[] sumaVectores() {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int limite;
		
		System.out.print("Ingrese las dimensiones de los vectores: ");
		limite = scanner.nextInt();
		
		float[] vector1 = new float[limite];
		float[] vector2 = new float[limite];
		float[] vector3 = new float[limite];
		
		System.out.println("Ingrese los valores del vector 1: ");
		vector1 = ingresoVector(vector1);
		
		System.out.println("Ingrese los valores del vector 2: ");
		vector2 = ingresoVector(vector2);
		
		
		System.out.println("El vector resultado es:");
		for(int i = 0; i<limite;i++) {
			vector3[i] = vector1[i] + vector2[i];
			System.out.print(vector3[i]+"\t");
		}
		
		System.out.println("");
		return vector3;
		
	}
	
	public static float[] restaVectores() {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int limite;
		
		System.out.print("Ingrese las dimensiones de los vectores: ");
		limite = scanner.nextInt();
		
		float[] vector1 = new float[limite];
		float[] vector2 = new float[limite];
		float[] vector3 = new float[limite];
		
		System.out.println("Ingrese los valores del vector 1: ");
		vector1 = ingresoVector(vector1);
		
		System.out.println("Ingrese los valores del vector 2: ");
		vector2 = ingresoVector(vector2);
		
		
		System.out.println("El vector resultado es:");
		for(int i = 0; i<limite;i++) {
			vector3[i] = vector1[i] - vector2[i];
			System.out.print(vector3[i]+"\t");
		}
		
		System.out.println("");
		return vector3;
		
	}
	
	public static float[] multiplicacionporescalarv() {
		
		Scanner scanner = new Scanner(System.in);
		
		int limite;
		float escalar;
		
		System.out.print("Ingrese las dimensiones de los vectores: ");
		limite = scanner.nextInt();
		
		float[] vector = new float[limite];
		float[] vectorR = new float[limite];
		
		System.out.println("Ingrese los valores del vector 1: ");
		vector = ingresoVector(vector);
		
		System.out.print("Ingrese el escalar por el que se multiplicará: ");
		escalar = scanner.nextFloat();
		
		for(int i = 0; i<limite; i++) {
			
			vectorR[i] = vector[i] * escalar;
			System.out.print(vectorR[i] + "\t");
			
		}
		
		System.out.println("");
		
		return vectorR;
		
	}
	
	public static float productoescalar() {
		
		Scanner scanner = new Scanner(System.in);
		
		int limite;
		float resultado = 0;
		
		System.out.print("Ingrese las dimensiones de los vectores: ");
		limite = scanner.nextInt();
		
		float[] vector1 = new float[limite];
		float[] vector2 = new float[limite];
		
		System.out.println("Ingrese los valores del vector 1: ");
		vector1 = ingresoVector(vector1);
		
		System.out.println("Ingrese los valores del vector 2: ");
		vector2 = ingresoVector(vector2);
		
		for(int i=0; i<limite; i++){
			resultado+=vector1[i]*vector2[i];
		}
		
		System.out.println("El producto escalar de ambos vectores es: " + resultado);
		
		return resultado;
	}
	
	public static float[] productovectorial() {
		
		int limite = 3;
		
		float[] vector1 = new float[limite];
		float[] vector2 = new float[limite];
		float[] vectorR = new float[limite];
		
		System.out.println("Ingrese los valores del vector 1: ");
		vector1 = ingresoVector(vector1);
		
		System.out.println("Ingrese los valores del vector 2: ");
		vector2 = ingresoVector(vector2);
		
		vectorR[0]=(vector1[1]*vector2[2])-(vector2[1]*vector1[2]);
		vectorR[1]=(vector1[2]*vector2[0])-(vector2[2]*vector1[0]);
		vectorR[2]=(vector1[0]*vector2[1])-(vector2[0]*vector1[1]);
		
		System.out.println("El vector resultado es:");
		for(int i = 0; i<limite;i++) {
			System.out.println(vectorR[i]+"\t");
		}
		
		return vectorR;
		
	}
	
	// Operaciones con Matrices
	
	
	
	// Sistemas de Ecuación
	
	public static float[] sistemas2x2() {
		
		Scanner scanner = new Scanner(System.in);
		
		float[] incognitas = new float[2];
		
		// Variables
		int limite = 2;
		char posicion;
		float[][] matriz = new float[limite+1][limite];

		// Aclaracion
		System.out.println("Tener en cuenta que los valores se reemplazaran asi:");
		System.out.println("A1*x + B1*y = C1");
		System.out.println("A2*x + B2*y = C2");

		// Ingreso de datos

		for(int i = 0; i<limite/*Le sumas 1 para añadirle el resultado.*/;i++){

			for(int j = 0; j<limite+1;j++){
				
				System.out.print("Ingrese el valor " + PosToChar(j) + " de la ecuacion " + (i + 1) + ": ");
				matriz[j][i] = scanner.nextFloat();

			}

		}

		// Proceso matematico

		float D = matriz[0][0] * matriz[1][1] -  matriz[0][1] * matriz[1][0]; // Determinante

		float Dx = matriz[2][0] * matriz[1][1] -  matriz[2][1] * matriz[1][0]; // Determinante X

		float Dy = matriz[0][0] * matriz[2][1] -  matriz[0][1] * matriz[2][0]; // Determinante Y

		// Resultado

		if(D == 0 && Dx == 0 && Dy == 0){
			System.out.println("El sistema tiene infinitas soluciones.");
		} else if(D == 0){
			System.out.println("El sistema no tiene solución.");
		} else {
			incognitas[0] = Dx / D;
			incognitas[1] = Dy / D;

			System.out.println("X = " + incognitas[0]);
			System.out.println("Y = " + incognitas[1]);
		}
		
		return incognitas;
	}
	
public static float[] sistemas3x3() {
		
		Scanner scanner = new Scanner(System.in);
		
		float[] incognitas = new float[3];
		
		// Variables
		int limite = 3;
		char posicion;
		float[][] matriz = new float[limite+1][limite];

		// Aclaracion
		System.out.println("Tener en cuenta que los valores se reemplazaran asi:");
		System.out.println("A1*x + B1*y + C1*z = D1");
		System.out.println("A2*x + B2*y + C2*z = D2");
		System.out.println("A3*x + B3*y + C3*z = D3");
		
		// Ingreso de datos

		for(int i = 0; i<limite/*Le sumas 1 para añadirle el resultado.*/;i++){

			for(int j = 0; j<limite+1;j++){
				int pos = i+1;
				
				System.out.print("Ingrese el valor " + PosToChar(j) + " de la ecuacion " + pos + ": ");
				matriz[j][i] = scanner.nextFloat();

			}

		}

		// Proceso matematico

		float D = (matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1]) * matriz[0][0]
				- (matriz[0][1]*matriz[2][2] - matriz[0][2]*matriz[2][1]) * matriz[1][0]
				+ (matriz[0][1]*matriz[1][2] - matriz[0][2]*matriz[1][1]) * matriz[2][0];

		float Dx = (matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1]) * matriz[3][0]
				 - (matriz[3][1]*matriz[2][2] - matriz[3][2]*matriz[2][1]) * matriz[1][0]
				 + (matriz[3][1]*matriz[1][2] - matriz[3][2]*matriz[1][1]) * matriz[2][0];

		float Dy = (matriz[3][1]*matriz[2][2] - matriz[3][2]*matriz[2][1]) * matriz[0][0]
	         	 - (matriz[0][1]*matriz[2][2] - matriz[0][2]*matriz[2][1]) * matriz[3][0]
	         	 + (matriz[0][1]*matriz[3][2] - matriz[0][2]*matriz[3][1]) * matriz[2][0];

		float Dz = (matriz[1][1]*matriz[3][2] - matriz[1][2]*matriz[3][1]) * matriz[0][0]
				 - (matriz[0][1]*matriz[3][2] - matriz[0][2]*matriz[3][1]) * matriz[1][0]
				 + (matriz[0][1]*matriz[1][2] - matriz[0][2]*matriz[1][1]) * matriz[3][0];

		// Resultado

		if(D == 0 && Dx == 0 && Dy == 0 && Dz == 0){
			System.out.println("El sistema tiene infinitas soluciones.");
		} else if(D == 0){
			System.out.println("El sistema no tiene solución.");
		} else {
			incognitas[0] = Dx / D;
			incognitas[1] = Dy / D;
			incognitas[2] = Dz / D;

			System.out.println("X = " + incognitas[0]);
			System.out.println("Y = " + incognitas[1]);
			System.out.println("Z = " + incognitas[2]);
		}
		
		return incognitas;
	}

}
