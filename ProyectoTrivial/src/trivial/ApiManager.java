package trivial;



import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;
import java.util.Scanner;

public class ApiManager {

    Pregunta preguntas[];
    
    public Pregunta[] damePreguntasmusica(int npre) {
        //Categoria musica, nivel medio
        int categoria = 12;

        return damePreguntas(npre, categoria);
    }

    public Pregunta[] damePreguntaspeliculas(int npre) {

        //Categoria peliculas, nivel medio
        int categoria = 11;

        return damePreguntas(npre, categoria);

    }

    public Pregunta[] damePreguntaslibros(int npre) {

        //Categoria peliculas, nivel medio
        int categoria = 10;

        return damePreguntas(npre, categoria);

    }

    public Pregunta[] damePreguntas(int npreguntas, int categoria) {

        preguntas = new Pregunta[npreguntas];

        String salida = MiClienteREST.request("https://opentdb.com/api.php?amount=" + npreguntas + "&category=" + categoria + "&difficulty=medium&type=multiple&encode=url3986");
        //System.out.println("Salida: " + salida);
        try {
            JSONObject obj = new JSONObject(salida);
            JSONArray results = obj.getJSONArray("results");
            
            // Procesamos las preguntas
            for (int i = 0; i < results.length(); i++) {
                
                preguntas[i] = new Pregunta();
                
                // Guardamos pregunta
                JSONObject pregunta = results.getJSONObject(i);
                String preguntita = pregunta.getString("question");
                preguntas[i].setPregunta(decodifica(preguntita));

                // Guardamos respuestas correcta
                //String dif = pregunta.getString("difficulty");
                String todasrespuestas[] = new String [4];
                todasrespuestas[0] = decodifica(pregunta.getString("correct_answer"));
                
                
                // Guardamos respuestas incorrectas
                JSONArray incorrectas = pregunta.getJSONArray("incorrect_answers");

                for (int j = 0; j < incorrectas.length(); j++) {
                    todasrespuestas[j+1] = decodifica(incorrectas.getString(j));
                }
                
                preguntas[i].setRespuestas(todasrespuestas);
                
                //Este return solo devuelve en el caso de que solo muestre una pregunta
                //return preguntas;
                System.out.println("pregunta: " + i);
                preguntas[i].imprimePregunta();
            }
            return preguntas;
            
        } catch (JSONException ex) {
            Logger.getLogger(ApiManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String decodifica(String oraciones) {
        //Reemplazo el %20 por un espacio
        oraciones = oraciones.replace("%20", " ");
        //Reemplazo el %27 por un '
        oraciones = oraciones.replace("%27", "'");
        //Reemplazo el %2C por un ,
        oraciones = oraciones.replace("%2C", ",");
        //Reemplazo el %22 por un "
        oraciones = oraciones.replace("%22", "\"");
        //Reemplazo el %3F por un ?
        oraciones = oraciones.replace("%3F", "?");
        //Reemplazo el %2F por un /
        oraciones = oraciones.replace("%2F", "/");
        //Reemplazo el %28 por un (
        oraciones = oraciones.replace("%28", "( ");
        //Reemplazo el %29 por un )
        oraciones = oraciones.replace("%29", " )");
        //Reemplazo el %2B por un +
        oraciones = oraciones.replace("%2B", "+");
        //Reemplazo el %21 por un !
        oraciones = oraciones.replace("%21", "!");
        //Reemplazo el %26 por un &
        oraciones = oraciones.replace("%26", "&");
        //Reemplazo el %3A por un :
        oraciones = oraciones.replace("%3A", ":");
        //Reemplazo el %80 por un P
        oraciones = oraciones.replace("%3A", "P");
        //Reemplazo el %99 por un c
        oraciones = oraciones.replace("%3A", "c");
        //Reemplazo el %C3 por un A
        oraciones = oraciones.replace("%C3", "A");
        //Reemplazo el %A9 por un copyright
        oraciones = oraciones.replace("%A9", " copyright ");
        //Reemplazo el %E2 por un .
        oraciones = oraciones.replace("%E2", ".");
        //Reemplazo el %80 por un P
        oraciones = oraciones.replace("%80", "P");
        //Reemplazo el %9C por un Z
        oraciones = oraciones.replace("%9C", "Z");
        //Reemplazo el %9D por un |
        oraciones = oraciones.replace("%9D", "|");
        return oraciones;
    }
}
