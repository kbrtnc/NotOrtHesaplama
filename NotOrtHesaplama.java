package Pratik1;

import java.util.Scanner;

public class NotOrtHesaplama {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Matematik sýnav puaný: ");
		int mat = in.nextInt();
		System.out.println("Fizik sýnav puaný: ");
		int fiz = in.nextInt();
		System.out.println("Kimya sýnav puaný: ");
		int kim = in.nextInt();
		System.out.println("Tarih sýnav puaný: ");
		int tar = in.nextInt();
		System.out.println("Türkçe sýnav puaný: ");
		int turk = in.nextInt();
		System.out.println("Müzik sýnav puaný: ");
		int muz = in.nextInt();
		
		in.close();
		
		int top = mat+fiz+kim+tar+turk+muz;
		float ort = top/6;
		
		String durum = (ort>=50) ? "Sýnýfý Geçti" : "Sýnýfta Kaldý";
		
		System.out.println("Not ortalamasý: "+ ort);
		System.out.println(durum);
		
	}
}
