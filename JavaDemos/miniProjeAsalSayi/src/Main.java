public class Main {

    public static void main(String[] args) {
        // remainder -> kalan
        int number = -1;
        int remainder = number % 2;
        System.out.println(remainder);
        //isPrime --> asal mı? demek.
        boolean isPrime = true;
        if (number<2){
            System.out.println("Geçersiz sayı!");
        }
        if (number==1){
            System.out.println("Sayı asal değildir...");
            return; //bağlı bulunduğun methodu bitirir.
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }

        }
        if (isPrime) /* (isPrime==true) ile aynı */ {
            System.out.println("Sayı asaldır.");}
        else{
                System.out.println("Sayı asal değildir.");
            }


    }
}
