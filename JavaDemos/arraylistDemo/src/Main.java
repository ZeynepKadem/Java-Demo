import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      ArrayList sayilar = new ArrayList();
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("ankara");
        //   System.out.println(sayilar.size());
        /*   System.out.println(sayilar.get(0));
             sayilar.set(0,100); //index in değerini değiştirir    (0. index 100 olsun)
             System.out.println(sayilar.get(0));
             sayilar.clear();
             sayilar.remove(0);
             System.out.println(sayilar.get(0));
*/
      for (Object i:sayilar){
          System.out.println(i);
      }


    }
}
