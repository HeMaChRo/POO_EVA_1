

package eva1_3_constructores;


public class EVA1_3_CONSTRUCTORES {

    
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("100", "Carlos Slim", 1200);
        
        /*cuenta1.setNombre("Carlos Slim");
        cuenta1.setSaldo(1200);
        cuenta1.setCuenta("1120122"); */
        
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta1.getNombre());
        System.out.println(cuenta1.getCuenta());
        System.out.println(cuenta1.getSaldo());
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta2.getNombre());
        System.out.println(cuenta2.getCuenta());
        System.out.println(cuenta2.getSaldo());
        
        CuentaBancaria cuenta3 = new CuentaBancaria("122313", "Jesus Banderas", 503121);
        System.out.println("DATOS DEL CLIENTE: ");
        System.out.println(cuenta3.getNombre());
        System.out.println(cuenta3.getCuenta());
        System.out.println(cuenta3.getSaldo());
        
    }
    
}
