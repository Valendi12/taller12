package ZOOLOGICO.Trabajo2;

import java.util.ArrayList;

public class Cuidador extends Usuario {
    private String turno;

    public Cuidador(String nombre, int id, String password, String turno) {
        super(nombre, id, password);
        this.turno = turno;
    }

    public void alimentarAnimal(Animal animal) {
        System.out.println("El cuidador alimentó a " + animal.getNombre());
    }

    public void modificarAnimal(Animal animal, String nuevaEspecie) {
        animal.setEspecie(nuevaEspecie);
        System.out.println("El cuidador cambió la especie de " + animal.getNombre() + " a " + nuevaEspecie);
    }

    public void verListaAnimales(ArrayList<Animal> animales) {
        System.out.println("\n Animales que cuida el cuidador:");
        for (Animal a : animales) {
            System.out.println("- " + a.getNombre() + " (" + a.getEspecie() + ")");
        }
    }

    public void registrarAnimal(ArrayList<Animal> animales, Animal animal) {
        animales.add(animal);
        System.out.println("Cuidador registró al animal: " + animal.getNombre());
    }
}
