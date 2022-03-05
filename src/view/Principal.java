package view;

import controller.ThreadsVetor;

public class Principal {
	public static void main (String[]args) {
		int vet[] = new int[1000];
	
		 for(int i = 0; i < 1000; i++) {	
			vet [i] = (int) ((Math.random()*100)+1);
			// System.out.print(vet[i]+ " ");
			 new ThreadsVetor(vet, 1).start();

		 	 new ThreadsVetor(vet, 2).start();
		 }			 

	 	
}
 
	}

