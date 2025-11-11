package Trabajo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Bienvenido al Sistema del Zoológico \n");

        ArrayList<Animal> animales = new ArrayList<>();

       
        Admin admin = new Admin("Admin Laura", 1, "admin123", "8:00 - 1:00");
        Cuidador cuidador = new Cuidador("Cuidador Carlos", 2, "cuida456", "Mañana");

        admin.logearse();
        cuidador.logearse();

        
        Leon leon = new Leon("Simba", 5, "León Africano", "Denso", true);
        Elefante elefante = new Elefante("Dumbo", 10, "Elefante Asiático", "Gris", 2);
        Cocodrilo croco = new Cocodrilo("Coco", 7, "Cocodrilo del Nilo", "Dura", 4.5f);
        Iguana iguana = new Iguana("Chanel", 3, "Iguana Verde", "Fina", "Verde");

        
        admin.registrarAnimal(animales, leon);
        admin.registrarAnimal(animales, elefante);
        cuidador.registrarAnimal(animales, croco);
        cuidador.registrarAnimal(animales, iguana);

    
        admin.verListaAnimales(animales);

    
        leon.rugir();
        elefante.usarTrompa();
        croco.nadar();
        iguana.tomarSol();

        System.out.println("\nAcciones de los animales:");
        for (Animal a : animales) {
           if (a instanceof Iguana) {
             ((Iguana) a).cambiarColor("Café");
    }    else {
             a.hacerSonido();
    }
}
        }
    }


