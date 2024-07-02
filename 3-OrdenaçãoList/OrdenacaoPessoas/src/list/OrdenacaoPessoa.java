package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;

	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
		Collections.sort(pessoaPorIdade);
		return pessoaPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> pessoaPorAltura = new ArrayList(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());;
		return pessoaPorAltura;
	}
	
	
	class ComparatorPorAltura implements Comparator<Pessoa>{
		public int compare(Pessoa p1, Pessoa p2) {
			return Double.compare(p1.getAltura(), p2.getAltura());
		}
	}
	
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		
		ordenacaoPessoa.adicionarPessoa("Caroline", 24, 1.61);
		ordenacaoPessoa.adicionarPessoa("Antonio", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Ester", 17, 1.65);
		ordenacaoPessoa.adicionarPessoa("Joana", 12, 1.45);
		ordenacaoPessoa.adicionarPessoa("Miguel", 45, 1.78);
		
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		System.out.println(ordenacaoPessoa.ordenarPorAltura());
		System.out.println(ordenacaoPessoa.pessoaList);
	}
}
