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
        if(valor < this.conta.getSaldo()){
            this.conta.setSaldo(this.conta.getSaldo() - valor);
            return this.conta.getSaldo();
        }
        return -1;
    }
    
    /**
     * Deposita um valor na conta.
     * @param valor
     */
    public void depositar(float valor){
        this.conta.setSaldo(this.conta.getSaldo() + valor);
    }
    
    /**
     * Retorna o valor do saldo atual da conta.
     * @return 
     */
    public float consultarSaldo(){
        return this.conta.getSaldo();
    }
    
    public Conta getConta(){
        return this.conta;
    }
    public void setConta(Conta cont){
        this.conta = cont;
    }
    
}
