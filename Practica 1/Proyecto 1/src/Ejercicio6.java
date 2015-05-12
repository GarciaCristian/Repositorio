import java.util.Scanner;


public class Ejercicio6 {
	public static void calculadora(){
		System.out.println("Ingrese Valor 1:"); 
		int a=0;
		Scanner q= new Scanner(System.in);
		a= q.nextInt();
		System.out.println("Ingrese Valor 2:"); 
		int b=0;
		Scanner r= new Scanner(System.in);
		b= r.nextInt();
		System.out.println("Ingrese Operación:");
		String c;
		Scanner p= new Scanner(System.in);
		c=p.nextLine();
		switch (c){
		case "r":
			System.out.println("La resta de "+a+"-"+b +" es="+(a-b));break;
		case "s":
			System.out.println("La suma de "+a+"+"+b +" es="+(a+b));break;
		case "d": 
			System.out.println("La divión de "+a+"/"+b +" es="+(a/b));break;
		case "m":
			System.out.println("La multiplicación de "+a+"*"+b +" es="+(a*b));break;
		default:
			System.out.println("ingrese una operación válida ");break;
			
		}
	}

}
