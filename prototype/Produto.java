package padroescriacao_exercicios.prototype;

import padroescriacao.prototype.Aluno;
import padroescriacao.prototype.Endereco;

public class Produto implements Cloneable{

    private int codigo;
    private String tipo;
    private Especificacoes especificacoes;

    public Produto(int codigo, String tipo, Especificacoes especificacoes) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.especificacoes = especificacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Especificacoes getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(Especificacoes especificacoes) {
        this.especificacoes = especificacoes;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException {
        Produto produtoClone = (Produto) super.clone();
        produtoClone.especificacoes = (Especificacoes) produtoClone.especificacoes.clone();
        return produtoClone;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", tipo='" + tipo + '\'' +
                ", especificacoes='" + especificacoes + '\'' +
                '}';
    }
}
