package modelo;

/**
 *
 * @author ronaldo
 */
public class Correntista {

    private Conta conta;
    private String nome;
    
    /**
     * Só poderá se sacar se o valor for menor que o saldo.
     * @param valor
     * @return o valor sacado
     */
    public float sacar(Float valor){
        if(valor < conta.getSaldo()){
            conta.setSaldo(conta.getSaldo() - valor);
            return conta.getSaldo();
        }
        return 0;
    }
    
    /**
     * Deposita um valor na conta.
     * @param valor
     */
    public void depositar(float valor){
        conta.setSaldo(conta.getSaldo() + valor);
    }
    
    /**
     * Retorna o valor do saldo atual da conta.
     * @return 
     */
    public float consultarSaldo(){
        return conta.getSaldo();
    }
}
