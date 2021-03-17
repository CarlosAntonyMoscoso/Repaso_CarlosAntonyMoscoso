package Pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		//hacer una suma y resta
		System.out.println("Introduce dos numero para la operacion");
		int a = 0, b = 0;
		a = ent.nextInt();
		b= ent.nextInt();
		int total = a+b;
		
		
		System.out.println(total);
		System.out.println("La resta de "+ a +" - " + b +" = "+ (a-b));

	}

}
