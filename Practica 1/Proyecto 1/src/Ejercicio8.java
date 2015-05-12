import java.util.Scanner;


public class Ejercicio8 {
	public static void limites(){
		System.out.println("Ingrese limite inferior:");
		int a=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		
		System.out.println("Ingrese limite superior:");
		int b=0;
		Scanner r=new Scanner(System.in);
		b=r.nextInt();
		int c=0;
		c=(int) (Math.random()*(a-b)+b);
		System.out.println(c);
		
		 String unidades[] = {" ","uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};       
	        String decenas[] = {" ","diez","veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
	        String centenas[] = {" ","cien"};
	       
	         
	            int centena= (c / 100)%10;
	            int decena= (c / 10)%10;
	            int unidad= (c%10);
	            
	            System.out.println(c+"= "+centenas[centena]+decenas[decena]+" y "+unidades[unidad]);
	            
	}

}
