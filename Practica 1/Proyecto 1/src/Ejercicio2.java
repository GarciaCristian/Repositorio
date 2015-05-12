import java.util.Scanner;


public class Ejercicio2 {
	public static void promedio(){
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0;
		System.out.println("Ingrese Notas:");
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		Scanner p= new Scanner(System.in);
		b= p.nextInt();
		Scanner q= new Scanner(System.in);
		c= q.nextInt();
		Scanner r= new Scanner(System.in);
		d= r.nextInt();
		Scanner t= new Scanner(System.in);
		e= t.nextInt();
		Scanner u= new Scanner(System.in);
		f= u.nextInt();
		g= ((a+b+c+d+e+f)/6);
		if(g>=90)
			System.out.println("Promedio= "+g+" "+"Puntuacion A");
		else if (g>=80)
			System.out.println("Promedio= "+g+" "+"Puntuacion B");
		else if (g>=70)
			System.out.println("Promedio= "+g+" "+"Puntuacion C");
		else if (g>=60)
			System.out.println("Promedio= "+g+" "+"Puntuacion D");
		else 
			System.out.println("Promedio= "+g+" "+"Puntuacion E");
	}

}
