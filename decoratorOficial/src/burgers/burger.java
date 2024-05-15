package burgers;

public abstract class burger {
    String ingredientes;

    // Criando a variavel que ira mudar dependendo da classe
    public String getIngredientes(){
        return ingredientes;
    }

    // Criando a segunda variavel que muda dependendo da classe
    public abstract double preco();
}