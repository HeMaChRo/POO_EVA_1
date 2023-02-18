
package eva1_2_clases_y_objetos;


 public class Persona {
    
    //Datos --> Atributos    
     
    private String nombre;
    private String apellidos;
    private int edad;
    private char genero;
    
    //Metodos --> Comportamiento de la clase
    //Leer y escribir los atributos de la clase
    
    //Leer --> Get
    //Escribir --> Set
    
    //Modificador de acceso valor de retorno nombre del metodo(argumentos)(implementacion)
    
    public String getNombre(){
        return nombre;  
    }
    public void setNombre(String nom){
        nombre = nom;  
    }
    
    
    public String getApellidos(){
        return apellidos;  
    }  
    public void setApellidos(String apell){
        apellidos = apell;  
    }
    
    
    public int getEdad(){
        return edad;  
    }
    public void setEdad(int ed){
        edad = ed;  
    }
     
    
    public char getGenero(){
        return genero;  
    }
    public void setGenero(char gen){
        genero = gen;  
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+ nombre + " " + apellidos);
       
       System.out.println("Edad: " + edad); 
       
       System.out.println("Genero: " + genero);
    
    }
    
    
}
