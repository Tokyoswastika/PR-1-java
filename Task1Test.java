import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void MaxModuleElement() {
        int[] arr = new int[]{2, 6, -5, -12};
        int actual = Task1.MaxModuleElement(arr);
        int expected = 12;

        assertEquals(expected, actual);
    }

    @Test
    public void IndexLastZero() {
        int[] arr = new int[]{2, 6, -5, -12};
        try {
            int actual = Task1.IndexLastZero(arr);
            int expected = 5;

            assertEquals(expected, actual);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void SumAfter() {
        int[] arr = new int[]{2, -6, 5, -12};
        try
        {
            int actual = Task1.SumAfter(arr, Task1.IndexLastZero(arr));

            int expected = 25;

            assertEquals(expected, actual);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}