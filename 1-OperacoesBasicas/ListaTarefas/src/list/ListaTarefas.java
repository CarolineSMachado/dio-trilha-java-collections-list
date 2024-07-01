package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}	
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());
		listaTarefas.adicionarTarefa("Fazer 6 atividades de Collection");
		listaTarefas.obterDescricoesTarefas();
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.removerTarefa("Fazer 6 atividades de Collection");
		System.out.println("O número total de elementos da lista é: " + listaTarefas.obterNumeroTotalTarefas());

	}
}
