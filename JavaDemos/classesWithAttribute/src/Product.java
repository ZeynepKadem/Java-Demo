public class Product {
    public Product( int id , String name , String description , String renk, double price , int stockAmount) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id=id;
        this.id=renk;
        this.id=name;
        this.id=description;
        this.id=price;
        this.id=stockAmount;

    }

    public Product(){

    }


    // Attribute -> özellik   Field
    private int id;
    private String name; // ---> zaten refaktörden encapsulated yapınca kendisi private yapıyor.
    private String description;
    private double price; //fiyat
    private int stockAmount; //stok adedi
    private String renk;
    private String kod;

    // getter

    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.getName().substring(0, 1) + getId();
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}



