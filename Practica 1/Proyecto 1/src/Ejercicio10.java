import java.util.Scanner;


public class Ejercicio10 {
	public static void piramide(){
		System.out.println("Ingrese un número:");
		int n=0;
		Scanner s= new Scanner(System.in);
		n= s.nextInt();
		for(int i=1;i<=n;i++){
			for (int j=1;j<i+1;j++){
			System.out.print(" ");
			}
			for(int k=i;k<=n;k++){
			System.out.print(" "+i);
			}
		
		System.out.println("");
		}
	}

}
