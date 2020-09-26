import model.Docente;
import model.Estudiante;
import model.Participante;

public class Jurado {

    private final SolicitadorDeDatos solicitadorDeDatos = new SolicitadorDeDatos();

    public void determinarGanador(){

        Estudiante estudiante = solicitadorDeDatos.solicitarInformacionEstudiante();
        Docente docente = solicitadorDeDatos.solicitarInformacionDocente();
        darVeredicto(estudiante, docente);
    }

    public void imprimirGanador(Participante participante){
        System.out.println(participante);
    }

    public void darVeredicto(Estudiante estudiante, Docente docente){

        boolean estaTerminado = false;

        while (!estaTerminado) {

            int numeroAleatorioEstudiante = estudiante.getNumeroAleatorio();
            int numeroAleatorioDocente = docente.getNumeroAleatorio();

            if (numeroAleatorioEstudiante > numeroAleatorioDocente) {
                imprimirGanador(estudiante);
                estaTerminado = true;
            } else if (numeroAleatorioEstudiante == numeroAleatorioDocente) {
                System.out.println("¡EMPATE, vuelve y juega!");
                estudiante = new Estudiante(estudiante.getNombre(), estudiante.getApellido(), estudiante.getGrupo());
                docente = new Docente(docente.getNombre(), docente.getApellido(), docente.getAsignatura());
            } else {
                imprimirGanador(docente);
                estaTerminado = true;
            }
        }
    }
}
