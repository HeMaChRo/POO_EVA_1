
package eva1_5_circulo;


public class Circulo {
    private double area;
    private double perimetro;
    private double radio;
    
    //regresa area y perimetro
    
    //implementar atributos get y set
    
    //radio get y set
    public double getRadio(){
        return radio;  
    }
    public void setRadio(double val){
        radio = val;  
    }
    
    public double calcularArea(){
        area = Math.PI * (radio * radio);
        
        return area;
    }
    
    public double calcularPerimetro(){
        perimetro = Math.PI * (radio * 2);
        
        return perimetro;
    }
    
    public void imprimirDatos(){
        System.out.println("\nDatos del Circulo: ");
        System.out.println("Radio: "+radio);
        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }
    
    Circulo(double rad){
        radio = rad;
    }
    
    Circulo(){
        radio = 0;
    }
    
    
    //constructor default
    //constructor con argumentos
    
    
    
    
}
