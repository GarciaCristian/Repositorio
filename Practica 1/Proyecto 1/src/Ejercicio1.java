
public class Ejercicio1 {
	public static void rombo(){
		for(int i=0;i<5;i++){
			for (int j=i;j<4;j++){
			System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++){
			System.out.print("*");
			}
			
		System.out.println("");
			
		}
		for(int i=4;i>0;i--){
			for (int j=i;j<5;j++){
			System.out.print(" ");
			}
			for(int k=(2*i)-1;k>0;k--){
			System.out.print("*");
			}
			
		System.out.println("");
		}
	}

}
