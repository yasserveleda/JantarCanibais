/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jantarcanibais;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sumatra
 */
public class Canibal implements Runnable{
    private Travessa travessa;
    
    Canibal(Travessa t){
        travessa = t;
    }
    
    @Override
    public void run() {
        while(true){
            try {
                if(travessa.seserve() == true){
                    /* canibal servido */
                }else{
                    /* travessa vazia, alguem tem que acordar o cozinheiro. */
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Canibal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
