import java.util.Scanner;
/**
 * @vuyani.mkhenku@yahoo.com
 *main method that execute the code
 */

public class Run {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine().toUpperCase();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age <= 34){
            System.out.println("Welcome to Don't blink production application stage.");

        }else {
            if (age >34){
                System.out.println("Sorry the age inserted does not qualify to join or apply for the Post.");

            }
        }

        Username username   = new Username(name, surname, age);
        System.out.println("UserDetails "+username.getName()+ " " + username.getSurname()+ " age: "+username.getAge());
//        username.checkAge(age);
    }
}
