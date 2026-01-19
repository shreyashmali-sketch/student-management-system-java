public class Student {
    private int id;
    private String name;
    private int age;
    private String course;

    //Ussing constructor here

    public Student (int id,String name, int age, String course ){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;


    }
    //we are now using getter

    public int getId() {
        return id;
    }
    public String getname (){

        return name;

    }

//    public String getName(){
//        return name;
//    }
    //

   public void displayStudent (){
       System.out.println("ID :"+ id);
       System.out.println("Name :"+name);
       System.out.println("Age :"+age);
       System.out.println("Course :"+course);
       System.out.println("..............................");

    }
}
