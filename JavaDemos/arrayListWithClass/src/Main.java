import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer zeynep = (new Customer(1,"Zeynep","Kadem"));
        customers.add(zeynep);
        customers.add((new Customer(2,"Mehmet","Büyükçelen")));
        customers.add((new Customer(3,"Zeren","Kadem")));


        customers.remove(zeynep);
        for(Customer customer:customers){
            System.out.println(customer.firstname);
        }
    }
}
