public class Main {

    public static void main(String[] args) {
	   String ogrenci1="Engin";
       String ogrenci2="Derin";
       System.out.println("------------");


       String[] ogrenciler = new String[4];
       ogrenciler[0]="Engin";
       ogrenciler[1]="Derin";
       ogrenciler[2]="Salih";
       ogrenciler[3]="Zeynep";
       //ogrenciler[4]="İrem";
// out of bounds -> sınırların dısında hatası
       for(int i=0; i<ogrenciler.length; i++) {
          System.out.println(ogrenciler[i]);
          System.out.println("------");
       }
       for (String ogrenci  : ogrenciler){
          // ogrenciler dizisindeki her bir elemanı gez.
        System.out.println(ogrenci);
       }
    }



}
