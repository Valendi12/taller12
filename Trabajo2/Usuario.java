package Trabajo2;

public class Usuario {
    private String nombre;
    private int id;
    private String password;

    public Usuario(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void logearse() {
        System.out.println("Usuario " + nombre + " logeado correctamente.");
    }

    }


