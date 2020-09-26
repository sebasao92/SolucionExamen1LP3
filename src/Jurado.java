public class Jurado {

    private final SolicitadorDeDatos solicitadorDeDatos = new SolicitadorDeDatos();

    public void determinarGanador(){

        Estudiante estudiante = solicitadorDeDatos.solicitarInformacionEstudiante();;
        Docente docente = solicitadorDeDatos.solicitarInformacionDocente();
        darVeredicto(estudiante, docente);
    }

    public void imprimirGanador(Participante participante){
        System.out.println(participante);
    }

    public void darVeredicto(Estudiante estudiante, Docente docente){

        boolean estaTerminado = false;

        while (!estaTerminado) {
            if (estudiante.getNumeroAleatorio() > docente.getNumeroAleatorio()) {
                imprimirGanador(estudiante);
                estaTerminado = true;
            } else if (estudiante.getNumeroAleatorio() == docente.getNumeroAleatorio()) {
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
