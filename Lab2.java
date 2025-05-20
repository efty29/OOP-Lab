 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sz= in.nextInt();
        System.out.println("Enter array size: ");
        int arr[] = new int[sz];
        int s=0;
        System.out.println("enter value ");
        for( int  x:arr)
        {
            x= in.nextInt();

            s+=x;

        }

        System.out.println("total "+s);


        Circle c = new Circle();
        Scanner cc =new Scanner(System.in);
        System.out.println("Enter Radius: ");

        c.rad = cc.nextInt();
        c.dd();
        Scanner sc =new Scanner(System.in);

        Student s1 =new Student();
        System.out.println("Enter your name: ");
        s1.name =sc.next();

        System.out.println("Enter your ID: ");
        s1.id =sc.nextInt();

        System.out.println("Enter your cgpa: ");
        s1.cg =sc.nextFloat();

        s1.display();

         s1.insert("Jahid",13,3.9f);
        s1.display();
        System.out.println(s1.getCg());
        Student s2 = new Student();
        s2.name="FFF";
        s2.id=55;
        s2.cg=4.7f;
        s2.display();
        Teacher t1 = new Teacher();
       t1.display();
    }
}


//first class
public class Circle {
    int rad;
    void dd(){
        double area =Math.PI *rad * rad;

        System.out.println("Area : "+area);
    }
}

//second class

public class Student {
    String name;
    int id;
    float cg;
    void display()
    {
        System.out.println("\nName is "+name+"\nID is "+id+"\nCGPA "+cg);
    }
    void insert(String name,int id, float cg)
    {
        this.name=name;
        this.id=id;
        this.cg=cg;

    }
    float getCg(){
        return this.cg;
    }
}

//third class

public class Teacher {
    String name;
    int id;
    float sal;
    void display()
    {
        System.out.println("\nName is "+name+"\nID "+id+"\nSallery "+sal);
    }
    void insert(String name,int id, float sal)
    {
        this.name=name;
        this.id=id;
        this.sal=sal;

    }
    float getSal(){
        return this.sal;
    }
    void setSal()
    {
        sal=1000;
    }
}
