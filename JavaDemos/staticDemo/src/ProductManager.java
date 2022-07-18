public class ProductManager {
    public void add(Product product){
        ProductValidator validator =new ProductValidator();
        if (validator.isValid(product)){
            System.out.println("eklendi");
        }else{
            System.out.println("eklenmedi.");
        }
        ProductValidator productValidator =new ProductValidator();
        productValidator.bisey();
    }
}
//manager sınıfları static yapılamaz

