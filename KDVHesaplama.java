package Pratik1;

import java.util.Scanner;

public class KDVHesaplama {
	public static void main(String[] args) {
		double KDV, tutarKDV;
		Scanner in = new Scanner(System.in);
		System.out.println("Paranýzýn tutarýný girin: ");
		double tutar = in.nextDouble();
		in.close();
		if(tutar<0) {
			System.out.println("Uygun bir tutar girmediniz.");
			return;
		}
		else if(0<=tutar && tutar<=1000) {
			KDV = (tutar*18)/100;
			tutarKDV = tutar+KDV;
		}
		else {
			KDV = (tutar*8)/100;
			tutarKDV = tutar+KDV;
		}
		System.out.println("KDV'siz Fiyat = "+ tutar
				+ "\n"
				+ "KDV'li Fiyat = " + tutarKDV
				+ "\n"
				+ "KDV tutarý = " + KDV);
	}
}
