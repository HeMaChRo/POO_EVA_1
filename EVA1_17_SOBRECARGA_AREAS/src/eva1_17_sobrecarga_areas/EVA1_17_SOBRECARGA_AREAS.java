/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_sobrecarga_areas;

/**
 *
 * @author invitado
 */
public class EVA1_17_SOBRECARGA_AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Area: "+calcularArea(2));
        System.out.println("Area: "+calcularArea(2, 3));
        System.out.println("Area: "+calcularArea(2, 3, 4));
    }
    
    public static double calcularArea(double val1){
        return Math.PI *(val1 * val1);
    }
    public static double calcularArea(double val1, double val2){
        return (val1 * val2)/2.0;
    }
    public static double calcularArea(double val1, double val2, double val3){
        return val1*(val2 + val3)/2.0;
    }
    
}
