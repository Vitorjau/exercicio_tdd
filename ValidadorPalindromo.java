import java.text.Normalizer;

public class ValidadorPalindromo {

    public static boolean ehPalindromo(String texto) {
        String processado = processarTexto(texto);
        return !processado.isEmpty() && processado.equals(new StringBuilder(processado).reverse().toString());
    }

    private static String processarTexto(String texto) {
        if (texto == null) {
            return "";
        }
        String normalized = Normalizer.normalize(texto, Normalizer.Form.NFD);
        String semAcentos = normalized.replaceAll("\\p{M}", "");
        String lowerCase = semAcentos.toLowerCase();
        String alfanumerico = lowerCase.replaceAll("[^a-z0-9]", "");
        return alfanumerico;
    }
}