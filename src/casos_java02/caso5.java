package casos_java02;
import java.util.Scanner;
public class caso5 {
	public static void main(String[] args) {
//Lea un precio y una cantidad, 
	//luego calcule descuento del 10% del total (precio * cantidad)
	//si la cantidad es superior a 8, caso contrario será 0, además calcule el neto. 
	Scanner sc=new Scanner(System.in);
	String msj= " ";
	
	System.out.print("INGRESE PRECIO:");
	float P = sc.nextFloat();
	System.out.println("INGRESE CANTIDAD:");
	float C=sc.nextFloat();
	float t=P*C;
	float des=(float)0.10*t;
	if (C>8)
		des=(float)0.10*t;
	else 
		des=0;
	float neto=des+t;
	System.out.println("RESULTADOS");
	System.out.println("--------------------------");	
	System.out.println("Total: "+t);
	System.out.println("Descuento: "+des);
	System.out.println("Neto: "+neto);
	

	
	
	
	
	
	
	
	
	
}
}