
import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joan Creus Martin
 */
public class TestJUnit {

    public TestJUnit() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // 3 Test inverteix.
    @Test
    public void testInverteix() {
        assertEquals("odnum aloH", MyUtils.inverteix("Hola mundo"));
    }

    @Test
    public void testInverteixFalse() {
        assertFalse(("caden").equals(MyUtils.inverteix("anedac")));
    }

    @Test
    public void testInverteixNull() {
        assertNull(MyUtils.inverteix(null));
    }

    // 4 Test factorial.
    @Test
    public void testFactorial() {
        assertEquals(24, MyUtils.factorial(4), 0);
    }

    @Test
    public void testFactorialTrue() {
        assertTrue(MyUtils.factorial(4) == 24);
    }

    @Test
    public void testFactorialCero() {
        assertEquals(1, MyUtils.factorial(0), 0);
    }

    @Test
    public void testFactorialNegativo() {
        assertFalse(MyUtils.factorial(-33) != -1);
    }

    // 4 Test edat.
    @Test
    public void testEdatImpossible() {
        assertEquals(-2, MyUtils.edat(30, 11, 2016), 0);
    }

    @Test
    public void testEdatCorrecte() {
        assertTrue(MyUtils.edat(20, 10, 1995) == 21);
    }

    @Test
    public void testEdatFalse() {
        assertFalse(MyUtils.edat(21, 12, 2017) != -2);
    }

    public void testEdatTrue() {
        assertTrue(MyUtils.edat(21, 2, 1800) == 150);
    }
}
