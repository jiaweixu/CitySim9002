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
import org.mockito.Mockito;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
import static org.mockito.Mockito.mock;

/**
 *
 * @author jx
 */
public class VisitorTest3 {
    
    public VisitorTest3() {
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
        instance = new Visitor("others");
        instance.setAttitude("Downtown");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAttitude method, of class Visitor.
     * Case: an unknown visitor is visiting Downtown, The expected
     * value of the attitude is null 
     */
    @Test
    public void testGetAttitude() {
        System.out.println("getAttitude");
        Boolean expResult=null;
        Boolean result = instance.getAttitude();
        assertEquals(expResult, result);
    }

}

