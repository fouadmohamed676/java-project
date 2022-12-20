import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        String name;
        Integer level;
        String gender;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter Name : ");
        name = scanner.next();
        System.out.println(" Enter Level : ");
        level = scanner.nextInt();
        System.out.println(" Enter Gender : Male , Female");
        gender = scanner.next();

        // Psotfix

        level++;

        // Prefix

        --level;

        // Assigment Opreations
        level += 2;
        // الزيادة البعدية والقبلية

        Student student = new Student(name, level, gender);
        student.my_data();
    }
}