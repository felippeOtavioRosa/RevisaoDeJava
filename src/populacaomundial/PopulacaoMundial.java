package populacaomundial;

public class PopulacaoMundial {
    public static void main(String[] args) {
        //args recebe os argumentos passados na linha de comando
        double n1 = Double.parseDouble(args[0]); // converte string para inteiro
        double n2 = Double.parseDouble(args[1]);

        double pop = n1 * Math.pow(1.010105,n2);

        System.out.printf("%.2f Pessoas", pop);

    }
}
