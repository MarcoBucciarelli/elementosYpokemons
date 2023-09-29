enum Estados {
    MUERTO,
    NORMAL,
    DORMIDO,
    PARALIZADO,
    ENVENENADO,
}

public class Pokemon {
    public String nombre;
    public String info;
    public Integer nivel;
    public Integer vida;
    private Integer velocidad;
    private Integer defensa;
    private Integer ataque;
    public Estados estado;
    public Elementos elemento;

    public Pokemon(String nombre, String info, Integer nivel, Integer velocidad, Elementos elemento) {
        this.nombre = nombre;
        this.info = info;
        this.nivel = nivel;
        this.velocidad = velocidad;
        this.elemento = elemento;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public void setDefensa(Integer defensa) {
        this.defensa = defensa;
    }

    public void setAtaque(Integer ataque) {
        this.ataque = ataque;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }

}
