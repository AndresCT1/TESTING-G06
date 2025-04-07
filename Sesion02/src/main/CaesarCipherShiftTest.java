package main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherShiftTest {
    @Test
    public void testBasicPositiveShift() {
        CaesarCipherShift cipher = new CaesarCipherShift();
        assertEquals("def", cipher.caesarCipher("abc", 3));
    }
    @Test
    public void testWrapAroundZtoA() {
        CaesarCipherShift cipher = new CaesarCipherShift();
        assertEquals("abc", cipher.caesarCipher("xyz", 3));
    }
    @Test
    public void testWithSpaces() {
        CaesarCipherShift cipher = new CaesarCipherShift();
        assertEquals("def ghi", cipher.caesarCipher("abc def", 3));
    }
    @Test
    public void testNegativeShift() {
        CaesarCipherShift cipher = new CaesarCipherShift();
        assertEquals("xyz", cipher.caesarCipher("abc", -3));
    }
    @Test
    public void testInvalidCharacter() {
        CaesarCipherShift cipher = new CaesarCipherShift();
        assertEquals("error", cipher.caesarCipher("abc!", 3));
    }
}
