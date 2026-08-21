
package trabajopractico2;

import java.util.Scanner;


public class OrniVerde extends Castor implements MamaPata {
    
    private double pico;
    private double patas;
    private String nombre;
    
    public OrniVerde(String nombre,double longitudCola, double velocidad) {
        super(longitudCola, velocidad);
        this.nombre=nombre;
        this.pico=6.8;
        this.patas=7.5;
    }

    public double getPico() {
        return pico;
    }

    public void setPico(double pico) {
        this.pico = pico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPatas() {
        return patas;
    }

    public void setPatas(double patas) {
        this.patas = patas;
    }

    
    @Override
    public void tocarOrgano() {
        Scanner leer = new Scanner (System.in);
        System.out.println("DO-RE-MI");
        System.out.println("Precione Enter para continuar...");
        leer.nextLine();
        System.out.println("FA-SOL-LA-SI");
    }
    
    public void tocarGuitorgan(){
        System.out.println(nombre + " toca Guitorgan");
        super.tocarGuitarra();
        tocarOrgano();
        System.out.println("Cuac cuac");
    }
    
}
