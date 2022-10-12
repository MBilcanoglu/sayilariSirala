package sayilariSirala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi1,sayi2,sayi3;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("1. Sayıyı Giriniz: ");
		sayi1=scan.nextInt();
		
		System.out.print("2. Sayıyı Giriniz: ");
		sayi2=scan.nextInt();
		
		System.out.print("3. Sayıyı Giriniz: ");
		sayi3=scan.nextInt();
		
		if((sayi1>sayi2) && (sayi1>sayi3)) {
			System.out.print(sayi1+" > ");
			if(sayi2>sayi3) {
				System.out.print(sayi2+" > "+sayi3);
			}else {
				System.out.print(sayi3+" > "+sayi2);
			}
		}
		else {
			if(sayi2>sayi3) {
				System.out.print(sayi2+" > ");
				if(sayi3>sayi1) System.out.print(sayi3+ " > "+sayi1);
				else System.out.print(sayi1+" > "+sayi3);
			}
			else {
				System.out.print(sayi3+" > ");
				if(sayi2>sayi1) System.out.print(sayi2+" > "+sayi1);
				else System.out.print(sayi1+ " > "+sayi2);
			}			
		}
		
	}

}
