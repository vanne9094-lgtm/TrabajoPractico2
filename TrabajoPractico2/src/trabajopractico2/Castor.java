
package trabajopractico2;

public class Castor {

    protected double longitudCola;
    protected double velocidad;

    public Castor(double longitudCola, double velocidad) {
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    public void nadar(){
        System.out.println("El castor nada a " + velocidad + "km/h" );
    }
    
    public void tocarGuitarra(){
    for (int i = 0; i < 3; i++) {

        int numeroRandom = (int) (Math.random() * 6) + 1;

        System.out.println("toca cuerda " + numeroRandom);
    }
    }
}
