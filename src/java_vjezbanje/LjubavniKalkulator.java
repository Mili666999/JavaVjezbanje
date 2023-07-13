package java_vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	
	
	static int[] zbrojNiza(int [] brojevniNiz) {
		//Provjera je li broj elemenata u brojevnom nizu paran
		//Ako nije, dodajem 0 na kraj niza
		int parniBrojevniNiz[] = new int[brojevniNiz.length+1];
		if(brojevniNiz.length%2!=0) {
			for(int i=0;i<brojevniNiz.length;i++) {
				parniBrojevniNiz[i] = brojevniNiz[i];
			}
			brojevniNiz = parniBrojevniNiz.clone();
		}
		return brojevniNiz;
	}
	
	
	public static void main(String[] args) {
		
		boolean dev = true;
		
		//Unos imena kao string
		String prvoIme = dev ? "Ana" : JOptionPane.showInputDialog("Unesi prvo ime");
		String drugoIme = dev ? "Milovan" : JOptionPane.showInputDialog("Unesi drugo ime");
		
		//Prebacivanje svih slova u mala slova i izbacivanje eventualnih razmaka
		prvoIme = prvoIme.toLowerCase().replaceAll("\\s", "").replace("-", "");
		drugoIme = drugoIme.toLowerCase().replaceAll("\\s", "").replace("-", "");
		
		//Prebacivanje imena iz stringa u niz
		char[] prviNiz = prvoIme.toCharArray();
		char[] drugiNiz = drugoIme.toCharArray();
		
		//Spajanje dva niza u jedan
		int dpn = prviNiz.length;
		int ddn = drugiNiz.length;
		char[] glavniNiz = new char[dpn + ddn];
		System.arraycopy(prviNiz, 0, glavniNiz, 0, dpn);
		System.arraycopy(drugiNiz, 0, glavniNiz, dpn, ddn);
		
		//Sortiranje niza abecedno (zbog unosa dva imena različitim redoslijedom)
		Arrays.sort(glavniNiz);
		
		//Kopiranje glavnog niza za usporedbu
		char pomocniNiz[] = glavniNiz.clone();
		
		//Kreiranje i punjenje brojevnog niza
		int brojevniNiz[] = new int[glavniNiz.length];
		for(int i=0;i<glavniNiz.length;i++) {
			int x = 0;
			for(int j=0;j<pomocniNiz.length;j++) {
				if(glavniNiz[i]==pomocniNiz[j]) {
					x++;
					brojevniNiz[i]=x;
				}
			}
		}
		
		
		
		
		System.out.println(Arrays.toString(glavniNiz));
		System.out.println(Arrays.toString(pomocniNiz));
		System.out.println(Arrays.toString(brojevniNiz));	
	}

}
