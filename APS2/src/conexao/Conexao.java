package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * conexao
 */

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/casos_dengueabcdm";
    private static final String user = "root";
    private static final String password = "mysql";

    private static Connection conn;
    
    public static Connection getconexao(){

        try {
            
     
        if (conn == null) {
            System.out.println("Conexão sucedida!");
            conn = DriverManager.getConnection(url, user, password);
            return conn;
        }else {
            return conn;
        }
    }catch (SQLException e) {
        e.printStackTrace();
        return null;
    }
    }
}