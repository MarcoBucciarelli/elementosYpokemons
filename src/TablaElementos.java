import java.util.Map;

public class TablaElementos {
    public Map<Elementos, Map<Elementos, Double>> efectividades;

    public TablaElementos(String ruta) {
        ManipularCSV archivo = new ManipularCSV();
        Map<Elementos, Map<Elementos, Double>> efectividades = archivo.cargarEfectividadesElementos(ruta);
        this.efectividades = efectividades;
    }

    public Double comparar(Elementos elemento1, Elementos elemento2) {
        return efectividades.get(elemento1).get(elemento2);
    }

    public void verTabla() {
        for (Elementos atacante : efectividades.keySet()) {
            Map<Elementos, Double> defensores = efectividades.get(atacante);
            for (Elementos defensor: defensores.keySet()) {
                String mensaje = String.format("Atacante: %s, Defensor: %s, Efectividad: %.1f", atacante.name(), defensor.name(), efectividades.get(atacante).get(defensor));
                System.out.println(mensaje);
            };
        }

    }
}
