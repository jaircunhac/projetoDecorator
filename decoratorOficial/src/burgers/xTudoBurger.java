package burgers;

public class xTudoBurger extends burger{
    public xTudoBurger(){
        ingredientes = "Pão, Carne, Queijo, Tomate, Alface, Presunto, Salsicha, Calabresa, Frango Desfiado, Ovo, Bacon";
    }

    @Override
    public double preco() {
        return 15.99;
    }
}