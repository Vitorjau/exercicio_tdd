import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {

    @Test
    void deveRetornarTrueParaPalavrasSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("ovo"));
        assertTrue(ValidadorPalindromo.ehPalindromo("12321"));
        assertTrue(ValidadorPalindromo.ehPalindromo("a"));
    }

    @Test
    void deveRetornarTrueParaFrasesComplexas() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
        assertTrue(ValidadorPalindromo.ehPalindromo("A man, a plan, a canal, Panama!"));
    }

    @Test
    void deveIgnorarMaiusculasAcentosEPontuacao() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Aérea"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Olé! Maracujá, caju, caramelo."));
    }

    @Test
    void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("Açúcar"));
        assertFalse(ValidadorPalindromo.ehPalindromo("hello"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Teste"));
    }

    @Test
    void deveRetornarFalseParaTextoVazioOuNulo() {
        assertFalse(ValidadorPalindromo.ehPalindromo(""));
        assertFalse(ValidadorPalindromo.ehPalindromo(null));
        assertFalse(ValidadorPalindromo.ehPalindromo("!@#$%^&*()"));
    }
}