public class Student {
    String name;
    Integer level;
    String gender;

    public Student(String name, Integer level, String gender) {
        this.name = name;
        this.level = level;
        this.gender = gender;
    }

    public void my_data() {
        System.out.println("Name  : " + name + "\n Gender  : " + gender + "\n Level  : " + level);
    }

}
