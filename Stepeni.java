package proekt_13;
import java.util.Scanner;

public class Stepeni {

	public static void main(String[] args) {
		int x,b;
		Scanner tastatura=new Scanner(System.in);
		System.out.println ("Programot presmetuva Celzjusuovi stepeni vo Ferenhajtovi");
		System.out.println ("Vnesi ja ja vrednosta za Celzjusuovi stepeni");
		x= tastatura.nextInt();
		b=9*x/5+32;
		System.out.println ("Celzjusuovi stepeni +"+b);
		
		
	

	}

}
