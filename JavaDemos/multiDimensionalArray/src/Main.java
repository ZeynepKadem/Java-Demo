public class Main {

    public static void main(String[] args) {

        String[] [] sehirler = new String[3][3];
        sehirler [0][0] = "İstanbul";
        sehirler [0][1] = "İzmir";
        sehirler [0][2] = "Ankara";
        sehirler [1][0] = "Eskişehir";
        sehirler [2][0] = "Ağrı";
        sehirler [1][1] = "Muğla";
        sehirler [1][2] = "Antalya";
        sehirler [2][2] = "Bursa";
        sehirler [2][1] = "Tekirdağ";
        // nafted loop  -> iç içe döngüler
         for ( int i=0 ; i<=2 ; i++){
             System.out.println("---------");
             for (int j=0 ; j<=2 ; j++){
                 System.out.println(sehirler[i][j]);


             }

         }
    }
}
