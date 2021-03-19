package geometria;

public class Circulo extends Forma {

    protected double raio;

    public Circulo(){
        raio = 1.0;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }


    public Circulo(String cor, boolean preenchido, double raio) {
        super(cor, preenchido);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        return Math.PI * raio*raio;
    }

    public double getPerimetro(){
        return 2*Math.PI*raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ", getArea=" + getArea +
                ", getPerimetro=" + getPerimetro +
                '}';
    }
}
