/**
 *Un videoclub dispone de una serie de películas que pueden estar en DVD (con capacidad en Gb.) 
 * o en VHS (una sola cinta por película y con cierto tipo de cinta magnetica). 
 * De las películas interesa guardar el título, el autor, el año de edición y el idioma 
 * (o los idiomas, en caso de DVD). El precio de alquiler de las películas varía en función del tipo de película. 
 * Las DVD siempre son 10% mas caras que las de VHS.
 * @author erick
 */
import java.util.ArrayList;
public class Problema02_Peliculas {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula();
        Pelicula pelicula2 = new Pelicula();
        VHS vsh1 = new VHS("Español" , pelicula1, 23);
    }
}
class SoportePelicula{
    public double precioAlqui;

    public SoportePelicula() {
    }
    
    public SoportePelicula(double precioAlqui) {
        this.precioAlqui = precioAlqui;
    }
    
}
class DVD extends SoportePelicula{
    public String idioma[];
    public ArrayList<Pelicula> pelicula;

    public DVD(String[] idioma, ArrayList<Pelicula> pelicula) {
        this.idioma = idioma;
        this.pelicula = pelicula;
    }
    
    public void calcularPrecioAlqui(){
        this.precioAlqui += (this.precioAlqui * 0.1);
    }

    @Override
    public String toString() {
        return "DVD{" + "idioma=" + idioma + ", pelicula=" + pelicula + '}';
    }
    
}
class VHS extends SoportePelicula{
    public String idioma;
    public Pelicula pelicula;

    public VHS() {
    }
    
    public VHS(String idioma, Pelicula pelicula, double precioAlq) {
        super(precioAlq);
        this.idioma = idioma;
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "VHS{" + "idioma=" + idioma + ", pelicula=" + pelicula + '}' + super.toString();
    }
    
}
class Pelicula{
    public String titulo;
    public String autor;
    public int anioEdicion;

    public Pelicula() {
    }
    
    public Pelicula(String titulo, String autor, int anioEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioEdicion = anioEdicion;
    }
    
}