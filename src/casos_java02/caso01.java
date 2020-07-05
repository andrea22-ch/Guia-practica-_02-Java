package casos_java02;

      import java.util.Scanner;

  

     public class caso01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edad=0;
		System.out.println("ingrese su edad: ");
         edad=sc.nextInt();
      if (edad>=18) 
    	  System.out.println("mayor de edad");
      else 
    	  System.out.println("menor de edad:");
	}

}
