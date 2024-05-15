package extras;

import burgers.burger;

public class baconExtras extends burger{
    private burger burger;

    public baconExtras(final burger burger){
        this.burger = burger;
    }

    // Adicionando aos Ingredientes de qualquer burger o Bacon
    @Override
    public String getIngredientes() {
        return this.burger.getIngredientes() + ", +Bacon";
    }
    // Somando o preco da adicao do Bacon com o preco de qualquer burger
    @Override
    public double preco() {
        return this.burger.preco() + 2.99;
    }
}
