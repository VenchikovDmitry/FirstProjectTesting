package FirstPackage;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Classtwo {

    public static void SFun() {
        int fg;
    }

    // public static  byte bt=123;
    byte bt = 123;
    protected String st = "sds";

    /* private  static boolean bl=true;
     float fl=12.12f;
      int i=123;
      char ch=102;*/
    public byte getBt() {
        return bt;
    }

    /* public static byte getBt()
     {
         return bt;
     }*/
   /* public static void setBt(byte i)
    {
        if(i>18)
        {
            bt=i;
        }
        else {
            System.out.println("введите корректные данные");
        }

    }*/
    public void setBt(byte i) {
        if (i > 18) {
            bt = i;
        } else {
            System.out.println("введите корректные данные");
        }

    }

    public static void main(String[] args) {
       /* Classtwo f= new Classtwo();
        f.setBt((byte)34);
        f.setBt((byte)11);
      //  System.out.println(f.getBt());
        System.out.println(f.getBt());*/
        //TestClass ts = new TestClass();
        // int[] a= new int[123];

/*
                                                           //Изучаем Array
        ArrayList<String> ar = new ArrayList(7);
        ar.add("asds");
        ar.add(1, null);
        ar.add(2, null);
        ar.add(3, null);
        ar.add(4, null);
        ar.add(5, "avsd");
       //ar.remove(0);
        // ar.forEach();
        for (String i: ar) {


        }
        System.out.println(ar.get(0));
        System.out.println(ar.get(5));*/

                                                                           //Изучаем HashMap (каждый элемент униальный)
       /* HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(24, "Tom");
        hashMap.put(12, "Bob");
        Set<Integer> keys = hashMap.keySet();
        // получить набор всех значений
        Collection<String> values = hashMap.values();*/
       /* for(Integer x=0; x<1; x++)
        {
            System.out.println(hashMap.keySet());
            System.out.println(hashMap.values());
        }*/



       /* for(HashMap.Entry<Integer, String> item : hashMap.entrySet()){  //перебор элементов

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }*/



    }
}

