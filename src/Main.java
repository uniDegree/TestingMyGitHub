public class Main
{
    public static void main(String[] args)
    {
        Student student = new Student();
        System.out.println("Addition");
        System.out.println(student.addCal(5));
        System.out.println(student.addCal(7));
        System.out.println(student.addCal(8));

        System.out.println("Subtraction:");
        System.out.println(student.subCal(5));
        System.out.println(student.subCal(7));
        System.out.println(student.subCal(8));
    }
}