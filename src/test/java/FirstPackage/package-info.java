package FirstPackage;
/*
 * the first package in the FirstProjectTesting
 *
 *
 *
 *
 **/
class FirstClass {

    public static void SFun()
    {
        int fg;
    }
 private  byte bt=123;
  protected String st="sds";
    /* private  static boolean bl=true;
     float fl=12.12f;
      int i=123;
      char ch=102;*/
    public byte getBt()
    {
           return bt;
    }
    public  void setBt(byte i)
    {
        if(i>18)
        {
            this.bt=i;
        }
        else {
            System.out.println("введите корректные данные");
        }

    }
    public static void main(String[] args) {
        FirstClass f= new FirstClass();
        f.setBt((byte)34);
        f.setBt((byte)11);
        System.out.println(f.bt);
    }
}







 /*class TwoClass
 {
     byte bt=123;
     String st="sds";
     boolean bl=true;
     float fl=12.12f;
     int i=123;
     char ch=102;
 }*/