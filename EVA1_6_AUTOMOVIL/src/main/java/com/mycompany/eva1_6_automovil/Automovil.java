
package com.mycompany.eva1_6_automovil;

/**
 *
 * @author Hector Chavira
 */
public class Automovil {
    
    private String marca;
    private String modelo;
    private String placas;
    private int año;
    private String dueño;
    private int adeudo;
    
    Automovil(String mar, String mod, String plac, int a, String due){
        marca = mar;
        modelo = mod;
        placas = plac;
        año = a;
        dueño = due;
    }
    
    Automovil(){
        marca = "";
        modelo = "";
        placas = "";
        año = 0;
        dueño = "";
    }
    
    
    public String getMarca(){
        return marca;  
    }
    public void setMarca(String val){
        marca = val;  
    }
    
    public String getModelo(){
        return modelo;  
    }
    public void setModelo(String val){
        modelo = val;  
    }
    
    public String getPlacas(){
        return placas;  
    }
    public void setPlacas(String val){
        placas = val;  
    }
    
    public int getAño(){
        return año;  
    }
    public void setAño(int val){
        año = val;  
    }
    
    public String getDueño(){
        return dueño;  
    }
    public void setDueño(String val){
        dueño = val;  
    }
    
    
    public int calcularAdeudo(){
        if(año <= 2000){
            adeudo = 1500;
        }else if(año > 2000 && año <= 2005){
            adeudo = 2000;
        }else if(año > 2005 && año <= 2010){
            adeudo = 2500;
        }else if(año > 2010 && año <= 2015){
            adeudo = 3000;
        }else if(año > 2015 && año <= 2023){
            adeudo = 4000;
        }
        
        return adeudo;
    }
    
    public void imprimirDatos(){
        System.out.println("\nDatos del Auto: ");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placas: "+placas);
        System.out.println("Año: "+año);
        System.out.println("Dueño: "+dueño);
        System.out.println("Adeudo: "+adeudo);
        
    }
    
}
