package controller;

public class ThreadsVetor extends Thread {
	private int i;
	private int []vet;
	
	public ThreadsVetor (int []vet, int i) {
	  this.i = i;
	  this.vet = vet;
	}
	
  public void run() {
    double time;
    
	  if (( i % 2) == 0) {
		  double starttime = System.nanoTime();

		for (int i = 0; i < vet.length; i++);
		  time = (System.nanoTime() - starttime) / Math.pow(10, 9);	
		  System.out.printf("Numero Par - Tempo: %f segundos.\n" , time);
		  
		  
		  
	  }
	  
	  
	  else {
		  double starttime = System.nanoTime();

	for (int i : vet);
		  time = (System.nanoTime() - starttime) / Math.pow(10, 9);
		  
		  System.out.printf("Numero Impar - Tempo: %f segundos.\n" , time);
		  
		
		  }
  }

}
