public class Main {

    public static void main(String[] args) {
        // substring bir değer return eder-döndürür.
        String mesaj ="Bugün hava çok güzel.";
        String yeniMesaj= mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = topla(15,7);
        System.out.println(sayi);
        int toplam= topla2(2,3,4,5,6,100); //arka planda bunu diziye çevirir.
        System.out.println(toplam);



    }
    public static void ekle() {
        System.out.println("ekle");

    }
    public static void sil() {
        System.out.println("silindi");
        return; //buradaki return bitir demek.

    }
    public static void guncelle() {
        System.out.println("güncellendi");
    }
    public static int topla(int sayi1 ,int sayi2){
        //bu fonksiyon int türünde bir değer döndürür.
        return sayi1+sayi2;

    }
    public static int topla2(int... sayilar){
        //... birden fazla int değeri temsil eder.(veriable argumans)
        int toplam =0;
        for (int sayi:sayilar){
            toplam=toplam+sayi;
        }
        return toplam;

    }

}
