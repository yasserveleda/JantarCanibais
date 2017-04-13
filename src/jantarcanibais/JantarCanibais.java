/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarcanibais;

/**
 *
 * @author sumatra
 */
public class JantarCanibais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int num_canibais = 2;
                
        Travessa travessa = new Travessa(10);
        
        Thread cozinheiro = new Thread( new Cozinheiro(travessa));
        cozinheiro.start();
        
        for(i=0; i<num_canibais; i++){
            Thread canibal = new Thread(new Canibal(travessa));
            canibal.start();
        }
        
    }
    
}
