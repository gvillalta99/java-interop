package app.test;

import me.gvillalta99.Application;

import org.junit.Test;
import static org.junit.Assert.*;

public class InteropTest {

    @Test
    public void testInteropCall() {
        Application app = new Application();
        assertEquals(app.test(), 10);
    }

    @Test
    public void testJavaCallingClojure() {
        Application app = new Application();
        String[] result = {"test-str"};

        assertEquals(app.useUtil(), result);
    }
}
