public class Main {

    public static void main(String[] args) {
        Product product = new Product (1, "laptop", "siyah", "siyah" , 5000, 6);
        product.setName("laptop");
        product.setId(1);
        product.setStockAmount(3);
        product.setPrice(5000);
        product.setDescription("asus laptop");
        product.setRenk("");

        System.out.println(product.getId());
        System.out.println(product.getStockAmount());
        System.out.println(product.getPrice());
        System.out.println(product.getDescription());
        System.out.println(product.getName());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


    }
}
