package pato;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Pato misterpato= new Pato(0);
		int opcion=0;
		int pasos=0;
		Scanner entrada=new Scanner(System.in);
		do
		{
			System.out.println("Men�");
			System.out.println("____________________________");
			System.out.println("1. Hacer que el pato se mueva hacia adelante");
			System.out.println("2. Hacer que el pato se mueva hacia atr�s");
			System.out.println("3. Preguntar al pato donde est�");
			System.out.println("4. Salir");
			System.out.println("____________________________");
			System.out.println("Inserte la opci�n");
			opcion=entrada.nextInt();
			switch (opcion)
			{
				case 1:
					System.out.println("�Cuantos pasos se mover� el pato?");
					pasos=entrada.nextInt();
					misterpato.andarAdelante(pasos);
					break;
				case 2:
					System.out.println("�Cuantos pasos se mover� el pato?");
					pasos=entrada.nextInt();
					misterpato.andarAdelante(pasos);
					break;
				case 3:
					System.out.println("Estoy en la posicion: "+misterpato.dimePosicion());
					break;
			}
			
		}while(opcion!=4);
		entrada.close();
	}


	
}
