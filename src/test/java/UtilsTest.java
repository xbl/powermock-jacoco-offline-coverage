import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

@RunWith(PowerMockRunner.class)

@PrepareForTest(Utils.class)
@PowerMockIgnore("org.jacoco.agent.rt.*")
public class UtilsTest {

    @Test
    public void testSay() throws Exception {
        PowerMockito.mockStatic(Utils.class);
        Mockito.when(Utils.say(Mockito.anyString())).thenReturn("hello:mandy");
        assertEquals("hello:mandy", Utils.say("sid"));
    }

}