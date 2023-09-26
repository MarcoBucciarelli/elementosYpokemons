import java.nio.DoubleBuffer;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String ruta = "/home/marco/Desktop/pokemons/efectividades.csv";
        TablaElementos tabla = new TablaElementos(ruta);
        System.out.println(tabla.comparar(Elementos.BICHO, Elementos.AGUA));
    }
}