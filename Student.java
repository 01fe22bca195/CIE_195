class Student extends Course{
    String name="Ranjita";
    String program="BCA";
    String sem="4th";
    public String RegisteredCourse[]={"","C#","AS","Java"};

    public void display(){
        System.out.print("Student Details\n");
        System.out.print("Name:"+name);
        System.out.print("\nProgram:"+program);
        System.out.print("\nSemester:"+sem);
        System.out.print("\nRegistered Courses\n");
        for(int i=1; i<=3; i++){
            System.out.print(i+" "+RegisteredCourse[i]+"\n");
        }
    }

    public static void main(String[] args){
        Student s = new Student();
        s.display();
        s. displayCourse();
        s.courseMarks();
    }
}