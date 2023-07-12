package java_vjezbanje;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	
	
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
		
		//Kreiranje i punjenje brojevnog niza
		for(int i=0;i<glavniNiz.length;i++) {
			
		}
		
		
		
		
		
		System.out.println(Arrays.toString(glavniNiz));
		
		
		
	}

}
