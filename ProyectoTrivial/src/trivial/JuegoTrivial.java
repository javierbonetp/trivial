package trivial;

/**
 *
 * @author javpin
 */
public class JuegoTrivial {

    int njugadores;
    String cat;
    Pregunta preguntas[] = new Pregunta[0];
    int numeropregunta;
    int acertadas;
    boolean sino;

    public JuegoTrivial(int numerojugadores, String categoria, int numerodepreguntas) {
    
        njugadores=numerojugadores;
        cat=categoria;
        numeropregunta=numerodepreguntas;

    }

    public int getjugadoractual() {

        return njugadores;
    }

    public Pregunta[] getpreguntaactual() {
        Pregunta[] preg = ApiManager.damePreguntasmusica(numeropregunta);
        return preg;
    }

    public boolean comprobarrespuesta() {

        return sino;
    }

    public int getacertadas() {

        return acertadas;
    }

}
