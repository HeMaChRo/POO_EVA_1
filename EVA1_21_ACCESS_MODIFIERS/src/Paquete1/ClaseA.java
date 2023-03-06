
package Paquete1;

import Paquete2.ClaseE;

public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        //Todas estas clases estan en paquete 1
        //Mismo paquete public y default son visibles
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //Clases del ´paquete 2
        //Todo lo que sea default es ahora invisible
        
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF --> Es default, y no es visible en otros paquetes
        //ClaseF objF = new ClaseF();
        
    }
}

class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
    
    public void prueba(){
        //Todas estas clases estan en paquete 1
        //Mismo paquete public y default son visibles
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
        
        ClaseC objC = new ClaseC();
        //objC.publicC;
        //objC.defaultC;
        
        ClaseD objD = new ClaseD();
        //objD.publicD;
        //objD.defaultD;
        
        //Clases del ´paquete 2
        //Todo lo que sea default es ahora invisible
        
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF --> Es default, y no es visible en otros paquetes
        //ClaseF objF = new ClaseF();
        
    }
    
}
