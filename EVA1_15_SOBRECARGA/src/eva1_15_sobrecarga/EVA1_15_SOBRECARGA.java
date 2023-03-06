package eva1_15_sobrecarga;

public class EVA1_15_SOBRECARGA {
    
    public static void main(String[] args) {
        System.out.println("Suma: "+ suma(4, 9));
        System.out.println("Suma: "+ suma(4.0, 9.0));
        System.out.println("Suma: "+ suma("Hola ", "Mundo"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Suma: sin argumentos");
    }
    
    
    
}
