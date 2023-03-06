/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_calculos_geometricos;

/**
 *
 * @author invitado
 */
public class Geometria {
    //Constantes
    public static final double PI = 3.1416;
    
    //Perimetro de un circulo
    public static double perimetroCirculo(double radio){
        return PI * (radio * 2);      
    }
    
    public static double areaCirculo(double radio){
        return PI * (radio * radio);
    }
    //Volumen de una esfera
    public static double volumenCirculo(double radio){
        return (4.0 / 3.0) * (PI *(radio * radio * radio));
    }
    
}
