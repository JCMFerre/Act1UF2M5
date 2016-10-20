/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myutils.MyUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
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
    
    // 5 Test edat.
}
