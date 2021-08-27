import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StringCalculatorTest {
    @Test
    void testInput(){
        StringCalculator calculator=new StringCalculator();
        assertEquals(0,calculator.add(""));
        assertEquals(1,calculator.add("1"));
        assertEquals(3,calculator.add("1,2"));
        assertEquals(11+22+33+44,calculator.add("11,22,33,44"));
        assertEquals(1+2+3,calculator.add("1\n2,3"));
        assertEquals(1+2,calculator.add("//;\n1;2"));
    }
}
