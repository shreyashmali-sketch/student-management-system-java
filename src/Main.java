import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student_Manager manager =new Student_Manager();
        while (true){
            System.out.println(" Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. View Student ");
            System.out.println("3. Delete Student ");
            System.out.println("4. Exit");
            System.out.println("Enter Choice");
//            int choice = sc.nextInt();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1 :
                    System.out.println("Enter Id :");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter Name :");
                    String name = sc.nextLine();

                    System.out.println("Enter Age :");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.println(" Enter Course :");
                    String course = sc.nextLine();
                    Student student = new Student(id, name, age, course);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewstudents();
                    break;
                case 3:
                    System.out.println("Enter Student ID to delete");
                    int deleteId=Integer.parseInt(sc.nextLine());
                    manager.deleteStudent(deleteId);
                    break;
                case 4:
                    System.out.println("exiting ");
                    sc.close();
                    return;
                    default:
                  System.out.println("Invalid Choice ");



            }
        }

    }
}