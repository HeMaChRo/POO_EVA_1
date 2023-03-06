

package eva_1_10_return;

/**
 *
 * @author invitado
 */
public class EVA_1_10_RETURN {

    
    public static void main(String[] args) {
        int resu; 
        resu = square(3);//Llamada a funcion, pero sin procesar el resultado
        System.out.println(resu);//Llamada a funcion, almacenando el resultado
        System.out.println(square(5));
    }
    public static int square(int num){
        return num * num;
    }
    
}
