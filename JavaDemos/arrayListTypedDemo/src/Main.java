import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> sehirler = new ArrayList<>(String);
        sehirler.add("İzmir");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Antalya");

        sehirler.remove("İstanbul");
        Collections.sort(sehirler);

        for (String sehir: sehir){
            System.out.println(sehir);
        }
    }
}
