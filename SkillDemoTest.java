import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {

    @Test
    public void testAdd() {
        assertEquals(3, SkillDemo.add(1, 1)); //Will fail initially
    }
    
}
