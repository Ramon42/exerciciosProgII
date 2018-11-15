package banco;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Conta;

/**
 *
 * @author ronaldo
 */
public interface ContaRepository {
    
    void addConta(Conta conta)throws SQLException;
    void removeConta(Conta conta)throws SQLException;
    void updateConta(Conta conta)throws SQLException;
    
    //retorna um objeto do tipo conta
    Conta get(int numero, int agencia)throws SQLException;
    //lista todas as contas de uma agência
    ArrayList listar(int agencia)throws SQLException;
}
