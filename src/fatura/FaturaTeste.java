package fatura;

public class FaturaTeste {
    public static void main(String[] args){
        String cod = args[0];
        String desc = args[1];
        int qtd = Integer.parseInt(args[2]);
        double price = Double.parseDouble(args[3]);

        Fatura f = new  Fatura(cod, desc, qtd, price);

        System.out.println("Código: "+f.getCod());
        System.out.println("Descrição: "+f.getDesc());
        System.out.println("Quantidade: "+f.getQtd());
        System.out.printf("Preço: R$ %.2f\n", f.getPrice());
        System.out.printf("Total da Fatura: R$ %.2f\n", f.totalFaturado());
    }
}
