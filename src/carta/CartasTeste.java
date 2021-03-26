package carta;

public class CartasTeste {
    public static void main(String[] args) {
        Baralho b = new Baralho();

        System.out.println("Embaralhando o monte!");
        b.embaralhar();

        boolean baralhonaovazio = true;

        while(baralhonaovazio) {
            try {
                System.out.println("Distribuindo" + b.distribuir());
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Nenhuma carta no baralho!");
                baralhonaovazio = false;
            }
        }
    }
}
