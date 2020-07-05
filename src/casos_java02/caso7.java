package casos_java02;

import java.util.Scanner;
import java.text.DecimalFormat;
public class caso7 {

	public static void main(String[] args) {
		//  Lea un sueldo y muestre el impuesto según la siguiente escala:
		// Hasta 1500, se aplica 3% sobre el sueldo.  Más de 1500 – 3000,
		//se aplica 8% sobre el sueldo.  Más de 3000, se aplica 12% sobre el sueldo.   
  Scanner sc=new Scanner(System.in);
  
  DecimalFormat df= new DecimalFormat(("#.00"));
  System.out.println();
  
  float sueldo=0,impuesto=0;
  System.out.print("ingrese sueldo:");
  sueldo=sc.nextFloat();
  
  if (sueldo<=1500) 
	  impuesto= 0.03f*sueldo;
  else if (sueldo<=3000)
      impuesto=0.08f*sueldo;
      else
	  impuesto=0.12f*sueldo;
	  
	  System.out.println("impuesto calculado:"+df.format(impuesto));
	}
  
	
}
