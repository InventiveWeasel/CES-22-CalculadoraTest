/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorwithtests;

import java.awt.Point;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ana Cuder
 */
public class CalculatorEngineTest {
    
    public CalculatorEngineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of initialize method, of class CalculatorEngine.
     */
    @Test
    public void testInitialize() {
        System.out.println("initialize");
        CalculatorEngine instance = new CalculatorEngine();
        instance.initialize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class CalculatorEngine.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent event = null;
        CalculatorEngine instance = new CalculatorEngine();
        instance.actionPerformed(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CalculatorEngine.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int x = 0;
        CalculatorEngine instance = new CalculatorEngine();
        instance.insert(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getButtonLocation method, of class CalculatorEngine.
     */
    @Test
    public void testGetButtonLocation() {
        System.out.println("getButtonLocation");
        JButton b = null;
        CalculatorEngine instance = new CalculatorEngine();
        Point expResult = null;
        Point result = instance.getButtonLocation(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class CalculatorEngine.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        CalculatorEngine instance = new CalculatorEngine();
        double expResult = 0.0;
        double result = instance.getValue();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
