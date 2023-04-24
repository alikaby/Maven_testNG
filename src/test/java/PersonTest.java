import org.testng.annotations.Test;

public class PersonTest {
    @Test(dataProvider = "sumDataProvider")
    public void testSum(int arg1, int arg2, int expectedSum)
    {
    }
}
