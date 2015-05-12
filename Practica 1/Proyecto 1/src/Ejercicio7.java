import java.util.Scanner;


public class Ejercicio7 {
	public static void tabla(){
		 Scanner sc = new Scanner(System.in);
	        int n;
	        System.out.print("Introduce un número entero: ");
	        n = sc.nextInt();
	        System.out.println("Tabla del " + n);
	        for(int i = 10; i>=0; i--){
	             System.out.println(n + " X " + i + " = " + n*i);
	       }
	}
}
