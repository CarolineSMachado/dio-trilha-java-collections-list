package list;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	private List<Integer> inteiroList;

	public SomaNumeros() {
		this.inteiroList = new ArrayList<>();;
	}
	
	public void adicionarNumero(int numero) {
		inteiroList.add((numero));
	}
	
	public int calcularSoma(){
		int resultadoSoma = 0;
		for(Integer i : inteiroList) {
			resultadoSoma += i;
		}
		return resultadoSoma;
	}
	
	public int encontrarMaiorNumero(){
		int maiorNumero = Integer.MIN_VALUE;
		if(!inteiroList.isEmpty()) {
			for(Integer i : inteiroList) {
				if(maiorNumero <= i) {
					maiorNumero = i;
				}
			}
		}
		return maiorNumero;
	}
	
	public int encontrarMenorNumero(){
		int menorNumero = Integer.MAX_VALUE;
		if(!inteiroList.isEmpty()) {
			for(Integer i : inteiroList) {
				if(menorNumero >= i) {
					menorNumero = i;
				}
			}
		}
		return menorNumero;
	}
	
	public void exibirNumeros() {
		System.out.println(inteiroList);
	}
	
	
	public static void main(String[] args) {
		SomaNumeros somaNumeros = new SomaNumeros();
		
		somaNumeros.adicionarNumero(5);
		somaNumeros.adicionarNumero(10);
		somaNumeros.adicionarNumero(2);
		somaNumeros.adicionarNumero(1);
		
		somaNumeros.exibirNumeros();
		
		System.out.println("O resultado da soma dos números foi: " +somaNumeros.calcularSoma());
		System.out.println("O maior número foi: " + somaNumeros.encontrarMaiorNumero());
		System.out.println("O menor número foi: " + somaNumeros.encontrarMenorNumero());
	}

}
