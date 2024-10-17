import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int expected = 14;
        int number = this.getLocalNumber(LocalNumber);
        Assert.assertTrue("The expected number is not equal to the actual number", expected == number);
    }
}
