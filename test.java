package IngrydProject;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       // ProjectOne.createTable();
       // ProjectOne.populateTable();
     /*   Scanner scanner = new Scanner(System.in);
        try {

            System.out.println("WELCOME TO INGRYD ACADEMY");
            System.out.println("What is your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter in your email address: ");
            String email = scanner.nextLine().toLowerCase();

            System.out.println("Which city do you reside: ");
            String location = scanner.nextLine().;
            System.out.println("How old are you: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Finally what is your designation: ");
            String designation = scanner.nextLine();


        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            ;
        } finally {
            try {
                if (scanner != null) {
                    scanner.close();
                }
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }*/

        String word = "how are you doing today kayode i learnt you are good";
        System.out.println(word);

        System.out.println(word.substring(word.indexOf('k')));


       /* int i = 0;
       String[] sword = word.split(" ");
        while (sword.length > i) {
            System.out.println(sword[i] + " at "+i);
            i++;
        }
        System.out.println(i);

        String[] arr = new String[i];

        for(int j= 0; i > j; i--){
            System.out.print(sword[i - 1]+" ");
        }*/



     /*   for (String x:sword)
        {
            arr[i] = x;
            i++;
            System.out.println(x);

        }*/


       // System.out.println(Arrays.toString(arr));

    }
}

