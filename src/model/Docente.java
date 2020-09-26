package model;

public class Docente extends Participante {

    private final String asignatura;

    public Docente(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    @Override
    public String toString() {
        return "Docente:\n" +
               "Asignatura:" + asignatura +
                super.toString();
    }
}
