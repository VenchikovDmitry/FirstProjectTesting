package FirstTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ThreeClassTest {

    @DataProvider(name = "SetEnvironment", parallel = true)  //его можно запускать просто из IDE
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }
    @Test(dataProvider = "SetEnvironment")
    public static void Fun(String s1, String s2)
    {
        System.out.println(s2);
        System.out.println(s1);
    }

}
