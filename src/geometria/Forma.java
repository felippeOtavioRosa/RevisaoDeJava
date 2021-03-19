package geometria;

public class Forma {
    protected String cor;
    protected  boolean preenchido;

    public Forma() {
        cor = "vermelho";
        preenchido = true;
    }

    public Forma(String cor, boolean preenchido) {
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreenchido(boolean preenchido) {
        this.preenchido = preenchido;
    }

    public boolean isPreenchido() {
        return preenchido;
    }

    public double getArea;
    public double getPerimetro;

    @Override
    public String toString() {
        return "Forma{" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                '}';
    }
}
