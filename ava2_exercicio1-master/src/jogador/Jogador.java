package jogador;

import java.time.LocalDate;

/**
 *
 * @author ronaldo
 */
public class Jogador implements Negociavel{

    private int id;
    private float salario;
    private float valor;
    private float multa;
    private String clube;
    //data do fim do contrato
    private LocalDate fimContrato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setMulta(float multa){
        this.multa = multa;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public LocalDate getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(LocalDate fimContrato) {
        this.fimContrato = fimContrato;
    }

    @Override
    public boolean negociar(float oferta) {
        LocalDate dataAtual = LocalDate.now();
        if (dataAtual.isAfter(this.fimContrato)){
            if(oferta > this.valor){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(oferta > (this.valor + this.multa)){
                return true;
            }
            else{
                return false;
            }
            
        }
    }

    
}
