package casos_java02;

import java.util.Scanner;
import java.text.DecimalFormat;
public class caso14 {
	public static void main(String[] args) {
		DecimalFormat df= new DecimalFormat("#.00");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print(" INGRESE ALUMNO : ");
		String n = sc.nextLine();
		System.out.print("INGRESE CARRERA [DS, RC, DG ] : ");
		String c= sc.nextLine();
		
		System.out.print("INGRESE TURNO [M  , T, N ]: ");
		String turno=sc.nextLine();
		int m=0;
		 switch (c){
         case "DS": 
        	 c="Desarrollo de software";
      	   m=1500;
            break;
         case "RC":
        	 c="Redes y Conectividad";
        	 m=1400;
        	 break;
         case "DG":
        	 c="Diseño Gráfico";
        	 m=1300;
        	 break;
        	 default:
        		 m=0;   
		 }  
      	float desc=(float)0 ;
      	switch (turno){
        case "M":
        	turno="mañana";
        	desc=(float)0.10;
        	break;
        case "T" :
        	turno="tarde";
        	desc=(float)0.20;
       break;
        case "N":
        	turno="noche";
        	desc=(float)0.15;
        	break;
        	default:
        		desc=0;
        		
}
      	float total=  m-m*desc;         
                     System.out.println("RESULTADOS");
                     System.out.println("--------------------------");
                     System.out.println("ALUMNO: "+ n);
                     System.out.println("CARRERA: "+c);
                     System.out.println("TURNO: "+turno);
                     System.out.println("MONTO: "+m);
                     System.out.println("DESCUENTO: "+desc);
                     System.out.println("TOTAL A PAGAR:"+ total);
                     System.out.println("TOTAL A PAGAR EN DOLARES: "+df.format(total/3.33));
}
}