package Trabajo2;

import java.util.ArrayList;

public class Admin extends Usuario {
    private String horarioTrabajo;

    public Admin(String nombre, int id, String password, String horarioTrabajo) {
        super(nombre, id, password);
        this.horarioTrabajo = horarioTrabajo;
    }

    public void registrarAnimal(ArrayList<Animal> animales, Animal animal) {
        animales.add(animal);
        System.out.println("Administrador registró al animal: " + animal.getNombre());
    }

    public void eliminarAnimal(ArrayList<Animal> animales, Animal animal) {
        animales.remove(animal);
        System.out.println("Administrador eliminó al animal: " + animal.getNombre());
    }

   public void verListaAnimales(ArrayList<Animal> animales) {
    System.out.println("\n Lista de animales en el zoológico:");
    for (Animal a : animales) {
        String clasificacion = "";

        if (a instanceof Mamifero) {
            clasificacion = "Mamífero";
        } else if (a instanceof Reptil) {
            clasificacion = "Reptil";
        } else {
            clasificacion = "Desconocido";
        }

        System.out.println("- " + a.getNombre() + " / Clasificación: " + clasificacion + " / Especie: " + a.getEspecie());
    }
}
        }
    

