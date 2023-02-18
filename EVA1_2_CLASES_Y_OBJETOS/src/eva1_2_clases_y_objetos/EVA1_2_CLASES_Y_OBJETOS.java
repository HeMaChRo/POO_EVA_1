
package eva1_2_clases_y_objetos;


public class EVA1_2_CLASES_Y_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        /*perso1.nombre = "Hector";
        perso1.apellidos = "Chavira Robles";
        
        System.out.println(perso1.nombre + " " + perso1.apellidos);
        */
        perso1.setNombre("Héctor");
        
        perso1.setApellidos("Chavira Robles");
        
        perso1.setEdad(18);
        
        perso1.setGenero('H');
        
       /*System.out.println(perso1.getNombre()+ " " + perso1.getApellidos());
       
       System.out.println(perso1.getEdad()); 
       
       System.out.println(perso1.getGenero()); */
        
        perso1.imprimirDatos();
    }
    
}
