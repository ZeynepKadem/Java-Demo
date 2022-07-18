public class Main {

    public static void main(String[] args) {
        // double[] mylist = new double[4]; aynı işlemi aşağıdaki gibi de çalıştırabilirim.
        double[] mylist = {1.2, 3.4, 5.6, 4.3};

        double total = 0;
        double max = mylist[0];

        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);

        }
        System.out.println("Toplam=" + total);
        System.out.println("En Büyük=" + max);
    }
}
