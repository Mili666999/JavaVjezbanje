package java_vjezbanje;

import javax.swing.JOptionPane;

public class LjubavniKalkulator {
	
	
	public static void main(String[] args) {
		
		boolean dev = false;
		
		String prvoIme = dev ? "Ivona" : JOptionPane.showInputDialog("Unesi prvo ime");
		String drugoIme = dev ? "Antonio" : JOptionPane.showInputDialog("Unesi drugo ime");
		
		char[] prviNiz = prvoIme.toCharArray();
		char[] drugiNiz = drugoIme.toCharArray();
		
		for(char i : prviNiz) {
			System.out.print(i);
		}
		for(char j : drugiNiz) {
			System.out.print(j);
		}
	}

}
