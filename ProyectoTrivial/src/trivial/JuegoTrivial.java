package trivial;

import javax.swing.JOptionPane;

/**
 *
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

    public JuegoTrivial(int numerojugadores, String categoria, int numerodepreguntas) throws Exception {

        njugadores = numerojugadores;
        cat = categoria;
        npreguntas = numerodepreguntas;

        if (cat.equals("Musica")) {
            preguntas = ApiManager.damePreguntasmusica(npreguntas * njugadores);
        } else if (cat.equals("Peliculas")) {
            preguntas = ApiManager.damePreguntaspeliculas(npreguntas * njugadores);
        } else if (cat.equals("Libros")) {
            preguntas = ApiManager.damePreguntaslibros(npreguntas * njugadores);
        } else {
            
            //Se para el programa; no continua
            throw new Exception("Categoría desconocida");
        }

        acertadas = new int[njugadores];
        for (int i = 0; i < njugadores; i++) {
            acertadas[i] = 0;
        }
        
        //Prueba
        for (int i = 0; i < 4; i++) {
            acertadas[i] = 0;
        }

    }

    public int getjugadoractual() {

        return jugadoractual + 1;
    }

    public int getnumpreguntaactual() {

        return preguntaactual + 1;
    }

    public Pregunta getpreguntaactual() {
        return preguntas[(jugadoractual * 10) + preguntaactual];
    }

    public int[] getpuntuaciones() {
        return acertadas;
    }

    public boolean comprobarrespuesta(int respuesta) {
        jugadoractual = jugadoractual + 1;
        if (jugadoractual > njugadores) {
            preguntaactual = preguntaactual + 1;
            jugadoractual = 0;
        }
        if (respuesta == 3) {
            return true;
        }
        return false;
    }

    public boolean hafinalizado() {
        if (preguntaactual >= npreguntas) {
            return true;
        }
        return false;
    }

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
