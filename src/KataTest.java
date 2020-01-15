import static org.junit.Assert.*;

public class KataTest {

    @org.junit.Test
    public void tvRemote() {
        assertEquals(16, Kata.tvRemote("does"));
        assertEquals(23, Kata.tvRemote("your"));
        assertEquals(33, Kata.tvRemote("solution"));
        assertEquals(20, Kata.tvRemote("work"));
        assertEquals(12, Kata.tvRemote("for"));
        assertEquals(27, Kata.tvRemote("these"));
        assertEquals(25, Kata.tvRemote("words"));
    }
}