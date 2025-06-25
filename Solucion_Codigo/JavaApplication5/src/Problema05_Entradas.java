
import java.util.ArrayList;

/**
 *Se desea gestionar la venta de entradas para un espectáculo en un teatro. 
 *El patio de butacas del teatro se divide en varias zonas, cada una identificada por su nombre. 
 * Los datos de las zonas son los mostrados en la siguiente tabla:
 * NOMBRE ZONA	NÚMERO DE LOCALIDADES	PRECIO NORMA	PRECIO ABONADO
 * Principal	200	25$	17.5$PalcoB	40	70$	40$
 * Central	400	20$	14$
 * Lateral	100	15.5$	10$
 * Para realizar la compra de una entrada, un espectador debe indicar la zona que desea y 
 * presentar al vendedor el documento que justifique que tiene algún tipo de descuento 
 * (estudiante, abonado o pensionista). El vendedor sacará la entrada del tipo apropiado y de la zona indicada,
 * en el momento de la compra se asignará a la entrada un identificador (un número entero) que permitirá la identificación 
 * de la entrada en todas las operaciones que posteriormente se desee realizar con ella.
 * Una entrada tiene como datos asociados su identificador, la zona a la que pertenece y el nombre del comprador.
 * Los precios de las entradas dependen de la zona y del tipo de entrada según lo explicado a continuación:
 * Entradas normales: su precio es el precio normal de la zona elegida sin ningún tipo de descuento.
 * Entradas reducidas (para estudiantes o pensionistas): su precio tiene una rebaja del 15% sobre el precio normal de la zona elegida.
 * Entradas abonado: su precio es el precio para abonados de la zona elegida.
 * @author erick
 */
public class Problema05_Entradas {
    public static void main(String[] args) {
        
    }
    public void menu(){
        zonas();
        
    }
    public void zonas(){
        Zona principal = new Zona("Principal", 200, 25, 17.5);
        Zona palcoB = new Zona("PalcoB", 40, 70, 40);
        Zona Central = new Zona("Central", 400, 20,14);
        Zona lateral = new Zona("Lateral", 100, 15.5, 1000);
    }
}
class Entrada{
    public Zona zona;
    public String tipo;
    public int iden;
    public String nombreComprador;
}
class Zona{
    public String nombre;
    public int numeroLocalidades;
    public double precioNormal;
    public double precioAbonado;
    public ArrayList<Entrada> entradas;

    public Zona(String nombre, int numeroLocalidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.numeroLocalidades = numeroLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }
    
}