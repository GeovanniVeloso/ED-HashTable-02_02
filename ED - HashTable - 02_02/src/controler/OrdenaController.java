package controler;

import br.edu.fatec.zl.Lista;

public class OrdenaController {

	Lista<Integer>[] hashTable = new Lista[2];
	
	public OrdenaController() {
		int tamanho = hashTable.length;
		for (int i = 0; i < tamanho; i++) {
			hashTable[i] = new Lista<Integer>();
		}
	}
	
	public void binController(int[]vet) {
		for(int i = 0; i<10; i++) {
			int hash = hash(vet[i]);
			Lista<Integer> linha = hashTable[hash];
			if(linha.isEmpty()) {
				linha.addFirst(vet[i]);
			}else {
				try {
					linha.addLast(vet[i]);
				} catch (Exception e) {
					System.err.println(e + " 26");
				}
			}
		}
		
		for(int i = 0; i < 2; i++) {
			Lista<Integer> linha = hashTable[i];
			int size = linha.size();
			System.out.println("Existem "+size+" na linha "+i+" da hash. \nEles são:");
			for(int c = 0; c < size; c++) {
				try {
					System.out.println("#"+linha.get(c));
				} catch (Exception e) {
					System.err.println(e + "39");
				}
			}
		}
		
	}
	
	private int hash(int n) {
		int hash = n%2;
		return hash;
	}

}
