package org.sda.calculator;

public class Calculator {
    
    int count = 0;
    
    public int add(int x, int y) {
        output("In interiorul metodei 'add'");
        count++;
        return x + y;
    }
    
    public int subtract(int x, int y) {
        output("In interiorul metodei 'subtract'");
        return x - y;
    }
    
    void output(String message) {
        System.out.println(message);
    }
}
