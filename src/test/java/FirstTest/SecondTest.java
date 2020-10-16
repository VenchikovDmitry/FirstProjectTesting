package FirstTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import java.io.*;
import org.testng.asserts.Assertion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.Set;

public class SecondTest extends BaseTest{
    int i=123123;


    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    @Test
    public void AfFun() throws IOException {
        String necessarywords="Hello";
        String w=readUsingFiles("C:\\UsersДмитрий\\Desktop\\тестировка\\java");
       /* String charToString = Character.toString(ch);

        try(FileReader reader = new FileReader("Text.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
                w+=Character.toString((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }*/
      //  assert  w.contains("ll") != false : "нет такого слова";

        Assertion a = new Assertion();
       boolean result=w.contains("ll");
       a.assertTrue(result, "тест провален");
    }


}
