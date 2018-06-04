package trivial;

import javax.swing.JOptionPane;

/**
 * Clase JuegoTrivial
 * @author javpin
 */
public class JuegoTrivial {

    int npreguntas;
    int njugadores;
    String cat;
    Pregunta preguntas[] = new Pregunta[0];
    int acertadas[];
    int jugadoractual = 0;
    int preguntaactual = 0;

    /**
     * Constructor de la clase
     * @param numerojugadores Número de jugadores seleccionados
     * @param categoria Categoría seleccionada
     * @param numerodepreguntas Número de preguntas seleccionadas
     * @throws Exception Controlamos alguna excepcion por categoría desconocida
     */
    public JuegoTrivial(int numerojugadores, String categoria, int numerodepreguntas) throws Exception {

        njugadores = numerojugadores;
        cat = categoria;
        npreguntas = numerodepreguntas;
        ApiManager am = new ApiManager();

        if (cat.equals("Musica")) {
            preguntas = am.damePreguntasmusica(npreguntas * njugadores);
        } else if (cat.equals("Peliculas")) {
            preguntas = am.damePreguntaspeliculas(npreguntas * njugadores);
        } else if (cat.equals("Libros")) {
            preguntas = am.damePreguntaslibros(npreguntas * njugadores);
        } else {
            
            //Se para el programa; no continua
            throw new Exception("Categoría desconocida");
        }
        for(int i=0;i<preguntas.length;i++){
            preguntas[i].imprimePregunta();
        }

        acertadas = new int[4];
        for (int i = 0; i < 4; i++) {
            acertadas[i] = 0;
        }

    }

    /**
     * Obtiene jugador actual
     * @return Devuelve jugador actual
     */
    public int getjugadoractual() {

        return jugadoractual;
    }

    /**
     * Obtiene número de pregunta actual, la que tiene que contestar el jugador
     * @return Devuelve el número de pregunta
     */
    public int getnumpreguntaactual() {

        return preguntaactual;
    }

    /**
     * Obtiene pregunta actual, la que tiene que contestar el jugador
     * @return Devuelve la pregunta
     */
    public Pregunta getpreguntaactual() {
        return preguntas[(jugadoractual * npreguntas) + preguntaactual];
    }

    /**
     * Obtiene el número de preguntas acertadas
     * @return Devuelve las preguntas acertadas de los jugadores
     */
    public int[] getpuntuaciones() {
        return acertadas;
    }

    /**
     * Comprueba si la respuesta es correcta
     * @param respuestaelegida Respuesta elegida por el jugador
     * @return 
     */
    public boolean comprobarrespuesta(String respuestaelegida) {
        boolean correcta=false;
        if (respuestaelegida.equals(getpreguntaactual().getRespuestas()[0])) {
            acertadas[jugadoractual]++;
            correcta=true;
        }
        
        jugadoractual = jugadoractual + 1;
        if (jugadoractual >= njugadores) {
            preguntaactual = preguntaactual + 1;
            jugadoractual = 0;
        }
        
        return correcta;
    }

    /**
     * Comprueba si ha finalizado el juego
     * @return Devuelve si ha finalizado el juego
     */
    public boolean hafinalizado() {
        if (preguntaactual >= npreguntas) {
            return true;
        }
        return false;
    }

    /**
     * Comprueba quien ha ganado
     * @return Los ganadores
     */
    public boolean[] getquienhaganado() {
        
        //Creamos vector boolean inicializado a false
        boolean ganador[] = new boolean[njugadores];
        for (int i = 0; i < njugadores; i++) {
            ganador[i] = false;
        }
        
        //Buscamos puntuacion máxima
        int maximapuntuacion=-1;
        for (int i = 0; i < njugadores; i++) {
            if(acertadas[i]>=maximapuntuacion){
                maximapuntuacion=acertadas[i];
            }
        }

        for (int i = 0; i < njugadores; i++) {
            if(maximapuntuacion==acertadas[i]){
                ganador[i]=true;
            }
        }
        return ganador;
    }

}
