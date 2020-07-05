package casos_java02;
import java.util.Scanner;
public class caso11 {

	public static void main(String[] args) {
		
		//
		Scanner sc=new Scanner(System.in);
		String msj= " ";
		
		System.out.print("INGRESE UN NUMERO DE [1-7]: ");
		int nd = sc.nextInt();
		switch (nd){
		case 1:
			msj="Domingo";
			break;
		case 2:
			msj="Lunes";
			break;
		case 3:
			msj="Martes";
			break;
		case 4:
			msj="Miercoles";
			break;
		case 5:
			msj="Jueves";
			break;
		case 6:
			msj="Viernes";
		case 7:
			msj="Sabado";
			break;
		default:
			msj="Desconocido";}
		
	System.out.println("dia de la semana: "+msj);
		
		

	}

}
