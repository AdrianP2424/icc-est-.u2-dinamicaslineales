import java.util.ArrayDeque;

public class Ejercicio2 {


    public boolean esPalindromo(String texto) {
        // Validación básica por seguridad
        if (texto == null) {
            return false;
        }

        // Para evitar problemas con mayúsculas/minúsculas (ej: "Radar")
        String textoNormalizado = texto.toLowerCase();

        // 1. Crear una pila de caracteres.
        ArrayDeque<Character> pila = new ArrayDeque<>();

        // 2 y 3. Recorrer el texto y colocar cada carácter en la pila.
        for (char letra : textoNormalizado.toCharArray()) {
            pila.push(letra);
        }

        // 4. Sacar los caracteres de la pila para formar el texto invertido.
        StringBuilder invertido = new StringBuilder();
        while (!pila.isEmpty()) {
            invertido.append(pila.pop());
        }

        // 5, 6 y 7. Comparar el texto original con el invertido.
        return textoNormalizado.equals(invertido.toString());
    }
}