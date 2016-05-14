/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorwithtests;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ana Cuder
 */
public class CalculatorEngineTest{
    
    CalculatorEngine calc = new CalculatorEngine();


    /**
     * Test of actionPerformed method, of class CalculatorEngine.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        calc.initialize();
        Point p;
        Point clr = calc.getButtonLocation(calc.clear);
        Point comma = calc.getButtonLocation(calc.comma);
        Point plus = calc.getButtonLocation(calc.plus);
        Point minus = calc.getButtonLocation(calc.minus);
        Point div = calc.getButtonLocation(calc.div);
        Point mult = calc.getButtonLocation(calc.mult);
        Point equal = calc.getButtonLocation(calc.equal);
        

        //Testando a inserção de caracteres no display
        //Testando o número 123
        p = calc.getButtonLocation(calc.one);
        botClick(p);
        p = calc.getButtonLocation(calc.two);
        botClick(p);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        assertEquals(123, calc.getValue(), 0.0001);
        //Testando 4567890
        botClick(clr);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        p = calc.getButtonLocation(calc.five);
        botClick(p);
        p = calc.getButtonLocation(calc.six);
        botClick(p);
        p = calc.getButtonLocation(calc.seven);
        botClick(p);
        p = calc.getButtonLocation(calc.eight);
        botClick(p);
        p = calc.getButtonLocation(calc.nine);
        botClick(p);
        p = calc.getButtonLocation(calc.zero);
        botClick(p);
        assertEquals(4567890, calc.getValue(), 0.0001);
        botClick(clr);
        //Testando 1,02
        p = calc.getButtonLocation(calc.one);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.zero);
        botClick(p);
        p = calc.getButtonLocation(calc.two);
        botClick(p);
        assertEquals(1.02, calc.getValue(),0.0001);
        
        //Testando a operação de soma 1,02 + 3456,34 = 3457,36
        botClick(plus);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        p = calc.getButtonLocation(calc.five);
        botClick(p);
        p = calc.getButtonLocation(calc.six);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        botClick(equal);
        assertEquals(3457.36, calc.getValue(),0.000000001);
        
        
        //Testando a operação de subtração 1,02 - 3456,34 = -3455,32
        botClick(clr);
        p = calc.getButtonLocation(calc.one);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.zero);
        botClick(p);
        p = calc.getButtonLocation(calc.two);
        botClick(p);
        botClick(minus);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        p = calc.getButtonLocation(calc.five);
        botClick(p);
        p = calc.getButtonLocation(calc.six);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        botClick(equal);
        assertEquals(-3455.32, calc.getValue(),0.000000001);
        
        
        //Testando a operacao de multiplicacao: 1,02 * 3456,34 = 3525,4668
        botClick(clr);
        p = calc.getButtonLocation(calc.one);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.zero);
        botClick(p);
        p = calc.getButtonLocation(calc.two);
        botClick(p);
        botClick(mult);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        p = calc.getButtonLocation(calc.five);
        botClick(p);
        p = calc.getButtonLocation(calc.six);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        botClick(equal);
        assertEquals(3525.4668, calc.getValue(),0.000000001);
        
        
        //Teste para a operacao de divisao: 1,02 / 3456,34 = 0,00029511
        botClick(clr);
        p = calc.getButtonLocation(calc.one);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.zero);
        botClick(p);
        p = calc.getButtonLocation(calc.two);
        botClick(p);
        botClick(div);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        p = calc.getButtonLocation(calc.five);
        botClick(p);
        p = calc.getButtonLocation(calc.six);
        botClick(p);
        botClick(comma);
        p = calc.getButtonLocation(calc.three);
        botClick(p);
        p = calc.getButtonLocation(calc.four);
        botClick(p);
        botClick(equal);
        assertEquals(0.00029511, calc.getValue(),0.000000001);
        
        System.out.println("value is " + Double.toString(calc.getValue()));
        
    }

    /*
    @Test
    public void testInsert() {
        System.out.println("insert");
        int x = 0;
        CalculatorEngine instance = new CalculatorEngine();
        instance.insert(x);
    }
    */
    
    public void botClick(Point p){
        Robot bot;
        try {
            bot = new Robot();
        } catch (AWTException ex) {
            Logger.getLogger(CalculatorEngineTest.class.getName()).log(Level.SEVERE, null, ex);
            bot = null;
        }
        bot.mouseMove(p.x,p.y);
        bot.mousePress(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
        bot.mouseRelease(InputEvent.BUTTON1_MASK);
        try{Thread.sleep(250);}catch(InterruptedException e){}
    }
    
}