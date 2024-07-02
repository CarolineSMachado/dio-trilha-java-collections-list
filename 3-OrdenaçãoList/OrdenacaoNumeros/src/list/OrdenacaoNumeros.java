package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {
	private List<Integer> numeroList;

	public OrdenacaoNumeros() {
		this.numeroList = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		numeroList.add(numero);
	}
	
	public List<Integer> ordenarAscendente(){
		List<Integer> numerosAscendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty()) {
			Collections.sort(numerosAscendente);
		}
		return numerosAscendente;
	}
	
	public List<Integer> ordenarDescendente(){
		List<Integer> numerosDescendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty()) {
			numerosDescendente.sort(Collections.reverseOrder());
		}
		return numerosDescendente;
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
	
		ordenacaoNumeros.adicionarNumero(10);
		ordenacaoNumeros.adicionarNumero(5);
		ordenacaoNumeros.adicionarNumero(15);
		ordenacaoNumeros.adicionarNumero(3);
		ordenacaoNumeros.adicionarNumero(-7);
		ordenacaoNumeros.adicionarNumero(0);
		System.out.println(ordenacaoNumeros.numeroList);
		
		System.out.println(ordenacaoNumeros.ordenarAscendente());
		
		System.out.println(ordenacaoNumeros.ordenarDescendente());
		
	}
}

