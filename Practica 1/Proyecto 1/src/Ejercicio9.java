import java.util.Scanner;


public class Ejercicio9 {
	public static void romanos(){
		 String unidades[] = {" ","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};       
	        String decenas[] = {" ","X","XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
	        String centenas[] = {" ","C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"};
	        String miles[] = {" ","M", "MM", "MMM"};
	        Scanner numero= new Scanner(System.in);        
	       
	        int n=0;
	        
	       	           
	        do {
	        	 System.out.println("Ingresa un numero: ");
	        	 n=numero.nextInt();
				if (n>4000) {
					System.out.println("Ingrese un numero entre 1-3999");
			} 
				
	        } while (n>4000); 
	      
	        int mil =(n/1000); 
	       	int centena = (n / 100)%10;
	          int decena = (n / 10)%10;
	          int unidad = (n%10);
	          System.out.println("El numero "+n+" en romano es: "+miles[mil]+centenas[centena]+decenas[decena]+unidades[unidad]);
	        
	}

}
