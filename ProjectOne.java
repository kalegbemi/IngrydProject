package IngrydProject;


import java.sql.*;
import java.util.Scanner;

/**
 * ProjectOne - this is a class that will create a table in a database with 2 methods
 * createTable method: this method will pass the command to create the table named project_one_table
   with 5 columns (name,email,age, location and designation)
 * populateTable method: This method utilizes a PreparedStatement to populate the database
 * Return: The integer count one method populateTable
 */
public class ProjectOne {
final static String url = "jdbc:mysql://localhost:3306/project_one";
final static String username = "root";
final static  String password = "";

static void createTable(){
    try(Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement()){
        String create = "CREATE TABLE IF NOT EXISTS project_one_table(Name Text, Email Text, Age Int, Location Text, Designation Text)";
        statement.execute(create);
    }catch (SQLException e){
        throw new RuntimeException(e);
    }
}
static int populateTable(){
    int count = 1;
    try(Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement populate = connection.prepareStatement("INSERT INTO project_one_table(Name, Email, Age, Location, Designation) VALUE(?,?,?,?,?)");
        Scanner scanner = new Scanner(System.in)){
        while (count <= 10){
            System.out.println("DATA FOR ENTITY "+count);
            System.out.println("WELCOME TO INGRYD ACADEMY");
            System.out.println("What is your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter in your email address: ");
            String email = scanner.nextLine().toLowerCase();
            System.out.println("Which city do you reside: ");
            String location = scanner.nextLine();
            System.out.println("What is your designation: ");
            String designation = scanner.nextLine();
            System.out.println("Finally how old are you: ");
            String age = scanner.nextLine();
            int age1 = Integer.parseInt(age);

            populate.setString(1,name);
            populate.setString(2,email);
            populate.setInt(3,age1);
            populate.setString(4,location);
            populate.setString(5,designation);

            populate.execute();
            if (count <=9){
                System.out.println("Thank you.\nNext person please.");
            }
            count++;
        }

    }catch (SQLException exception){
        System.out.println(exception);
    }
    return count;
}

}