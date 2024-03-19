public class Course {

    String course[]={"C#","AS","Java"};
    int marks[]={70,100,30};

    public void displayCourse(){
       
        for(int i=0; i<=2; i++){
            System.out.print("\nCourse:"+course[i]+" Marks:"+marks[i]);
        }
    }

    public void courseMarks(){
        for(int i=0; i<=2; i++){
            if(marks[i]<40){
                System.out.print("\nless than 40 marks:"+course[i]+"Marks:"+marks[i]);

            }
        }
    }
    
}

