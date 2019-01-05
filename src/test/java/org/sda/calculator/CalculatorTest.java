package org.sda.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    
    Calculator target1 = new Calculator();
    Calculator target2;
    
   
    @Before
    public void setUp() {
        target2 = new Calculator();
        target2.count = 0;
    }
    
    @Test
    public void a_testAdd() {
        target1.add(1,1);
        target1.add(1,1);
        target2.add(2,2);
        target2.add(2,2);
    }
    
    @Test
    public void b_testAdd2() {
        target1.add(1,1);
        target2.add(2,2);
        
        System.out.println("Count: " + target1.count);
        System.out.println("Count: " + target2.count);
    }
    
    @Test
    public void subtract() {
    }
    
    @After
    public void tearDown() {
    }
}