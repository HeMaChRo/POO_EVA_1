

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
