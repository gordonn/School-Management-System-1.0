import java.util.ArrayList;

public class Teacher extends Person {
    int employeeID;
    public ArrayList<String> subjectsTaught = new ArrayList<>();

    public Teacher(String name, int age, String address, int ID, ArrayList<String> subjects) {
        super(name, age, address);
        employeeID = ID;
        subjectsTaught = subjects;
    }

    public void addSubject(String subjectName) {
        subjectsTaught.add(subjectName);
    }

    public void removeSubject(String subjectName) {
        subjectsTaught.remove(subjectName);
    }

    @Override
    public String toString() {
        return  personName + "is a teacher who has a employeeID #" + employeeID + ", there subjects taught are "
                + subjectsTaught.toString() + ", there age is " + personAge + " and there address is " + personAddress;
    }
}
