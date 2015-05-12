import java.util.Scanner;


public class Ejercicio14 {
	public static void cuadrado(){
		System.out.println("Ingrese Tamaño del Cuadro");
		int a=0;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		for(int i=1; i<=a;i++){
			for(int j=1;j<=a;j++){
				if(j==1||j==a||i==1||i==a){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
