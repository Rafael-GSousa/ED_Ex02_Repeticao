package controller;

public class RepeticaoController {
	
	public RepeticaoController() {
		super();
	}
	
	public int repeticao(int val1, int val2) {
		
		if(val1 == 0) {
			return 0;
		}else {
		int div = val1 / 10;
		int cont = 0;
		
		if(val1 % 10 == val2) {
			cont ++;
		}
		
		return cont + repeticao(div, val2);
		}
	}
}