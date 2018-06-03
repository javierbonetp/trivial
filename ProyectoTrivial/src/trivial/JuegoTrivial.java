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

    public int getjugadoractual() {

        return jugadoractual;
    }

    public int getnumpreguntaactual() {

        return preguntaactual;
    }

    public Pregunta getpreguntaactual() {
        System.out.println("Jugador actual: " + jugadoractual);
        System.out.println("Pregunta actual: " + preguntaactual);
        return preguntas[(jugadoractual * npreguntas) + preguntaactual];
    }

    public int[] getpuntuaciones() {
        return acertadas;
    }

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

    public boolean hafinalizado() {
        System.out.println("Numpreguntas: " + npreguntas);
        System.out.println("Pregunta acutual: " + preguntaactual);
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
