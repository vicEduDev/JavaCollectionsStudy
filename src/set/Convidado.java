package set;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigo){
        this.nome = nome;
        this.codigoConvite = codigo;
    }


    public String getNome() {
        return this.nome;
    }

    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", codigoConvite='" + getCodigoConvite() + "'" +
            "}";
    }
}
