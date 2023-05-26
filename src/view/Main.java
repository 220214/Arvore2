package view;

import br.mari.arvoreint.Arvore;

public class Main {

	public static void main(String[] args) {
		Arvore ar = new Arvore ();
		int []vet = {12,4,16,2,8,6};
		for(int i:vet) {
			ar.insert(i);
		}
		try {
			ar.search(6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
