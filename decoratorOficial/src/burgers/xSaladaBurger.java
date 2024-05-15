package burgers;

public class xSaladaBurger extends burger{
    public xSaladaBurger(){
        ingredientes = "Pão, Carne, Queijo, Tomate, Alface, Cebola";
    }

    @Override
    public double preco() {
        return 7.99;
    }
}