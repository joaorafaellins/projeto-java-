import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirRegistro {

    // URL de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco";
    private static final String USUARIO = "seu_usuario";
    private static final String SENHA = "sua_senha";

    public static void main(String[] args) {
        // ID do registro que você deseja excluir
        int idParaExcluir = 1;

        // Conectar ao banco de dados e excluir o registro
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            // Consulta SQL para excluir um registro
            String sql = "DELETE FROM sua_tabela WHERE id = ?";
            
            // Preparar a instrução SQL
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                // Definir o parâmetro para a instrução SQL
                stmt.setInt(1, idParaExcluir);

                // Executar a instrução
                int linhasAfetadas = stmt.executeUpdate();

                // Informar quantas linhas foram afetadas
                System.out.println("Linhas afetadas: " + linhasAfetadas);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}