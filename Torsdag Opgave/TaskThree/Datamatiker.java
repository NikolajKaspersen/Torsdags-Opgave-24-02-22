public class Datamatiker
{
	public static void main(String[] args)
	{
		Teacher tobias = new Teacher ("Tobias", 39, true);
		System.out.println(tobias.getName() + " " + tobias.getAge() + " " + tobias.getGender());


		Student nikolaj = new Student("Nikolaj", 24, false, 7);
		System.out.println(nikolaj.getName() + " " + nikolaj.getAge() + " " + nikolaj.getGender() + " " + nikolaj.getDatamatikerteam());
		
		Student pelle = new Student("pelle", 5, false, 7);
		System.out.println(pelle.getName() + " " + pelle.getAge() + " " + pelle.getGender() + " " + pelle.getDatamatikerteam());
	}
}