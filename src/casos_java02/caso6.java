package casos_java02;
import java.util.Scanner;
public class caso6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	System.out.println("INGRESE SUELDO :");
	int s=sc.nextInt();
	float i=0;
	if (s>2800)
		i=(float)0.05*s;
	else
		i=(float)0.02*s;
	System.out.println("Impuesto calculado: "+i);
	
		

	}

}
