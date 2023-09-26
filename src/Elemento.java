enum Elementos {
    AGUA,
    BICHO,
    DRAGÓN,
    ELÉCTRICO,
    FANTASMA,
    FUEGO,
    HIELO,
    LUCHA,
    NORMAL,
    PLANTA,
    PSIQUICO,
    ROCA,
    TIERRA,
    VENENO,
    VOLADOR,
}

public class Elemento {
    public String nombre;
    public Elementos tipo;

    public Elemento(String nombre, Elementos tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Enum getTipo() {
        return tipo;
    }
}




