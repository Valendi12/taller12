package ZOOLOGICO.Trabajo2;

public class Leon extends Mamifero {
    private boolean melena;

    public Leon(String nombre, int edad, String especie, String tipoPelaje, boolean melena) {
        super(nombre, edad, especie, tipoPelaje);
        this.melena = melena;
    }

    public void rugir() {
        System.out.println(getNombre() + " está rugiendo");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " :Rooooar");
    }
}

