package model;

public class Estudiante extends Participante {

    private final String grupo;

    public Estudiante(String nombre, String apellido, String grupo){
        super(nombre, apellido);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    @Override
    public String toString() {
        return "Estudiantes:\n" +
               " Grupo:" + grupo +
               super.toString();
    }
}
