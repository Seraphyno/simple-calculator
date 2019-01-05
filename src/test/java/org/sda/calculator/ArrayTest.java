package org.sda.calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.Test;

public class ArrayTest {
    
    public String[] strings = {"abc", "cde", "efg"};
    
    
    @Test
    public void testArray() {
        assertThat(strings)
                .hasSize(3)
                .contains("abc")
                .doesNotContain("xyz");
    }
}
