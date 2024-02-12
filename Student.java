import java.util.ArrayList;

public class Student extends Person {
    int studentID;
    public ArrayList<Integer> grades = new ArrayList<>();
    public ArrayList<String> courses = new ArrayList<>();

    public Student(String name, int age, String address, int ID, ArrayList<Integer> studentGrades, ArrayList<String> studentCourses) {
        super(name, age, address);
        studentID = ID;
        grades = studentGrades;
        courses = studentCourses;
    }

    public float calculateAverage() {

        float averageGrades = 0;
        for (int grade : grades) {
            averageGrades += grade;
        }

        averageGrades /= grades.size();
        return averageGrades;
    }

    public void enrollingCourse(String courseName) {
        courses.add(courseName);
    }

    @Override
    public String toString() {
        return  personName + "is a student who has a studentID #" + studentID + ", there grade average is "
                + calculateAverage() + ", there age is " + personAge + " and there address is " + personAddress;
    }
}
