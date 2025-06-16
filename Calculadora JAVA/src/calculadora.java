import java.util.Scanner;

public class calculadora {
	
	// Funciones
	
	// Menus
	
	public static int menu() {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("----- MENU -----");
		System.out.print("1. Operaciones\n2. Operaciones con Vectores\n3. Operaciones con Matrices\n4. Sistemas de Ecuacion\n5. Salir\nOpcion: ");
		if(scanner.hasNextInt()) {
			opcion = scanner.nextInt();
		} else {
			scanner.next();
			opcion = -1;
		}
		return opcion;
		
	}
	
	public static int menuOperaciones() {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("----- MENU OPERACIONES -----");
		System.out.print("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Potencia\n6. Raíz\n7. Atras\nOpcion: ");
		if(scanner.hasNextInt()) {
			opcion = scanner.nextInt();
		} else {
			scanner.next();
			opcion = -1;
		}
		return opcion;
		
	}
	
	public static int menuVectores() {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("----- MENU VECTORES -----");
		System.out.print("1. Suma\n2. Resta\n3. Multiplicacion por escalar\n4. Producto Escalar\n5. Producto Vectorial\n6. Atras\nOpcion: ");
		if(scanner.hasNextInt()) {
			opcion = scanner.nextInt();
		} else {
			scanner.next();
			opcion = -1;
		}
		return opcion;
		
	}
	
	public static int menuMatrices() {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("----- MENU MATRICES -----");
		System.out.print("1. Suma\n2. Resta\n3. Multiplicacion por escalar\n4. Multiplicacion\n5. Averiguar Determinante \n6. Averiguar Inversa\n7. Division\n8. Atras\nOpcion: ");
		if(scanner.hasNextInt()) {
			opcion = scanner.nextInt();
		} else {
			scanner.next();
			opcion = -1;
		}
		return opcion;
		
	}
	
	public static int menuSistemas() {
		
		Scanner scanner = new Scanner(System.in);
		
		int opcion;
		
		System.out.println("----- MENU SISTEMAS -----");
		System.out.print("1. Sistemas 2x2\n2. Sistemas 3x3\n3. Atras\nOpcion: ");
		if(scanner.hasNextInt()) {
			opcion = scanner.nextInt();
		} else {
			scanner.next();
			opcion = -1;
		}
		return opcion;
		
	}
	
	// MAIN

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean terminado = false;
		float[][] resultado = new float[255][255];
		
		do {
			
			switch(menu()) {
			
			case 1:
				switch(menuOperaciones()) {
				case 1:
					operaciones.suma();
					break;
					
				case 2:
					operaciones.resta();
					break;
					
				case 3:
					operaciones.multiplicacion();
					break;
					
				case 4:
					operaciones.division();
					break;
					
				case 5:
					operaciones.potencia();
					break;
					
				case 6:
					operaciones.raiz();
					break;
					
				case 7:
					// Atras
					break;
					
				default:
					System.out.println("Esa no es una opción valida.");
				}
				break;
				
			case 2:
				switch(menuVectores()) {
				case 1:
					operaciones.sumaVectores();
					break;
					
				case 2:
					operaciones.restaVectores();
					break;
					
				case 3:
					operaciones.multiplicacionporescalarv();
					break;
					
				case 4:
					operaciones.productoescalar();
					break;
					
				case 5:
					operaciones.productovectorial();
					break;
					
				case 6:
					// Atras
					break;
					
				default:
					System.out.println("Esa no es una opción valida.");	
				}
				break;
				
			case 3:
				switch(menuMatrices()) {
				case 1:
					
					break;
					
				case 2:
					
					break;
					
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				case 5:
					
					break;
					
				case 6:
					
					break;
					
				case 7:
					break;
					
				case 8:
					// Atras
					break;
					
				default:
					System.out.println("Esa no es una opción valida.");
				}
				break;
				
			case 4:
				switch(menuSistemas()) {
				
				case 1:
					float[] aux_sistema2x2 = new float[2];
					aux_sistema2x2 = operaciones.sistemas2x2();
					break;
					
				case 2:
					float[] aux_sistema3x3 = new float[3];
					aux_sistema3x3 = operaciones.sistemas3x3();
					break;
					
				case 3:
					// Atras
					break;
					
				default:
					System.out.println("Esa no es una opción valida.");
				}
				break;
				
			case 5:
				terminado = true;
				break;
			
			default:
				System.out.println("Esa no es una opción valida.");
			}
			
		}while(terminado == false);
		
		System.out.print("Sistema finalizado.");

	}

}
