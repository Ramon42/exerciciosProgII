package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ronaldo
 */
public class Conexao {

    private static final String URL = "jdbc:postgresql://localhost:5432/banco";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private static Connection conexao;

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                Class.forName("org.postgresql.Driver");
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            } catch (ClassNotFoundException ex) {
                System.out.println("Falha ao carregar Driver: "
                        + ex.getMessage());
            } catch (SQLException ex) {
                System.out.println("Falha ao conectar ao banco: "
                        + ex.getMessage());
            }
        }
        return conexao;
    }
}
