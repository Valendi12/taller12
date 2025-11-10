package Semana1.script;

public class Profesor extends Usuario {

    public String materia;
    public String horarioClase;

    public Profesor(String nombre, int id, String password, String materia, String horarioClase) {
        super(nombre, id, password); 
        this.materia = materia;
        this.horarioClase = horarioClase;
    }

    
    public void calificarTrabajos() {
        System.out.println("El profesor esta calificando trabajos de los estudiantes...");
    }

    public void actualizarNotas() {
        System.out.println("El profesor esta actualizando notas en el sistema...");
    }

    public void programarClase() {
        System.out.println("El profesor esta programando nueva clase...");
    }
}
