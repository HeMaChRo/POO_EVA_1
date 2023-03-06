/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_static;

/**
 *
 * @author invitado
 */
public class EVA1_18_STATIC {

   
    public static void main(String[] args) {
        prueba obj = new prueba();
        obj.mensaje();
        prueba.mensajeEstatico();
       
    }
    
    
    
}

class prueba{
        
        public void mensaje(){
            System.out.println("Hola!!!");
        }
        public static void mensajeEstatico(){
            System.out.println("Hola (estatico)!!!");
        }
        
    }
    class otra{}
