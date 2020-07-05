package casos_java02;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
// Lea los siguientes datos: empleado, horas trabajadas,
		//tarifa por hora y el número de minutos de tardanza, se pide calcular: 
		Scanner sc= new Scanner (System.in);
		System.out.println("ingrese empleado:");
		String empl = "";
		System.out.println("ingrese horas trabajadas: ");
		float  horas=sc.nextFloat();
		System.out.println("ingrese tarifa por hora: ");
		float t=sc.nextFloat();
		System.out.println("ingrese numeros de minutos de tardanza: ");
		float tard=sc.nextFloat();
		float importe= horas*t;
		float bono=0;
		if (horas >=0)
			bono=0.13f;
		else
			bono=0.04f;
		float des=0;
	   if (tard>15)
		   des=0.13f;
	   else 
		   des=0f;
	    float alcanzado=horas*100/70;
System.out.println("Ressultados:");
System.out.println("--------------------------");
System.out.println("empleado: "+empl);
System.out.println("horas trabajadas"+horas);			
System.out.println("tarifa por hora: "+t);		
System.out.println("importe: "+importe);		
System.out.println("bono: "+bono);	
System.out.println("descuento: "+des);
System.out.println("meta alcanzada"+alcanzado);
	}

}
