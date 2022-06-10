import java.sql.*;
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public void inserir(){
        nome = "Ana";
        fone = "12345678";
        email = "ana@email.com";
        try{
            Connection conexao = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/20221_usjt_psc_quinta_pessoas",
                "root",
                "1234"
            );
            System.out.println("Conexão OK");

            //1. Especificar o comando SQL
            String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?)";
            //2. Substituir os placeholders
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            //3. Executar o comando
            ps.execute();

            ps.close();
            conexao.close();

        }
        catch (Exception e){
            System.out.println("Conexão NOK");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.inserir();
    }
}
