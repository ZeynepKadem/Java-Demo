import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        /*System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));
        //concat -> birleştirme
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        //startsWith -> ne ile başlıyor?
        // endsWith -> ne ile bitiyor?

         */

        char[] karakterler = new char[5];


        mesaj.getChars(0, 5, karakterler, 0);
        //destination -> hedef
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("e"));


        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj);
        //substring-> ... dan itibaren parçala
        System.out.println(mesaj.substring(2, 4));
        // 2 den başla 4 e kadar
        // split --> bir metni belli bir karakter veya karakter dizisini alarak parçalamaya yarar.
        for (String kelime : mesaj.split("")) {
            System.out.println(kelime);
        }
        // veritabanlarında büyük küçük harf duyarlıysa
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        // trim başındaki ve sonundaki boşlukları atar.
        System.out.println(mesaj.trim());
    }
}
