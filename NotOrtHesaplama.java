package Pratik1;

import java.util.Scanner;

public class NotOrtHesaplama {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Matematik s�nav puan�: ");
		int mat = in.nextInt();
		System.out.println("Fizik s�nav puan�: ");
		int fiz = in.nextInt();
		System.out.println("Kimya s�nav puan�: ");
		int kim = in.nextInt();
		System.out.println("Tarih s�nav puan�: ");
		int tar = in.nextInt();
		System.out.println("T�rk�e s�nav puan�: ");
		int turk = in.nextInt();
		System.out.println("M�zik s�nav puan�: ");
		int muz = in.nextInt();
		
		in.close();
		
		int top = mat+fiz+kim+tar+turk+muz;
		float ort = top/6;
		
		String durum = (ort>=50) ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
		
		System.out.println("Not ortalamas�: "+ ort);
		System.out.println(durum);
		
	}
}
