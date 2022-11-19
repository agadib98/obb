public class Main {
    public static void main(String[] args) {
        //task 1
        student student1 = new student();
        student1.name = "ruhul";
        student1.id = 124235235;
        student1.age = 32;
        student1.marks = 55;
        System.out.println("student1 details");
        System.out.println("name:"+student1.name);
        System.out.println("id:"+student1.id);
        System.out.println("age:"+student1.age);
        System.out.println( "grade:"+student1.Grading());
        student student2 = new student("adib",235345,6,99);
        System.out.println("student2 details");
        System.out.println("name:"+student2.name);
        System.out.println("id:"+student2.id);
        System.out.println("age:"+student2.age);

        System.out.println( "grade:"+student2.Grading());


        //task2
        teacher teacher1 = new teacher();

        teacher1.name = "Sami Isalm ";
        teacher1.id = 23534;
        teacher1.subject ="English";
        teacher1.experience =20;
        System.out.println("Teacher1 details");
        System.out.println("name:"+teacher1.name);
        System.out.println("id:"+teacher1.id);
        System.out.println("subject:"+teacher1.subject);
        System.out.println("experience :"+teacher1.experience);
        System.out.println("salary:"+teacher1.salary());


        teacher teacher2 = new teacher("Faisal Islam",124234,"bangla",5);
        System.out.println("Teacher2 details");
        System.out.println("name:"+teacher2.name);
        System.out.println("id:"+teacher2.id);
        System.out.println("subject:"+teacher2.subject);
        System.out.println("experience :"+teacher2.experience);
        System.out.println("salary:"+teacher2.salary());

    }
}