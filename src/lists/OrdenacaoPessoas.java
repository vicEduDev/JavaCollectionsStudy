package lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }
    //Usando Comparable
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPessoasOrdenada = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            Collections.sort(listaPessoasOrdenada);
            return listaPessoasOrdenada;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }
    //Usando Comparator
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoasOrdenada = new ArrayList<>(listaPessoas);
        if(!listaPessoas.isEmpty()){
            Collections.sort(listaPessoasOrdenada, new ComparatorPorAltura());
            return listaPessoasOrdenada;
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoPessoas o = new OrdenacaoPessoas();
        o.adicionarPessoa("Dayna", 19, 1.67);
        o.adicionarPessoa("Victor", 21, 1.75);
        System.out.println(o.listaPessoas);
    }
}
