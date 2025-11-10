package ZOOLOGICO.Trabajo2;

public class Cocodrilo extends Reptil {
    private float largo;

    public Cocodrilo(String nombre, int edad, String especie, String tipoEscamas, float largo) {
        super(nombre, edad, especie, tipoEscamas);
        this.largo = largo;
    }

    public void nadar() {
        System.out.println(getNombre() + " está nadando en el agua.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + ":¡Grrrrrr!");
    }
}

