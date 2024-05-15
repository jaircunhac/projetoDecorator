package extras;

import burgers.burger;

public class carneExtras extends burger{
    private burger burger;

    public carneExtras(final burger burger){
        this.burger = burger;
    }

    @Override
    public String getIngredientes() {
        return this.burger.getIngredientes() + ", +Carne";
    }

    @Override
    public double preco() {
        return this.burger.preco() + 2.99;
    }
}