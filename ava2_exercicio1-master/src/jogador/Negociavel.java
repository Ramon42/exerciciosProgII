/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogador;

/**
 *
 * @author ronaldo
 */
public interface Negociavel {
    
    /**
     * Negocia uma proposta para um jogador.
     * @param oferta
     * @return 
     */
    boolean negociar(float oferta);
    
}
