package trivial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase que representa una pregunta trivia y sus posibles respuestas.
 * @author Javier
 */
public class Pregunta {

    /**
     * Texto de la pregunta
     */
    public String pregunta = "";
    /**
     * Vector son el texto de las respuestas
     */
    public String respuestas[] = {"", "", "", ""};

    /**
     * Devuelve la pregunta
     * @return La pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Asigna la pregunta
     * @param pregunta La pregunta
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * Devuelve el vector de respuestas
     * @return Las respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * Establece el vector de respuestas
     * @param respuestas Las respuestas
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    /**
     * Imprime por salida estandar toda la información de esta clase (preguntas y respuestas)
     */
    public void imprimePregunta() {
        System.out.println("P:" + pregunta);
        System.out.println("R1:" + respuestas[0]);
        System.out.println("R2:" + respuestas[1]);
        System.out.println("R3:" + respuestas[2]);
        System.out.println("R4:" + respuestas[3]);
    }

}
