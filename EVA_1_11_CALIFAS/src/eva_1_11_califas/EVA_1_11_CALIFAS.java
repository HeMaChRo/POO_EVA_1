/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_1_11_califas;

/**
 *
 * @author invitado
 */
public class EVA_1_11_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calificar(91));
    }
    
    public static char calificar(int califa){
        char calif = 'N';
        if(califa > 90 && califa <= 100){
            calif = 'A';
        }else if(califa > 80 && califa <= 90){
            calif = 'B';
        }else if(califa > 70 && califa <= 80){
            calif = 'C';
        }else if(califa <= 70 ){
            calif = 'D';
        }
    
        return calif;
    }
    
}
