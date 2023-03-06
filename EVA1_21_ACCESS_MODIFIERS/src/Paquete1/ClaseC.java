
package Paquete1;

import Paquete2.ClaseE;

public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        
        ClaseB objB = new ClaseB();
        //objB.publicB;
        //objB.defaultB;
    
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
        //ClaseF esta en otro paquete y es default
        //ClaseF objF = new ClaseF();
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
}
