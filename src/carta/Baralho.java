package carta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta>monte; //atributo de instância(monte) que usa um tipo que implementa a interface List
    private int cartaAtual; //atributo de instância (cartaAtual) do tipo Integer que representa um número sequencial (0 a 51)
    private static final int TOTAL_DE_CARTAS = 52; //constante (TOTAL_DE_CARTAS) para indicar o número de Cartas total no baralho
    private static final String[] NAIPES={ //constante (NAIPES) que contém as Strings “Paus”, “Ouros”, “Copas” e “Espadas”.
        "Paus", "Ouro", "Copas", "Espadas"
    };
    private static final String[] VALORES={ //constante (VALORES) que contém as Strings de "Ás" a "Rei"
        "Ás", "Dois", "Três", "Quatro", "Cinco","Seis","Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"
    };

    public Baralho() {
        //instanciado o monte com tamanho TOTAL_DE_CARTAS.
        monte = new ArrayList<>(TOTAL_DE_CARTAS);

        for (String naipe : NAIPES){
            for (String valor: VALORES){
                Carta c = new Carta(naipe, valor);
                monte.add(c);
            }
        }
    }

    public void embaralhar(){
        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    public Carta distribuir() {
        if (monte.isEmpty()) {
            throw new RuntimeException("O baralho está vazio.");
        }

        return monte.get(cartaAtual++);
    }



}
