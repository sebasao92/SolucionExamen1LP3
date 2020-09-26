public class Participante {

    private final String nombre;
    private final String apellido;
    private final Integer numeroAleatorio;

    public Participante(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroAleatorio = (int) Math.round(Math.random()*5 + 1);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNumeroAleatorio() {
        return numeroAleatorio;
    }

    @Override
    public String toString() {
        return " Nombre: " +  nombre +
               " Apellido: " + apellido +
               " NumeroAleatorio: " + numeroAleatorio;
    }
}
