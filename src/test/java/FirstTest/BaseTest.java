package FirstTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileWriter;

/**
 * базовый класс для тестов   (чтобы импортировать надо нажать альт ентер )
 * контрл альт л - форматнуть код
 */
public class BaseTest {          //когда мы называем класс теста , то делаем это так, что на конце слово Test
    @BeforeTest
public static void BeforeTest()
    {

        // создаем объекты для файлов, которые находятся в каталоге
        File file2 = new File("C:\\Users\\Дмитрий\\Desktop\\тестировка\\java","Text.txt");
        System.out.println("File name: " + file2.getName());
        // получаем все вложенные объекты в каталог


        //записываем в этот файл
        try(FileWriter writer = new FileWriter("dir", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
           // writer.append('\n');
           // writer.append('E');
          //  writer.flush();
        }
        catch(Exception ex)
        {

            System.out.println(ex.getMessage());
        }
    }

    public void Firstmeth() {
        System.out.println("Действие перед тестом");
    }

    @AfterTest
    public void Twometh() {
        System.out.println("Действие после теста");
    }

    public void Threemeth() {
        System.out.println("Действие после теста");
    }

    public void Fourmeth() {
        System.out.println("Действие после теста");
    }

}
