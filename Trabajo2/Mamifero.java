package ZOOLOGICO.Trabajo2;

public class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, int edad, String especie, String tipoPelaje) {
        super(nombre, edad, especie);
        this.tipoPelaje = tipoPelaje;
    }

    public void amamantar() {
        System.out.println(getNombre() + " está amamantando a sus crías.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (mamífero) hace un sonido particular.");
    }
}

