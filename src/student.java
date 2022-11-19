public class student {

    String name;
    int id;
    int age;
    int marks;

     student(){

    }
     student(String name , int id , int  age , int marks){
        this.name = name;
        this.id = id;
        this.age = age;
        this.marks = marks;

    }

    char Grading(){

        if(this.marks>80)
            return 'A';
        else if(marks<=80&&this.marks>70)
            return 'B';
       else if(marks<=70 && this.marks> 60)
            return 'C';
        else
            return 'F';


    }
}
