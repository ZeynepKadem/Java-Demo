import matematik.DortIslem;
import matematik.Logaritma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("adınızı giriniz:");

        String isim= scanner.nextLine();
        System.out.println("merhaba"+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(96,12);
        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();


    }
}
