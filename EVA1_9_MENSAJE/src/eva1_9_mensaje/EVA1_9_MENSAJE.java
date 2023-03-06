

package eva1_9_mensaje;


public class EVA1_9_MENSAJE {

   
    public static void main(String[] args) {
        nPrintLn("Hola", 5);
    }
    public static void nPrintLn(String message, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(message);
        }
    }
    
}
