class Main{

  public static boolean happy = true;

public static void main(String [] args) {
   if (iAmHappy())
   {
     System.out.println("I clap my hands");
   }
   else
   {
     System.out.println("I don't clap my hands"); 
   }
   sum(5,10);
   upperCase("Hej");
   letterCase("Nikolajjuul");

}


public static boolean iAmHappy()
{
  //2.a
  // fill out what is missing here: 
  return happy;
}
public static int sum (int a, int b)
{
  //2.b
  System.out.println(a+b);
  return a+b;
}

public static String upperCase(String tmpString)
{
  //2.c
  String upperCaseString = tmpString;
  System.out.println(upperCaseString.toUpperCase());
  return upperCaseString.toUpperCase();
}
public static boolean letterCase(String tmpString)
{
  //2.d
  char charchecker = tmpString.charAt(0);
  if(Character.isUpperCase(charchecker))
  {
    System.out.print("true");
    return true;
  }
  return false;
}




}