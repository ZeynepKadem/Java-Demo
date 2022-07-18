public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager =new CustomerManager();
        customerManager.databaseManager = new MySqlDatabaseManager(); //---> sadece burası değişecek artık.
        customerManager.getCustomers();


    }
}
