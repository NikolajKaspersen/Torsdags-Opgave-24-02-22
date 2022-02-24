public class Datamatik
{
    public static String [] students = {"Tobias", "Christian", "Nikolaj", "Chris", "Mathilde", "Per", "Sofie", "Siri", "John", "Gustav"};



    public static void main(String[] args)
    {
        // 5.b
        getStudentName(students, 9);
        // 5.c
        int num = getIndex(students, "Christian");
        System.out.println(num);
    }
    // 5.b
    public static void getStudentName(String[] students, int s)
        {
           System.out.println(students[s]);
        }

    // 5.c
    public static int getIndex (String[] students, String p)
        {
           for(int i = 0; i < students.length-1; i++)
        {
            if (students[i]==p)
                return i;
        }
        return 0;
    }
}