public class teacher {


        String name;
        int id;
        String subject;
        int experience;

         teacher(){

        }
         teacher(String name , int id , String  subject , int experience){
            this.name = name;
            this.id = id;
            this.subject = subject;
            this.experience = experience;

        }

        double salary(){

            if(experience>8)
                return 100000;
            else if(experience <=8 && experience>=7)
                return 70000;
            else if(experience<=6 && experience>= 4)
                return 50000;
            else
                return 30000;


        }
    }


