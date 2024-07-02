package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> itemList;

	public CarrinhoDeCompras() {
		this.itemList = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		itemList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itemParaRemover = new ArrayList<>();
		for(Item i : itemList) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itemParaRemover.add(i);
			}
		}
		itemList.removeAll(itemParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0d;
		if(!itemList.isEmpty()) {
			for(Item i : itemList) {
				double valorItem = i.getPreco() * i.getQuantidade();
				valorTotal+=valorItem;
			}
		}
		return valorTotal;
	}
	
	public void exibirItens(){
		System.out.println(itemList);
	}
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		
		carrinhoDeCompras.adicionarItem("Luminária", 30, 5);
		carrinhoDeCompras.adicionarItem("Cadeira de Balanço", 100, 2);
		carrinhoDeCompras.adicionarItem("Chuveiro", 15, 10);
		carrinhoDeCompras.adicionarItem("Carro", 32000, 1);
		
		carrinhoDeCompras.exibirItens();
		carrinhoDeCompras.removerItem("Carro");
		carrinhoDeCompras.exibirItens();
		
		System.out.println("O valor total da compra é de " + carrinhoDeCompras.calcularValorTotal()+" reais.");
	}

}
