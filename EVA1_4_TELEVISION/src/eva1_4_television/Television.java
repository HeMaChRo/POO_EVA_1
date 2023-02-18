/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_television;


public class Television {
    
    
    private boolean power;
    private int vol;
    private int canal;
    
    /*public Television(boolean power, int vol, int canal){
    
    }*/
    
    public Television(){
        power = false;
        vol = 0;
        canal = 5;
    }
    
    public void cambiarEstado(){
        if(power == false){
            power = true;
            System.out.println("TELEVISION ENCENDIDA");
        }else{
            power = false;
            System.out.println("TELEVISION APAGADA");
        }
    }
    
    public void subirVol(){
        if(power == true){
            if(vol < 100){
            vol++;
            System.out.println("Volumen: "+vol);
            }
        }
    }
    public void bajarVol(){
        if(power == true){
            if(vol > 0){
            vol--;
            System.out.println("Volumen: "+vol);
            }
        }
    }
    
    public void subirCanal(){
        if(power==true){
            if(canal==100){
                canal = 1;   
            }else{
                canal++;
            }
            
            System.out.println("Canal: "+canal);
        }
        //Tomandolo como si no existriera el canal "0"
    }
    public void bajarCanal(){
        if(power==true){
            if(canal==1){
                canal = 100;
            }else{
                canal--;
            }   
            System.out.println("Canal: "+canal);
        }
    }
    
    
    
}
