package padroescriacao_exercicios.prototype;

public class Especificacoes implements Cloneable{

    private String marca;
    private String cor;
    private String modelo;
    private float valor;

    public Especificacoes(String marca, String cor, String modelo, float valor) {
        super();
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.valor=valor;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Especificacoes{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
