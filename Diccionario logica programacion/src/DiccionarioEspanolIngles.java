import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class DiccionarioEspanolIngles {
    public static void main(String[] args) {
        // palabras
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("río", "river");
        diccionario.put("montaña", "mountain");
        diccionario.put("cielo", "sky");
        diccionario.put("mar", "sea");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("flor", "flower");
        diccionario.put("hoja", "leaf");
        diccionario.put("raíz", "root");
        diccionario.put("piedra", "stone");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("aire", "air");

        //
        ArrayList<String> palabras = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabras);

        // Escoger 5 palabras al azar
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("¿Cuál es la traducción al inglés de la palabra '" + palabras.get(i) + "'?");
            String traduccion = scanner.nextLine().trim();
            if (traduccion.equalsIgnoreCase(diccionario.get(palabras.get(i)))) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era '" + diccionario.get(palabras.get(i)) + "'.");
            }
        }

        // Mostrar el resultado
        System.out.println("Has respondido correctamente a " + correctas + " de 5 palabras.");
    }
}

