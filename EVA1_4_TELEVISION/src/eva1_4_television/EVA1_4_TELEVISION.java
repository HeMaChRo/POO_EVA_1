/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;

/**
 *
 * @author invitado
 */
public class EVA1_4_TELEVISION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Television tele1 = new Television();
        
        tele1.cambiarEstado();
        
       
        tele1.subirVol();
        tele1.subirVol();
        tele1.subirVol();
        tele1.subirVol();
        
        tele1.bajarCanal();
        tele1.bajarCanal();
        tele1.bajarCanal();
        tele1.bajarCanal();
        tele1.bajarCanal();
        tele1.bajarCanal();
        
        tele1.subirCanal();
        tele1.subirCanal();
        tele1.subirCanal();
        
        tele1.cambiarEstado();
        
        tele1.subirCanal();
        
    }
    
}
