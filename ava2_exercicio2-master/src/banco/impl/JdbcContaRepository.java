package banco.impl;

import banco.Conexao;
import banco.ContaRepository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Conta;

/**
 *
 * @author ronaldo
 */
public class JdbcContaRepository implements ContaRepository {

    private final Connection conexao;
    
    private final String INSERT = "INSERT INTO "
            + "conta(numero, agencia, saldo)"
            + " VALUES(?,?,?);";
    private final String UPDATE = "UPDATE conta SET "
            + "saldo = ? WHERE numero = ?"
            + " AND agencia = ?";
    private final String GET = "SELECT * FROM conta"
            + " WHERE numero = ? AND agencia = ?";
    private final String LIST = "SELECT * FROM conta "
            + "WHERE agencia = ?";
     private final String DELETE = "DELETE FROM conta WHERE numero = ? AND agencia = ?";
    
    public JdbcContaRepository(){
        this.conexao = Conexao.getConexao();
    }
    
    @Override
    public void addConta(Conta conta) throws SQLException{
        PreparedStatement ps = conexao.prepareStatement(INSERT);
        ps.setInt(1, conta.getNumero());
        ps.setInt(2, conta.getAgencia());
        ps.setFloat(3, conta.getSaldo());
        ps.executeUpdate();
    }

    @Override
    public void removeConta(Conta conta) throws SQLException{
        PreparedStatement ps = conexao.prepareStatement(DELETE);
        ps.setInt(1, conta.getNumero());
        ps.setInt(2, conta.getAgencia());
        ps.executeUpdate();
    }

    @Override
    public void updateConta(Conta conta) throws SQLException{
        PreparedStatement ps = conexao.prepareStatement(UPDATE);
        ps.setFloat(1, conta.getSaldo());
        ps.setInt(2, conta.getNumero());
        ps.setInt(3, conta.getAgencia());
        ps.executeUpdate();
    }

    @Override
    public Conta get(int numero, int agencia) throws SQLException{
        PreparedStatement ps = conexao.prepareStatement(GET);
        Conta temp = new Conta();
        ps.setInt(1, numero);
        ps.setInt(2, agencia);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            temp.setNumero(rs.getInt("numero"));
            temp.setAgencia(rs.getInt("agencia"));
            temp.setSaldo(rs.getFloat("saldo"));
            
        }
        return temp;
    }

    @Override
    public ArrayList<Conta> listar(int agencia) throws SQLException{
        ArrayList<Conta> contas = new ArrayList();
        PreparedStatement ps = conexao.prepareStatement(LIST);
        ps.setInt(1, agencia);
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            Conta temp = new Conta();
            temp.setNumero(rs.getInt("numero"));
            temp.setAgencia(rs.getInt("agencia"));
            temp.setSaldo(rs.getFloat("saldo"));
            contas.add(temp);
        }
        return contas;
    }

}
