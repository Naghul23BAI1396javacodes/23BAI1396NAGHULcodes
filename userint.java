import java.util.Scanner;
public class userint {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter name age salary:");
        String name=obj.nextLine();
        int age=obj.nextInt();
        double salary=obj.nextDouble();
        System.out.println("Name:"+name);  //Getting name of the person
        System.out.println("Age:"+age);  //Getting Age of the person
        System.out.println("Salary:"+salary);  //Getting salary of the person while being a employee
    }
}
