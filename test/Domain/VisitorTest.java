/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jx
 */
public class VisitorTest {
    
    public VisitorTest() {
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
     * Test of getName method, of class Visitor.
     * the type is "Student"
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Visitor instance = new Visitor("Student");
        String expResult = "Student";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getName method, of class Visitor.
     * the type is "Business Person" with space in the String
     */
    @Test
    public void testGetName2() {
        System.out.println("getName");
        Visitor instance = new Visitor("Business Person");
        String expResult = "Business Person";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
        /**
     * Test of getName method, of class Visitor.
     * the type is "Others" which is illegal in this program 
     */
    @Test
    public void testGetName3() {
        System.out.println("getName");
        Visitor instance = new Visitor("Others");
        String expResult = "Others";
        String result = instance.getName();
        if (expResult == result){
            fail("The illegal type of visitor!");
        };
    }

    
}
