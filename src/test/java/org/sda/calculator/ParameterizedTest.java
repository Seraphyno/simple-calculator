package org.sda.calculator;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
    
    Calculator target = new Calculator();
    
    @Parameterized.Parameter(0)
    public int variabila1;
    @Parameterized.Parameter(1)
    public int variabila2;
    @Parameterized.Parameter(2)
    public int rezultatAsteptat;
    
    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(
                new Integer[][] {
                        {1, 2, 3},
                        {3, 4, 7},
                        {16, 14, 30},
                        {1, 1, 4} //pica deoarece 1 + 1 != 4
                }
        );
    }

    @Test
    public void testAdd() {
        int result = target.add(variabila1, variabila2);
        assertEquals(rezultatAsteptat, result);
    }
}
