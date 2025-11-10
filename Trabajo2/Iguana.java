package ZOOLOGICO.Trabajo2;


public class Iguana extends Reptil {
    private String color;

    public Iguana(String nombre, int edad, String especie, String tipoEscamas, String color) {
        super(nombre, edad, especie, tipoEscamas);
        this.color = color;
    }

    public void tomarSol() {
        System.out.println(getNombre() + " está tomando el sol.");
    }

    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
        System.out.println(getNombre() + " cambió de color a " + nuevoColor);
    }
}
