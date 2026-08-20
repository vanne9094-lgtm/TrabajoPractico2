


package trabajopractico2;

public abstract class Castor {

    protected double cola;
    protected double velocidad;

    public Castor() {
    }

    public Castor(double cola, double velocidad) {
        this.cola = cola;
        this.velocidad = velocidad;
    }

    public double getCola() {
        return cola;
    }

    public void setCola(double cola) {
        this.cola = cola;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public abstract void nadar();

    public abstract void tocarGuitarra();

}
