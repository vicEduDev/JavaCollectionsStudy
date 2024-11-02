package lists;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //Atributos
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    /*public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("Número total de tarefas na lista é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("Número total de tarefas na lista é: "+listaTarefa.obterNumeroTotalTarefas());
    }*/
}
