import java.util.Scanner;


public class Ejercicio12 {
	public static void contraseña(){
		String a;
		System.out.println("Ingrese palabra");
		Scanner s= new Scanner(System.in);
		a=s.next();
		
		int b=a.length();
		for (int i=1 ; i <=b; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println(a);
	}

}
