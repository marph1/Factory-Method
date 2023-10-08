public class FactoryMethod {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();

        Product productA = factoryA.createProduct();
        productA.displayInfo();

        Factory factoryB = new ConcreteFactoryB();

        Product productB = factoryB.createProduct();
        productB.displayInfo();
    }
}
