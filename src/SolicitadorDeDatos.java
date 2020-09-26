import java.util.Scanner;

import model.Docente;
import model.Estudiante;
import model.Participante;

public class SolicitadorDeDatos {

    private final Scanner scanner = new Scanner(System.in);

    public Participante solicitarInformacionParticipante(){

        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();
        return new Participante(nombre, apellido);
    }

    public Estudiante solicitarInformacionEstudiante(){

        System.out.println("\n\nInformación Estudiante:");
        Participante participante = solicitarInformacionParticipante();
        String grupo;
        do {
            System.out.println("Ingrese el grupo:");
            grupo = scanner.nextLine();
        }while(!validarFormatoGrupo(grupo));

        return new Estudiante(participante.getNombre(), participante.getApellido(), grupo);
    }

    public Docente solicitarInformacionDocente(){

        System.out.println("\n\nInformación Docente:");
        Participante participante = solicitarInformacionParticipante();
        System.out.println("Ingrese la asignatura");
        String asignatura = scanner.nextLine();

        return new Docente(participante.getNombre(), participante.getApellido(), asignatura);
    }

    public boolean validarFormatoGrupo(String grupo){

        if(grupo.toUpperCase().matches("([1-9]|1[0-1])°[A-D]")){
            return true;
        } else {
            System.out.println("El grupo tiene un formato incorrecto");
            return false;
        }
    }
}
