import org.junit.Assert;
import org.junit.Test;

/**
 * @author Andrii Markovych
 */
public class FibonacciTest {

    @Test
    public void fibonacciNumverTest() {
        Assert.assertEquals(FibonacciNumbers.fibonacci(1), 1);
        Assert.assertEquals(FibonacciNumbers.fibonacci(2), 1);
    }
}
