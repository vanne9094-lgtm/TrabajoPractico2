
package trabajopractico2;


public class OrniAzul extends Castor {
    
    private double propulcion;
    private String nombre;
    
    public OrniAzul(String nombre,double propulcion,double longitudCola, double velocidad) {
        super(longitudCola, velocidad);
        this.nombre=nombre;
        this.propulcion=propulcion;
    }

    public double getPropulcion() {
        return propulcion;
    }

    public void setPropulcion(double propulcion) {
        this.propulcion = propulcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void nadar() {
        double velocidadTotal= velocidad + propulcion;
        System.out.println(nombre + " nada a " + velocidadTotal + "km/h");
    }
    
    
    
}
