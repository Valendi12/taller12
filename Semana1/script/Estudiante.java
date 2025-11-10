package Semana1.script;

public class Estudiante extends Usuario {

    public String horarioClase;
    public String grupo;

    public Estudiante(String nombre, int id, String password, String horarioClase, String grupo) {
        super(nombre, id, password);
        this.horarioClase = horarioClase;
        this.grupo = grupo;
    }

    public void subirTrabajos() {
        System.out.println("Estudiante esta subiendo trabajos...");
    }

    public void actualizarInformacion() {
        System.out.println("Estudiante esta actualizando información del estudiante...");
    }
}


