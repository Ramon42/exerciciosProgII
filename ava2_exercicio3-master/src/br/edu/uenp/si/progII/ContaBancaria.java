package br.edu.uenp.si.progII;

/**
 * @version 1
 * @author ronaldo
 */
public class ContaBancaria {

    private int numero;
    private int agencia;
    private float saldo;

    public float sacar(float valor) {
        if (this.saldo > valor) {
            this.saldo = saldo - valor;
            return valor;
        }
        return -1;
    }

    public boolean depositar(int numero,
            int agencia, float valor) {
        if (this.numero == numero
                && this.agencia == agencia) {
            saldo = saldo + valor;
            return true;
        }
        return false;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

}
