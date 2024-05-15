package burgers;

public class xBaconBurger extends burger{
    // Alterando o valor da variavel ingredientes apenas para o XBaconBurger
    public xBaconBurger(){
        ingredientes = "Pão, Carne, Queijo Mussarela, Bacon";
    }

    // Alterando o valor da variavel preco para apenas o XBaconBurger
    @Override
    public double preco() {
        return 9.99;
    }
}