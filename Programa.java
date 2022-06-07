package programa2;

import java.util.Scanner;

public class Programa {

	Scanner en = new Scanner(System.in);
	
		void iniciar(){
			String or1, or2;
			
			or1=cargarString();
			or2=cargarString();
			menu(or1,or2);
		}
		
		//carga de teclado dos String
		String cargarString(String or1, String or2){
			//completar aquí
			
			System.out.println("ingrese dos cadenas de texto");
			String a;
			String b;
			or1=a=en.nextLine();
			return or2=b=en.nextLine();
			
			
			
			
		
				 
		}
		
		//despliega menu
		void menu(String a, String b){
				//completar aquí	
			int j = 0;
			
			a.length();
			b.length();
			
			System.out.println("MENU");
			
			switch (j) {
			
			case 0: System.out.println("0.Salir");
			break;
			case 1: System.out.println("1.Imprimir ambas cadenas y su largo.");
				System.out.println("el largo de las cadenas " + a + " y " + b + " es " + a.length() + b.length() + " caracteres.");
			break;
			case 2: System.out.println("2.Comparar igualdad y quien es menor (en caso de ser cadenas distintas).");
				if (a!=b) {
					System.out.println("son distintas");
					}else {
						System.out.println("las cadenas son iguales");
					}if (a.length() > b.length()) {
						System.out.println(b.length() + " es menor a " + a.length());
					}if (b.length() > a.length()) {
						System.out.println(a.length() + " es menor a " + b.length());
					}
			break;
			case 3: System.out.println("3.Cambiar una cadena a todo mayúsculas y otra a todo minúsculas.");
				System.out.println(a.toUpperCase());
			break;
			case 4: System.out.println("4.Cargar nuevamente ambos String.");
				System.out.println(a + b);
			break;
			
			
			}
			
			System.out.println("elija una opcion");
			j=en.nextInt();
			
		
			
		}

	

	}

