import org.testng.annotations.Test;

import java.util.Scanner;

import static org.testng.Assert.*;



/**
 * @vuyani.mkhenku@yahoo.com
 *Tests the Constructor Username initials the variables
 * param name
 * param surname
 * param age
 * Tests the Consructor CheckAge checks if the user's age is less then 34
 * and else if username is greater than 34
 * Tests  for all the variables
 */
public class UsernameTest {

    @Test
    public void testGetName() {
        Username username = new Username("vuyani", "mkhenku", 44);

        assertEquals("vuyani", "vuyani",username.getName());
    }

    @Test
    public void testGetSurname() {
        Username username = new Username("vuyani", "mkhenku", 44);
        assertEquals("mkhenku", "mkhenku", username.getSurname());
    }

    @Test
    public void testGetAge() {
        Username username = new Username("vuyani", "mkhenku", 44);
        assertEquals(44, 44, username.getName());
    }


    @Test
    public void testCheckAge() {
        Username username = new Username("vuuu", "mkhenku", 34);
        if (username.getAge() <= 34) {
            assertEquals(34, username.getAge());
            System.out.println("Welcome to Don't blink production application stage.");
        } else {
            if (username.getAge() >= 34) {
                assertEquals(34, username.getAge());
                System.out.println("Sorry the age inserted does not qualify to join or apply for the Post.");


            }
        }
    }
    @Test
    public void testCheckAgeGreater() {
        Username username = new Username("vuuu","mkhenku",35);
        if (username.getAge() >= 34) {
            assertEquals(35, username.getAge());
            System.out.println("Sorry the age inserted does not qualify to join or apply for the Post.");
        }else {
            if(username.getAge() <= 34);
            System.out.println("Welcome to Don't blink production application stage.");

        }

    }


}