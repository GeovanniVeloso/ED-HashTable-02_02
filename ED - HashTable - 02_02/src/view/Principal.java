package view;

import controler.OrdenaController;

public class Principal {

	public static void main(String[] args) {
		
		OrdenaController oc = new OrdenaController();
		
		int [] vet = new int[10];
		for(int i = 0; i<10; i++) {
			vet[i] = (int)(Math.random()*9999)+1;
		}
		
		oc.binController(vet);

	}

}
