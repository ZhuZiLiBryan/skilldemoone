import static org.junit.Assert.*;

import org.junit.*;

public class SkillDemoTester {
    SkillDemo sd = new SkillDemo();
    @Test 
    public void testOne() {
        assertEquals(4, sd.doubler(2));
    }    
}
