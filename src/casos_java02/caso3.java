package casos_java02;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		// Lea dos números y muestre un mensaje si son iguales o cuál es el mayor de ambos. 
				Scanner sc=new Scanner(System.in);
				String msj= " ";
				System.out.println("INGRESE UN NUMERO:");
				int num = sc.nextInt();
				System.out.println("INGRESE OTRO NUMERO:");
				int num2=sc.nextInt();
				if (num==num2)
					msj="numero1 es igual a numero2 ";
				else
					if (num>num2)
						msj="numero1 es mayor a numero 2";
					else 
						msj="numero2 es mayor que numero 1";
				System.out.println("resultados:"+ msj);

	}

}
