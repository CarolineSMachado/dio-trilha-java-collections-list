package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livroPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livroPorAutor.add(l);
				}
			}
		}
		return livroPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livroPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livroPorIntervaloAnos.add(l);
				}
			}
		}
		return livroPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if(!livroList.isEmpty()) {
			for(Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("O Hobbit", "J.R.R.Tolkien", 1937);
		catalogoLivros.adicionarLivro("A vida Intelectual", "Pe. Sertillanges", 1921);
		catalogoLivros.adicionarLivro("O Milagre da Igreja", "Pe. Sertillanges", 1949);
		catalogoLivros.adicionarLivro("Demagistro", "Santo Agostinho", 390);
		catalogoLivros.adicionarLivro("Demagistro", "São Tomás de Aquino", 1270);
	
		System.out.println(catalogoLivros.pesquisarPorAutor("J.R.R.Tolkien"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(300, 1300));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Demagistro"));
	}
}
