package fatura;

public class Fatura {
    private String cod;
    private String desc;
    private int qtd;
    private double price;

    public Fatura(String cod, String desc, int qtd, double price) {
        this.cod = cod;
        this.desc = desc;
        this.qtd = qtd;
        this.price = price;
    }

    public String getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }

    public int getQtd() {
        return qtd;
    }

    public double getPrice() {
        return price;
    }

    public double totalFaturado () {
        return price * qtd;
    }
}
