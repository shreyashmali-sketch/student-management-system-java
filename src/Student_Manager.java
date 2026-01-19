import java.util.ArrayList;


public class Student_Manager {

        private ArrayList<Student> students =new ArrayList<>();

       // Adding Student
    public void addStudent (Student student){
        students.add(student);
        System.out.println("Student Added Succesfully");
    }
    public void viewstudents(){
        if (students.isEmpty()){
            System.out.println("No Student Available ");
            return;
        }
        for (Student s : students){
            s.displayStudent();
        }


    }
    public void deleteStudent(int id ){
        for (Student s : students){
            if (s.getId()== id){
                students.remove(s);
                System.out.println("Student Deleted Succesfully");
                return;
            }

        }
        System.out.println("Student Not found");

    }
    public void searchStudentbyname (String name ) {
        boolean found = false;

        for (Student s : students) {
            if (s.getname().equalsIgnoreCase(name)) {
                System.out.println("Student Found ");
                s.displayStudent();
                found = true;
            }

        }
        if (!found){
            System.out.println("student not found ");
            return;
        }
    }


    }






