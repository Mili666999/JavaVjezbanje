package java_vjezbanje;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {
	
	public static void main(String[] args) {
		
		
		boolean dev = false;
		
		int red = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int stup = dev ? 10 : Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		
		int[][] matrica = new int[red][stup];
		int b = 1;
		

		//Prvi krug

//		matrica[red-1][stup-1] =1;
//		matrica[red-1][stup-2] =2;
//		matrica[red-1][stup-3] =3;
//		matrica[red-1][stup-4] =4;
//		matrica[red-1][stup-5] =5;
		for (int i=1;i<=stup;i++) {
			matrica[red-1][stup-i] = b++;
		}
//		matrica[red-2][0] = b++;
//		matrica[red-3][0] = b++;
//		matrica[red-4][0] = b++;
//		matrica[red-5][0] = b++;
		for (int i=2;i<=red;i++) {
			matrica[red-i][0] = b++;
		}
//		matrica[0][1] = b++;
//		matrica[0][2] = b++;
//		matrica[0][3] = b++;
//		matrica[0][4] = b++;
		for (int i=1;i<stup;i++) {
			matrica[0][i] = b++;
		}
//		matrica[1][stup-1] = b++;
//		matrica[2][stup-1] = b++;
//		matrica[3][stup-1] = b++;
		for(int i=1;i<red-1;i++) {
			matrica[i][stup-1] = b++;
		}
		
		
		//Drugi krug
		
//		matrica[red-2][stup-2] = b++;
//		matrica[red-2][stup-3] = b++;
//		matrica[red-2][stup-4] = b++;
		for(int i=2;i<stup;i++) {
			if(red==2 || stup==2) {
				break;
			}
			matrica[red-2][stup-i] = b++;
		}
//		matrica[red-3][1] = b++;
//		matrica[red-4][1] = b++;
//		matrica[red-5][1] = b++;
//		matrica[red-6][1] = b++;
//		matrica[red-7][1] = b++;
//		matrica[red-8][1] = b++;
//		matrica[red-9][1] = b++;
		for(int i=3;i<red;i++) {
			if(red==2 || stup==2) {
				break;
			}
			matrica[red-i][1] = b++;
		}
//		matrica[1][stup-8] = b++;
//		matrica[1][stup-7] = b++;
//		matrica[1][stup-6] = b++;
//		matrica[1][stup-5] = b++;
//		matrica[1][stup-4] = b++;
//		matrica[1][stup-3] = b++;
//		matrica[1][stup-2] = b++;
		for(int i=2;i<stup-1;i++) {
			if(red==2 || stup==2) {
				break;
			}	
			matrica[1][i] = b++;
		}
//		matrica[red-8][stup-2] = b++;
//		matrica[red-7][stup-2] = b++;
//		matrica[red-6][stup-2] = b++;
//		matrica[red-5][stup-2] = b++;
//		matrica[red-4][stup-2] = b++;
//		matrica[red-3][stup-2] = b++;
		for (int i=2;i<red-2;i++) {
			if(red==2 || stup==2 || stup==3) {
				break;
			}
			matrica[i][stup-2] = b++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(int i=0;i<red;i++) {
			for (int j=0;j<stup;j++) {
				System.out.print(matrica[i][j] + "\t");
			}System.out.println();
		}
		
	}

}
