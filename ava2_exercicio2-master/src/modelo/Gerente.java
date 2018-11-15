package modelo;

import banco.impl.JdbcContaRepository;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ronaldo
 */
public class Gerente {

    private String login;
    private String senha;
    private JdbcContaRepository cr = new JdbcContaRepository();
    /**
     * Salva os dados de uma conta no banco.
     * @param conta 
     */
    public void salvarConta(Conta conta){
        try{
            cr.addConta(conta);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * 
     * @param conta 
     */
    public void editarConta(Conta conta){
        try{
            cr.updateConta(conta);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * 
     * @param numero
     * @param agencia 
     */
    public void deletarConta(int numero, int agencia){
        Conta temp;
        try{
            temp = cr.get(numero, agencia);
            cr.removeConta(temp);
        } catch (SQLException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Main{
     public static void main (String[] args)  
     {    
        Gerente test = new Gerente();
        
        test.deletarConta(5555, 99999);
     }
}