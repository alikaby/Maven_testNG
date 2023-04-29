import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    @DataProvider(name = "ageDataProvider")
    Object[][] ageDataProvider() {
        return new Object[][] {
                {12, false},
                {13, true},
                {14, true},
                {15, true},
                {16, true},
                {17, true},
                {18, true},
                {19, true},
                {20, false},
                {0, false}
        };
    }
    @Test(dataProvider = "ageDataProvider")
    public void testAge(int printAge, boolean isTeenager)
    {
        assertEquals(Person.isTeenager(printAge),isTeenager);
    }

   @Test public void testAge() {
       assertEquals(true, Person.isTeenager(18));
       assertEquals(true, Person.isTeenager(15));
       assertEquals(true, Person.isTeenager(13));
       assertEquals(false, Person.isTeenager(12));
       assertEquals(false, Person.isTeenager(4));
       assertEquals(false, Person.isTeenager(-10));
       assertEquals(false, Person.isTeenager(20));
       assertEquals(true, Person.isTeenager(19));
   }
}
