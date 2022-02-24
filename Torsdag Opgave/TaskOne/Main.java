public class Main
{
	public static void main(String[] args)
	{
		//.b
		System.out.println(" ");

		//1.c
		print("hej");

		//1.d
		nameAge("Nikolaj", 24);
		
	}

	public static void print(String s)
	{
		System.out.println(s);
	}

	public static void name(String h)
	{
		System.out.println(h);
	}

	public static void nameAge(String name, int age)
	{
		System.out.println("My name is " + name +", I am " + age + " years old");
	}
}