package casos_java02;
import java.util.Scanner;

public class CASO12 {

	public static void main(String[] args) {
		//Caso 12: Lea los siguientes datos: empleado, nivel (1-4) y 
		//sueldo, se pide calcular:  % Incremento: Según el nivel será: o 1,
		//defina 4.5%. o 2, 
		//defina 6.0%. o 3, defina 8.5%. o 4, defina 11.0%.
		//o Otro valor, será 0.  Nuevo Sueldo: 
		//Aumente el sueldo en el % Incremento hallado
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese nombre del empleado:");
		String nom=sc.nextLine();
		System.out.println("ingrese sueldo");
float sueldo=sc.nextFloat();
System.out.println("ingrese nivel [1-4]");
int nivel= sc.nextInt();
float incremento=0;

switch (nivel){
case 1:incremento=0.045f;break;
case 2: incremento=0.06f;break;
case 3:incremento=0.085f;break;
case 4:incremento=0.11f;break;
default :
incremento= 0;
	
}
System.out.println("RESULTADOS:");
System.out.println("----------------------------");
System.out.println("INCREMENTO ES:" + incremento);
System.out.println("NUEVO SUELDO:"+(sueldo+incremento*sueldo));
	}

}
