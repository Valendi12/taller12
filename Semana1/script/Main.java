package Semana1.script;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Usuario pepito = new Usuario("Juan", 123,"hola");
        pepito.logear();
        pepito.leerNota();

        Administrador admin = new Administrador("Admin", 1, "adminpass");
        admin.logear();
        admin.crearNota();
        
        Estudiante estudiante = new Estudiante("Maria", 456, "estupass", "8:00 a.m. - 12:00 p.m.", "Grupo A");
        estudiante.logear();
        estudiante.subirTrabajos();
        estudiante.actualizarInformacion();

        Profesor profe = new Profesor("Carlos", 789, "prof123", "Matemáticas", "7:00 a.m. - 11:00 a.m.");
        profe.logear();
        profe.calificarTrabajos();
        profe.actualizarNotas();
        profe.programarClase();

    }
}
