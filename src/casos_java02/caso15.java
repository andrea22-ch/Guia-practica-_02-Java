package casos_java02;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso15 {
	public static void main(String[] args) {
		
				DecimalFormat df= new DecimalFormat("#.00");
				System.out.println();
				
				Scanner sc=new Scanner(System.in);
				
				System.out.print(" INGRESE NOMBRE: ");
				String n = sc.nextLine();
			
			System.out.println("INGRESE PRODUCTO [TB, LT, MN, IM ] :");
			String p=sc.nextLine();
				
				System.out.print("INGRESE CANTIDAD: ");
				int c=sc.nextInt();
				
				System.out.print("INGRESE FORMA DE PAGO [C1, C2]: ");
				String fp= sc.next();
				
				
				
				int m=0;
				 switch (p){
		         case "TB": 
		        	 p="Tablet";
		      	   m=350;
		            break;
		         case "LT":
		        	 p="Laptop";
		        	 m=2300;
		        	 break;
		         case "MN":
		        	 p="Monitor";
		        	 m=850;
		        	 break; 
		        	 case "IM":
			        	 p="Impresora";
			        	 m=680;
			        	 break;
			        	 default:
			        	m=0; 	
				 }  
				 float total= c*m; 
		        	float desc=(float)0 ;
		        	switch (fp){
		      	case "C1":
		      		fp="Pago al contado";
		      		desc=(float)0.05;
		      		break;
		      	case "C2":
		      		fp="Pago a credito";
		      		desc=(float)0.12;
		      	break;
		      	default:
		      		fp="no existe ";        		
		}
		      	 
		      	
		    System.out.println("RESULTADOS");
		    System.out.println("--------------------------");
		    System.out.println("CLIENTE: "+ n);
		    System.out.println("PRODUCTO: "+p);
		    System.out.println("PRECIO: "+m);
		    System.out.println("CANTIDAD: "+c);
		    System.out.println("FORMA DE PAGO: "+fp);
		    System.out.println("DESCUENTO: "+desc);
		     System.out.println("TOTAL A PAGAR:"+df.format(total) );
				 }                    
		
	}


