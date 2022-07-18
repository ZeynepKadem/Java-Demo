public class ProductValidator {
    static {
        System.out.println("st" +
                "atic yapıcı blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("yapıcı blok çalıştı");
    }
    //ürünün kurallara uygun olup olmadığını
    public boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()) {
            return true;
        }else{
            return false;

        }
    }
    public void bisey(){

    }
    public class BaskaBirClass {
        public static void Sil(){
            //inner class

        }
    }




}
