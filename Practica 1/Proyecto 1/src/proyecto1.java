import java.util.Scanner;


public class proyecto1 {

	public static void main(String[] args) {
int MenuSelec = 0;
		
		System.out.println("~~..::||Practica 1||::..~~ \n");
		do{
			System.out.println("****||Ejercicios||**** ");
			System.out.println("[1] Ejercicio 1");
			System.out.println("[2] Ejercicio 2");
			System.out.println("[3] Ejercicio 3");
			System.out.println("[4] Ejercicio 4");
			System.out.println("[5] Ejercicio 5");
			System.out.println("[6] Ejercicio 6");
			System.out.println("[7] Ejercicio 7");
			System.out.println("[8] Ejercicio 8");
			System.out.println("[9] Ejercicio 9");
			System.out.println("[10] Ejercicio 10");
			System.out.println("[11] Ejercicio 11");
			System.out.println("[12] Ejercicio 12");
			System.out.println("[13] Ejercicio 13");
			System.out.println("[14] Ejercicio 14");
			System.out.println("[15] Ejercicio 15");
			
			Scanner s = new Scanner(System.in);

			MenuSelec = s.nextInt();

			switch(MenuSelec){

			case 1:
				Ejercicio1.rombo();
				break;
			case 2:
				Ejercicio2.promedio();
				break;
			case 3:
				Ejercicio3.hora();
				break;
			case 4:
				Ejercicio4.figuras();
				break;
			case 5:
				Ejercicio5.fecha();
				break;
			case 6:
				Ejercicio6.calculadora();
				break;
			case 7:
				Ejercicio7.tabla();
				break;
			case 8:
				Ejercicio8.limites();
				break;
			case 9:
				Ejercicio9.romanos();
				break;
			case 10:
				Ejercicio10.piramide();
				break;
			case 11:
				Ejercicio11.listado();
				break;
			case 12:
				Ejercicio12.contraseña();
				break;
			case 13:
				Ejercicio13.adivinar();
				break;
			case 14:
				Ejercicio14.cuadrado();
				break;
			case 15:
				Ejercicio15.impares();
				break;
				
			default:
				System.out.println("Opción no valida, elija unas de las opciones(1-15).\n");
				break;
			}
		}while(MenuSelec>15 || MenuSelec<=0);

	}

}
