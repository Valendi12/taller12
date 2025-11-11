package Trabajo2;

public class Elefante extends Mamifero {
    private int colmillos;

    public Elefante(String nombre, int edad, String especie, String tipoPelaje, int colmillos) {
        super(nombre, edad, especie, tipoPelaje);
        this.colmillos = colmillos;
    }

    public void usarTrompa() {
        System.out.println(getNombre() + " usa su trompa para beber agua.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " :¡Pawooooo!");
    }
}
