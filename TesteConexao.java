import java.sql.Connection;
import java.sql.DriverManager;
public class TesteConexao{
    public static void main(String[] args) {
        try{
            Connection conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/20221_usjt_psc_quinta_pessoas",
                "root",
                "1234"
            );
            System.out.println("Conexão OK");

        }
        catch (Exception e){
            System.out.println("Conexão NOK");
            e.printStackTrace();
        }




    }
}