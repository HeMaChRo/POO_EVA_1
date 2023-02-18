

package eva1_5_circulo;

public class EVA1_5_CIRCULO {

   
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(4.213);
        
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        circulo1.imprimirDatos();
        
        Circulo circulo2 = new Circulo(5.32);
        circulo2.calcularArea();
        circulo2.calcularPerimetro();
        circulo2.imprimirDatos();
                       
    }
    
}
