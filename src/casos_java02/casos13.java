package casos_java02;
import java.util.Scanner;
public class casos13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String toper= "";
		
		System.out.print("INGRESE UN NUMERO : ");
		int n1 = sc.nextInt();
		System.out.print("INGRESE OTRO NUMERO : ");
		int n2 = sc.nextInt();
		System.out.print("INGRESE OPERACION [1-7]: ");
		
		int oper= sc.nextInt();
           switch (oper){
           case 1:
        	   toper="suma";
        	   oper=n1+n2;
        	   break;
           case 2:
        	   toper="resta";
        	   oper=n1-n2;
        	   break;
           case 3:
        	   toper="Division";
        		   if (n2>0)
        			   oper= n1/n2;
        			   else
        				   oper=0;
        		   break;
        case 5:
        	   toper="Resto entero";
        	   oper=n1 % n2 ;
        	   break;
           case 6:
        	   toper="Promedio";
        	   oper=(n1+n2)/2;
        	   break;
        	   default:
        		   oper=0;
}
           System.out.println("RESULTADOS: ");
           System.out.println("------------------------------------");
           System.out.println("NUMERO 1: "+n1);
           System.out.println("NUMERO 2: "+n2);
           System.out.println("OPERCION: "+toper);
           System.out.println("RESULTADOS: "+oper);
	}
}
