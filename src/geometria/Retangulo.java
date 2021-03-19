package geometria;

public class Retangulo extends Forma{
    protected double base;
    protected double altura;

      public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(String cor, boolean preenchido, double base, double altura) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea(){
          return base*altura;
    }

    public double getPerimetro(){
          return 2*base+2*altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "cor='" + cor + '\'' +
                ", preenchido=" + preenchido +
                ", getArea=" + getArea +
                ", getPerimetro=" + getPerimetro +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
