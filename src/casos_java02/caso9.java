package casos_java02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso9 {
	//Caso 9: Lea los siguientes datos: alumno, dos notas y el número de asistencias,
	//se pide calcular:  Promedio: Considere el peso de 30% y 70% respectivamente. 
	// % Asistencias: Considere que son un total de 12 sesiones por curso.  Estado: 
	//Considere que será Aprobado si el promedio es a partir de 13 y asistió como mínimo el 70%,
	//caso contrario será Desaprobado. Al final, muestre cada resultado obtenido.

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  
		  DecimalFormat df= new DecimalFormat(("#.00"));
		  System.out.println();
		  
		  float nota1=0,nota2=0,asistencia=0,promedio=0;
		  String nom="",estado=" ";
		  System.out.print("INGRESE NOMBRE:");
		  nom=sc.nextLine();
		  System.out.println("INGRESE NOTA1:");
		  nota1=sc.nextFloat();
		  System.out.println("ingrese nota2:");
		  nota2=sc.nextFloat();
		  System.out.println("ingrese asistencia de (0-12):");
		  asistencia=sc.nextFloat();
		  
		 promedio =(float)( nota1*0.30+nota2*0.70);
		 float porcentaje =asistencia*100/12f;
		
		 if(promedio >=13 && porcentaje>=70)
		 estado= "aprobado";
		 else
	estado="desaprobado";
			 
			  
	 System.out.println("resultado notas promedio "+promedio);
	 System.out.println("su estado "+ estado );


	}

}
