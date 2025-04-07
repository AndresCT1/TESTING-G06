package main;

public class CaesarCipherShift {
    public String caesarCipher(String message, int shift) {
        if (message == null || message.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else if (c >= 'a' && c <= 'z') {
                int shifted = ((c - 'a' + shift) % 26 + 26) % 26; // para manejar negativos
                result.append((char) ('a' + shifted));
            } else {
                return "error"; //Devuelve "error" si se encuentra cualquier otro carácter.
            }
        }

        return result.toString();
    }
}
