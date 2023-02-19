
package com.mycompany.eva1_6_automovil;


public class EVA1_6_AUTOMOVIL {

    public static void main(String[] args) {
        
        Automovil auto1 = new Automovil("Chevrolet", "Silverado", "E751A2", 1997, "Manuel Ruiz");
        auto1.calcularAdeudo();
        auto1.imprimirDatos();
        
        Automovil auto2 = new Automovil();
        auto2.setMarca("Ford");
        auto2.setModelo("Windstar");
        auto2.setPlacas("E23H12");
        auto2.setAño(2001);
        auto2.setDueño("Carlos R");
        auto2.calcularAdeudo();
        auto2.imprimirDatos();
    }
}
