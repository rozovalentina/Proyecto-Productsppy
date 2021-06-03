package grupo7.poo.servicioAdicional;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class ServicioAdicional { // clase abstracta de bonoregalo y envioPrima

    //Atributos
    protected long codigoServicio; //para que los hijos tengan acceso
    protected String nombreServicio;
    protected double precio;

    //Constructores
    public ServicioAdicional(
            long codigoServicio,
            String nombreServicio,
            double precio
    ) {
        this.codigoServicio = codigoServicio;
        this.nombreServicio = nombreServicio;
        this.precio = precio;
    }

    public ServicioAdicional(long codigoServicio, double precio) {
        this.codigoServicio = codigoServicio;
        this.precio = precio;
    }

    //Constructor por defecto requerido por JAXB
    public ServicioAdicional() {
    }

    //Getters y Setters
    public long getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(long codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getWhatType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Servicio: " + '\n' +
                       "\tCódigo del servicio: \t" + this.codigoServicio + '\n' +
                       "\tNombre del servicio: \t" + this.nombreServicio + '\n' +
                       "\tPrecio: \t" + this.precio;
    }

    //Métodos abstractos
    public abstract double calcularPrecio();
}
