package FirstTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import sun.security.rsa.RSASignature;

public class TwoTestClass {
    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void TestFun(String s1, String s2)
    {
        //System.out.println(s2+"+"+s1+"Hello, I am two test");
        System.out.println(s2);
                System.out.println(s1);
        Assertion a = new Assertion();
        boolean result=(1<23);
        a.assertTrue(!result, "тест провален");
    }
}
