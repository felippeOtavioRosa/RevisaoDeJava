package calculapi;

import static java.lang.Math.*;

public class CalculaPI {
    public static  void main(String[] args){
        //args recebe os argumentos passados na linha de comando
        int n1 = Integer.parseInt(args[0]); // converte string para inteiro
        int n2 = 1;
        double x = 0;
        double x1 = 0;

        for (double i = 1; i <=n1 ; i+=2) {
            x = (n2 / i);
            n2 *= -1;
            double soma = x1+x;
            x1 = soma;
        }
        double pi = 4*x1;
        double erro = 1- (pi / Math.PI);
        System.out.println("O valor de pi é: "+pi);
        System.out.println("Erro:" + erro);
    }
}
