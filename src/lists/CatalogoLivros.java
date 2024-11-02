package lists;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public List<Livro> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaBuscada = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getAutor().equals(autor)){
                    listaBuscada.add(l);
                }
            }
            return listaBuscada;
        } else{
            throw new RuntimeException("A lista está vazia!!");
        }        
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaBuscada = new ArrayList<>();
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                    listaBuscada.add(l);
                }
            }
            return listaBuscada;
        } else{
            throw new RuntimeException("A lista está vazia!!");
        }
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroBuscado = null;
        if(!listaLivros.isEmpty()){
            for(Livro l: listaLivros){
                if(l.getAutor().equalsIgnoreCase(titulo)){
                    livroBuscado = l;
                   break;
                }
            }
            return livroBuscado;
        } else{
            throw new RuntimeException("A lista está vazia!!");
        }
    }
}
