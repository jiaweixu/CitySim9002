/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author jx
 */
public class GeneratorTest {
    
    public GeneratorTest() {
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

    /**
     * Test of generateVisitorType method, of class Generator.
     * Visitor type is "Student"
     */
    @Test
    public void testGenerateVisitorType() {
        System.out.println("generateVisitorType");
        Random rn = mock(Random.class);
        String expResult = "Student";
        when(rn.nextInt(4)).thenReturn(0);
        String result = Generator.generateVisitorType(rn);
        assertEquals(expResult, result);
    }

    /**
     * Test of generateVisitorType method, of class Generator.
     * Visitor type is "Business Person"
     */
    @Test
    public void testGenerateVisitorType2() {
        System.out.println("generateVisitorType");
        Random rn = mock(Random.class);
        String expResult = "Business Person";
        when(rn.nextInt(4)).thenReturn(2);
        String result = Generator.generateVisitorType(rn);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of generateFirstLocation method, of class Generator.
     * First place is Downtown
     */
    @Test
    public void testGenerateFirstLocation() {
        System.out.println("generateFirstLocation");
        Random rn = mock(Random.class);
        String expResult = "Downtown";
        when(rn.nextInt(4)).thenReturn(3);
        String result = Generator.generateFirstLocation(rn);
        assertEquals(expResult, result);
    }

    
        /**
     * Test of generateFirstLocation method, of class Generator.
     * First place is The Cathedral of Learning
     */
    @Test
    public void testGenerateFirstLocation2() {
        System.out.println("generateFirstLocation");
        Random rn = mock(Random.class);
        String expResult = "The Cathedral of Learning";
        when(rn.nextInt(4)).thenReturn(0);
        String result = Generator.generateFirstLocation(rn);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of generateNextLocation method, of class Generator.
     * Visiting location is The Cathedral of Learning
     */
    @Test
    public void testGenerateNextLocation() {
        System.out.println("generateNextLocation");
        Random rn = mock(Random.class);
        String expResult = "The Cathedral of Learning";
        when(rn.nextInt(5)).thenReturn(0);
        String result = Generator.generateNextLocation(rn);
        assertEquals(expResult, result);
    }

     /* Test of generateNextLocation method, of class Generator.
     * Visiting location is The Point
     */
    @Test
    public void testGenerateNextLocation2() {
        System.out.println("generateNextLocation");
        Random rn = mock(Random.class);
        String expResult = "The Point";
        when(rn.nextInt(5)).thenReturn(2);
        String result = Generator.generateNextLocation(rn);
        assertEquals(expResult, result);
    }
     /* Test of generateNextLocation method, of class Generator.
     * Visitor will leave the city
     */
    
    @Test
    public void testGenerateNextLocation3() {
        System.out.println("generateNextLocation");
        Random rn = mock(Random.class);
        String expResult = "Leave";
        when(rn.nextInt(5)).thenReturn(4);
        String result = Generator.generateNextLocation(rn);
        assertEquals(expResult, result);
    } 

     /* Test of generateNextLocation method, of class Generator.
     * test location not existing, should throw an exception
     */
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testGenerateNextLocationIndexOutofBounds() {
        System.out.println("generateNextLocation");
        Random rn = mock(Random.class);
        String expResult = "Leave";
        when(rn.nextInt(5)).thenReturn(5);
        String result = Generator.generateNextLocation(rn);
        assertEquals(expResult, result);
    }     
}
