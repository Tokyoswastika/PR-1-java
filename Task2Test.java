import org.junit.Test;
import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void AVGNotPair() {
        int[] arr = new int[]{2, 3, 10};

        try
        {
            int actual = Task2.AVGNotPair(arr);
            int expected = 6;

            assertEquals(expected, actual);

        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}