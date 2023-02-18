/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_3_constructores;

public class CuentaBancaria {
    
    private double saldo;
    private String cuenta;
    private String nombre;
    
    public CuentaBancaria(String cuen, String nom, double sald){
        cuenta = cuen;
        nombre = nom;
        saldo = sald;
    }
    
    public CuentaBancaria(){
        saldo = 0.0;
        cuenta = "";
        nombre = "";
    }
    
    
    public String getNombre(){
        return nombre;  
    }
    public void setNombre(String val){
        nombre = val;  
    }
    
    
    public double getSaldo(){
        return saldo;  
    }
    public void setSaldo(double val){
        saldo = val;  
    }
    
    
    public String getCuenta(){
        return cuenta;  
    }
    public void setCuenta(String val){
        cuenta = val;  
    }
    
    
    
    
    
}
