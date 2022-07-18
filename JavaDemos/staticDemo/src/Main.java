public class Main {

    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name="maouse";
        product.price=1000;
        manager.add(product);


    }
}
