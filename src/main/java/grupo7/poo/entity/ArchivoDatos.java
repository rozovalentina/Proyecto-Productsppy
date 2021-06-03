package grupo7.poo.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase que contiene todos los datos del programa
 */
@XmlRootElement
public class ArchivoDatos {

    public ArchivoDatos() {
        listaClientes = new HashMap<Long, Cliente>();
        listaProductos = new HashMap<UUID, Producto>();
        listaPedidos = new ArrayList<>();
    }

    //Atributos
    private Map<Long, Cliente> listaClientes;
    private Map<UUID, Producto> listaProductos;
    private ArrayList<Pedido> listaPedidos;

    //Accessors Clientes
    @XmlElementWrapper(name = "listaClientes")
    @XmlElement(name = "cliente")
    public Map<Long, Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(Map<Long, Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //Accessors Productos
    @XmlElementWrapper(name = "listaProductos")
    @XmlElement(name = "producto")
    public Map<UUID, Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(Map<UUID, Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    //Accessors Pedidos
    @XmlElementWrapper(name = "listaPedidos")
    @XmlElement(name = "pedido", type = Pedido.class)
    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
