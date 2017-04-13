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
public class Cozinheiro implements Runnable{
    private Travessa travessa;
    
    Cozinheiro(Travessa t){
        travessa = t;
    }
    
    @Override
    public void run() {
        while(true){
            /* Cozinheiro é acordado para encher a travessa*/
            travessa.enchetravessa();
        }
    }
    
}
