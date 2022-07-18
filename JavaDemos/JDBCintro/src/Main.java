import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {

    }
    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {

            connection = helper.getConnection();
            String sql = "update city set population=100000 ,  district='Turkey' where id =?";
            statement =connection.prepareStatement(sql);
            statement.setInt(1,4082);
            /*statement.setString(1,"Düzce2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);*/
            int result = statement.executeUpdate();
            System.out.println("kayıt güncellendi.");
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);

        } finally {
            connection.close();
            statement.close();;
        }
    }
}
