import java.util.Scanner;
public class tarea_3 {
	public static void main(String[] args) {
		int a;
		System.out.println("Ingrese número:");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
		System.out.println("El Numero "+ a +" Es Par");
		else 
		System.out.println("El Numero "+ a +" Es Impar");
	}
}


