package tretyDomashka;

public interface Tire {
    public default void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
