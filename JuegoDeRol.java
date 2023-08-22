public class JuegoDeRol {
    public static void main(String[] args) {
        // Crear un jugador y un enemigo
        Jugador jugador1 = new Jugador("Ale", 10, "Guerrero");
        Enemigo enemigo1 = new Enemigo("Carlos ", 5, "Orco");

        // Llamar a los métodos correspondientes
        jugador1.atacar();
        jugador1.usarHabilidadEspecial();

        enemigo1.atacar();
        enemigo1.gritar();
    }
}