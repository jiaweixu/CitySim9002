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
public class VisitorTest2 {
    
    public VisitorTest2() {
    }
    
    private Visitor instance;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Visitor("Student");
        instance.setAttitude("Downtown");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAttitude method, of class Visitor.
     * Case: a Student is visiting Downtown, The expected
     * value is true (like)
     */
    @Test
    public void testGetAttitude() {
        System.out.println("getAttitude");
        Boolean expResult = true;
        Boolean result = instance.getAttitude();
        assertEquals(expResult, result);
    }

}
