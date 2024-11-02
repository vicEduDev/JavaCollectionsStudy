package lists;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras{
    //Atributos
    public List<Item> listaItens;
    //Construtor
    public CarrinhoDeCompras(){
        this.listaItens = new ArrayList();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensARemover = new ArrayList<>();
        for(Item i: listaItens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensARemover.add(i);
            }
        }
        listaItens.removeAll(itensARemover);
    }

    public double calcularValorTotal(){
        double valor = 0.0;
        for(Item i: listaItens){
            valor = valor + (i.getPreco() * i.getQuantidade());
        }
        return valor;
    }

    public void exibirItens(){
        System.out.println(listaItens.toString());
    }

    /*public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("sabonete", 5, 3);
        carrinho.adicionarItem("macarrão", 25, 2);
        System.out.println("O valor total é de R$"+carrinho.calcularValorTotal());
        carrinho.exibirItens();
    }*/

}