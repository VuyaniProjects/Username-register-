/**
 * @vuyani.mkhenku@yahoo.com
 * Constructor Username initials the variables
 * param name
 * param surname
 * param age
 * Consructor CheckAge checks if the user's age is less then 34
 * and else if username is greater than 34
 * Getters for all the variables
 */

public class Username {
    private String name;
    private String surname;
    private int age;

    public Username(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public int checkAge(int age){

        for (int i = 1; i <age ;i++) {
            if (i<=34){
                System.out.println("Welcome to Don't blink production application stage.");
                break;
            }else if (i>=34){
                System.out.println("Sorry the age inserted does not qualify to join or apply for the Post.");
                break;

            }
            else {
                break;


            }
        }

        return age;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }

}
