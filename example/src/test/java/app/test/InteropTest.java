package app.test;

import me.gvillalta.Application;

import org.junit.Test;
import static org.junit.Assert.*;

public class InteropTest {

    @Test
    public void testInteropCall() {
        Application app = new Application();
        assertEquals(app.test(), 10);
    }
}
