import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ManipularCSV {

    private BufferedReader Lector; // Lee el archivo
    private String linea; // recibe la linea de cada fila
    public Map<Elementos, Double> tipoReceptor;
    public Map<Elementos, Map<Elementos, Double>> efectividad;

    public Map<Elementos, Map<Elementos, Double>> cargarEfectividadesElementos(String nombreArchivo) {

        try {
            BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo));

            Map<Elementos, Double> receptores = new HashMap<Elementos, Double>();
            Map<Elementos, Map<Elementos, Double>> atacantes = new HashMap<Elementos, Map<Elementos, Double>>();
            Integer i = 0;

            while ((linea = lector.readLine()) != null) {
                String[] valores = linea.split(",");
                for (Elementos elem : Elementos.values()) {
                    int posicion = elem.ordinal();
                    String valor = valores[posicion];
                    Double doble = Double.parseDouble(valor);
                    receptores.put(elem, doble);
                }
                Elementos ataca = Elementos.values()[i];
                atacantes.put(ataca, receptores);
                i += 1;
                receptores = new HashMap<Elementos, Double>();
            }
            lector.close();
            linea = null;
            return atacantes;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

}