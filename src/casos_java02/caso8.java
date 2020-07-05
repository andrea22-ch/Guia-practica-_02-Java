package casos_java02;

import java.util.Scanner;


public class caso8 {

	public static void main(String[] args) {
//Caso 8: Lea una nota y muestre un mensaje según la siguiente
		//escala:  00 – 07, muestre “Sin Palabras”.
		// 08 – 10, muestre “Malo”.  11 – 14, muestre “Regular”.
		// 15 – 17, muestre “Notable”.  18 – 20, muestre “Excelente"
		Scanner sc= new Scanner (System.in);
	    System.out.print("ingrese nota: ");
	    int nota= sc.nextInt();
	    String msj= "";
	    
	    if (nota<=07 && nota>=00)
	    	msj="Sin palabras";
	    else
	    	if (nota>=8 && nota<=10)
	    		msj="malo";
	    	if (nota>=11 && nota<=15)
	    		msj ="regular";
	    		if(nota>=16 && nota<=20)
	    			msj="excelente";
	    		else
	    			msj="nota fuera de rango";
	    	
        
	
	 System.out.println("respuestas:");
	 System.out.println("-----------------------");
	 System.out.println("estado obtenido: "+msj);
	}

}
