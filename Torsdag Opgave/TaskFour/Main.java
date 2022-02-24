public class Main
{

    public static int arrayInt [] = {1,2,3};
    public static String [] arrayString = new String [] {"one", "two", "three"};

    public static void main(String[] args)
    {



    boolean [] arrayBoolean = new boolean [] {true, false, true, true};

    System.out.println(getSum());
    System.out.println(getAverage());
    getString(arrayString);


    }
    public static int getSum()
    {

    int getSum = 0;

    for (int i = 0; i < arrayInt.length; i++)
            getSum +=  arrayInt[i];

         return getSum;
    }
     public static int getAverage()
    {

    int getAverage = 0;

    for (int i = 0; i < arrayInt.length; i++)
            getAverage +=  arrayInt[i];

         return (getAverage/(arrayInt.length));
    }
    public static void getString (String[] arrayString)
    {

        for(int i = 0; i < arrayString.length; i++)
        {
            System.out.println(arrayString[i]);
        }
    }
}