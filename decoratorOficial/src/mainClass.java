import burgers.burger;
import burgers.xBaconBurger;
import burgers.xTudoBurger;
import burgers.xSaladaBurger;
import extras.baconExtras;
import extras.carneExtras;
import extras.extrasDecorator;

public class mainClass {
    public static void main(String[] args) {
        burger XBacon = new xBaconBurger();
        // Dessa maneira podemos adicionar um extra de Carne para o XBacon defenido anteriormente
        burger XBaconExtraCarne = new carneExtras(XBacon);
        // Dessa maneira podemos adicionar um extra de Bacon para o XBaconExtraCarne defenido anteriormente
        burger XBaconExtraCarneExtraBacon = new baconExtras(XBaconExtraCarne);

        // Prints em Java kkkk
        System.out.println(XBacon.getIngredientes() + " " + XBacon.preco());
        System.out.println(XBaconExtraCarne.getIngredientes() + " " + XBaconExtraCarne.preco());
        System.out.println(XBaconExtraCarneExtraBacon.getIngredientes() + " " + XBaconExtraCarneExtraBacon.preco());
    }
}
//