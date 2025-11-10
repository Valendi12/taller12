package ZOOLOGICO.Trabajo2;

public class Reptil extends Animal {
    private String tipoEscamas;

    public Reptil(String nombre, int edad, String especie, String tipoEscamas) {
        super(nombre, edad, especie);
        this.tipoEscamas = tipoEscamas;
    }

    public void mudarPiel() {
        System.out.println(getNombre() + " está mudando la piel.");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " (reptil) hace un sonido reptiliano.");
    }
}

