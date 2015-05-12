import java.util.Scanner;


public class Ejercicio3 {
	public static void hora(){
		System.out.println("Ingrese hora:" );
		int a=24;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Ingrese Minutos:" );
		int b=0;
		Scanner t=new Scanner(System.in);
		b=t.nextInt();
		switch (a){
		case 0: System.out.println("Hora:"+"00"+":"+b+" AM");break;
		case 1: System.out.println("Hora:"+"01"+":"+b+" AM");break;
		case 2: System.out.println("Hora:"+"02"+":"+b+" AM");break;
		case 3: System.out.println("Hora:"+"03"+":"+b+" AM");break;
		case 4: System.out.println("Hora:"+"04"+":"+b+" AM");break;
		case 5: System.out.println("Hora:"+"05"+":"+b+" AM");break;
		case 6: System.out.println("Hora:"+"06"+":"+b+" AM");break;
		case 7: System.out.println("Hora:"+"07"+":"+b+" AM");break;
		case 8: System.out.println("Hora:"+"08"+":"+b+" AM");break;
		case 9: System.out.println("Hora:"+"09"+":"+b+" AM");break;
		case 10: System.out.println("Hora:"+"10"+":"+b+" AM");break;
		case 11: System.out.println("Hora:"+"11"+":"+b+" AM");break;
		case 12: System.out.println("Hora:"+"12"+":"+b+" PM");break;
		case 13: System.out.println("Hora:"+"01"+":"+b+" PM");break;
		case 14: System.out.println("Hora:"+"02"+":"+b+" PM");break;
		case 15: System.out.println("Hora:"+"03"+":"+b+" PM");break;
		case 16: System.out.println("Hora:"+"04"+":"+b+" PM");break;
		case 17: System.out.println("Hora:"+"05"+":"+b+" PM");break;
		case 18: System.out.println("Hora:"+"06"+":"+b+" PM");break;
		case 19: System.out.println("Hora:"+"07"+":"+b+" PM");break;
		case 20: System.out.println("Hora:"+"08"+":"+b+" PM");break;
		case 21: System.out.println("Hora:"+"09"+":"+b+" PM");break;
		case 22: System.out.println("Hora:"+"10"+":"+b+" PM");break;
		case 23: System.out.println("Hora:"+"11"+":"+b+" PM");break;
		case 24: System.out.println("Hora:"+"00"+":"+b+" AM");break;
		default: System.out.println("Ingrese hora válida");break;
		}
	}

}
