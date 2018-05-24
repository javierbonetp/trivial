package trivial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author javpin
 */
public class Pregunta {

    public static String pregunta = "";
    public static String respuestas[] = {"", "", "", ""};
    //public static String preguntas[] = {"", "", "", ""};

    //public String[] leepreguntas() {
    //    return preguntas;
    //}

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public void imprimePregunta() {
        System.out.println("P:" + pregunta);
        System.out.println("R1:" + respuestas[2]);
        System.out.println("R2:" + respuestas[3]);
        System.out.println("R3:" + respuestas[0]);
        System.out.println("R4:" + respuestas[1]);
    }

}
